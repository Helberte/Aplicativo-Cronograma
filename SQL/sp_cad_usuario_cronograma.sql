use cronograma
go

alter procedure sp_cad_usuario_cronograma

@nome		varchar(100),
@login		varchar(100),
@senha		varchar(8)

as
begin
	
	declare @total_nome_Usuario int, @total_login_usuario int

	-- NOme
	select @total_nome_Usuario=COUNT(u.nome) from usuario u where UPPER(u.nome) = UPPER(@nome)
	-- Login
	select @total_login_usuario=COUNT(u.loginUsuario) from usuario u where UPPER(u.loginUsuario) = UPPER(@login)
		

	if @total_nome_Usuario > 0
	begin
		select 'Nome de usuário já está em uso.' [MENSAGEM], 0 [RESULTADO]
	end
	else if @total_login_usuario > 0
		begin
			select 'Login já está em uso.' [MENSAGEM], 0 [RESULTADO]
		end
	else if LEN(@senha) < 8
		begin
			select 'Sua senha precisa ter no mínimo 8 digitos.' [MENSAGEM], 0 [RESULTADO]
		end
	else
		begin
			declare @id  int

			insert into usuario (nome, loginUsuario, senha) values (@nome, @login, @senha)
					
			set @id = SCOPE_IDENTITY()

			select  @id [ID], 'Cadastro criado! Vamos ler?' [MENSAGEM], 1 [RESULTADO]
		end	
end