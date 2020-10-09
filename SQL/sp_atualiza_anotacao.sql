use cronograma
go


--exec sp_atualiza_anotacao codUsuario, fk_livro, pagina, 'titulo', 'anotacao'

alter procedure sp_atualiza_anotacao

@cod_usuario			int,
@fk_livro				int,
@pagina					int,
@titulo					varchar(100),
@anotacao				varchar(max)

as
begin

	begin try

		insert into anotacao (anotacao, 
							  pagina, 
							  tituloAnotacao, 
							  fk_anotacao_usuario, 
							  fk_anotacao_livro)
							  values (@anotacao,
									  @pagina,
									  @titulo,
									  @cod_usuario,
									  @fk_livro)

		select 1 [RESULTADO]
	end try
	begin catch
		select 0 [RESULTADO]
	end catch
end