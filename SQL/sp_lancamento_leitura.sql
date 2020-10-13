use cronograma
go


create procedure sp_lancamento_leitura

@id_usuario				int,
@id_livro				int,
@quantidadePaginas		int

as
begin

	begin try

		update leitura set paginas_ou_cap_lidos = @quantidadePaginas 
		where leitura.fk_id_usuario = @id_usuario
		and leitura.fk_id_Livro = @id_livro

		select 1 [RESULTADO]

	end try
	begin catch
		select 'Algo está errado na atualização' [MENSAGEM], 0 [RESULTADO]

	end catch
end