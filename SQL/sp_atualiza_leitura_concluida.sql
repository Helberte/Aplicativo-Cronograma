use cronograma 
go


--titulo
--data termino
--quantidade total de páginas
--quantidade lidas
--total de dias que demorou

--exec sp_atualiza_leitura_concluida 29

go
alter procedure sp_atualiza_leitura_concluida

@fk_id_usuario			int

as 
begin
	
	begin try
		
		declare @total int
		declare @dataInicial date
		declare @numeroDias int

		select @total=COUNT(*) from leitura_concluida l
		where l.fk_id_usuario = @fk_id_usuario

		select @dataInicial=l.data_inicial from leitura_concluida l	
		where l.fk_id_usuario = @fk_id_usuario

		if @total = 0 
		begin
			select 2 [RESULTADO] -- NÃO EXISTEM LEITURAS PARA ESTE USUÁRIO
		end
		else
		begin
			
			if DATEDIFF(day, @dataInicial, GETDATE()) < 0 
			begin
				set @numeroDias = 0
			end


			select CONVERT(varchar(30), l.data_canclusao,103) data_canclusao,
			   CONVERT(varchar(30), l.data_inicial,103) data_inicial,
			   l.tipo_de_leitura,
			   l.quantidade_paginas,
			   l.paginas_ou_cap_lidos,
			   CONVERT(varchar(30), l.data_prevista_final,103) data_prevista_final,
			   l.meta,
			   1 [RESULTADO],
			   @total [QUANTIDADE_LINHAS],
			   v.nome [titulo],
			   @numeroDias [total_dias_utilizados]
			   from leitura_concluida l, livro v
			   where l.fk_id_usuario = @fk_id_usuario
			   and v.id = l.fk_id_livro
			   and v.fk_id_usuario = l.fk_id_usuario

		end

	end try
	begin catch

		select 0 [RESULTADO] -- ALGO DEU ERRADO
	end catch
end