use cronograma
go

alter procedure sp_encontra_usuario

@usuario		varchar(100),
@senha			char(8)

as

begin

	declare @user	varchar(100),	@passWord	char(8), @id_usuario int

	
	select @id_usuario=usuario.id,  @user=loginUsuario, @passWord=senha from usuario 
	where  UPPER(loginUsuario) = UPPER(@usuario)
	and	   senha = @senha
	
	if @user <> '' and @passWord <> '' 
	begin
		select @id_usuario [ID_USUARIO], 1 [RESULTADO]
	end
	else
	begin
		select 0 [RESULTADO]
	end
end

go