use cronograma
go

--select * from leitura
--exec sp_lancamento_leitura 29, 70, 60

alter procedure sp_lancamento_leitura

@id_usuario				int,
@id_livro				int,
@quantidadePaginas		int

as
begin

	begin try

		declare @meta int
		declare @paginasLivro int		
		declare @pagQueRestam as int
		declare @diasRestantes as int
		declare @dataInicioLeitura as date
		declare @novaData as date

		update leitura set paginas_ou_cap_lidos = @quantidadePaginas 
		where leitura.fk_id_usuario = @id_usuario
		and leitura.fk_id_Livro = @id_livro

		select @meta=l.meta from leitura l, usuario u, livro v
		where l.fk_id_usuario = @id_usuario
		and u.id = @id_usuario
		and v.fk_id_usuario = @id_usuario
		and l.fk_id_Livro = @id_livro
		and v.id = @id_livro
		
		select @paginasLivro=leitura.quantidade_paginas from leitura, usuario, livro
		where leitura.fk_id_usuario = usuario.id
		and leitura.fk_id_Livro = livro.id
		and usuario.id = @id_usuario
		and livro.fk_id_usuario = usuario.id
		and livro.id = @id_livro

		select @dataInicioLeitura=leitura.data_inicial from leitura, usuario, livro
		where leitura.fk_id_usuario = usuario.id
		and leitura.fk_id_Livro = livro.id
		and usuario.id = @id_usuario
		and livro.fk_id_usuario = usuario.id
		and livro.id = @id_livro
	
		set @pagQueRestam = @paginasLivro - @quantidadePaginas
		set @diasRestantes = @pagQueRestam / @meta

		set @novaData = DATEADD(day, @diasRestantes, @dataInicioLeitura)


		update leitura set data_prevista_final = @novaData 
		where leitura.fk_id_usuario = @id_usuario
		and leitura.fk_id_Livro = @id_livro
		
		select 1 [RESULTADO]
	
	end try
	begin catch
		select 'Algo está errado na atualização' [MENSAGEM], 0 [RESULTADO]

	end catch
end