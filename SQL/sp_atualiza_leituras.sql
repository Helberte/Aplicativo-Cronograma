use cronograma
go

--exec sp_atualiza_leituras 29

alter procedure sp_atualiza_leituras

@id_usuario				int

as
begin

	begin try
		
		declare @quantidade int

		select @quantidade=COUNT(*) from livro l, leitura t, usuario u
									Where l.fk_id_usuario = u.id
									and t.fk_id_Livro = l.id
									and t.fk_id_usuario = u.id
									and u.id = @id_usuario

		if @quantidade > 0 
		begin
			declare @data_atualizacao date
			declare @existe_instancia as int

			select @data_atualizacao=d.data_da_atualizacao from leitura l, data_atualizacao d
			where l.fk_id_usuario = @id_usuario
			and	d.fk_atualizacao_usuario = @id_usuario

			if @data_atualizacao < CONVERT(date, GETDATE(), 103)
			begin
				
				select @existe_instancia=COUNT(*) from data_atualizacao d
				where d.fk_atualizacao_usuario = @id_usuario

				if @existe_instancia > 0 
				begin
					update data_atualizacao set data_da_atualizacao = CONVERT(date, GETDATE(), 103)
					where data_atualizacao.fk_atualizacao_usuario = @id_usuario					
				end
				else
				begin					
					insert into data_atualizacao (fk_atualizacao_usuario, data_da_atualizacao)
					values (@id_usuario, CONVERT(date, GETDATE(), 103))
				end


				declare @meta int
				declare @paginas_livro_lidas int	
				declare @total_paginas_livro int
				declare @pagQueRestam as int
				declare @diasRestantes as int
				declare @dataInicioLeitura as date
				declare @novaData as date
				declare @quantidade_total as int
				declare @i int

				select @quantidade_total=COUNT(*) from leitura l
				where l.fk_id_usuario = @id_usuario
				
										
				create table #temporaria (
					id						int		identity(1,1),
					data_inicial			date,
					data_prevista_final		date,
					quantidade_paginas		int,
					paginas_lidas			int,						
					meta					int,
					id_leitura				int,
					fk_id_livro				int,
					fk_id_usuario			int						
				)
				
				insert into #temporaria select l.data_inicial,
											   l.data_prevista_final,
											   l.quantidade_paginas,
											   l.paginas_ou_cap_lidos,
											   l.meta,
											   l.id_leitura,
											   l.fk_id_Livro,
											   l.fk_id_usuario from leitura l 
				where l.fk_id_usuario = @id_usuario
			


				set @i = 0
				while @i <= @quantidade_total
				begin

					select * from leitura
				end


				set @pagQueRestam = @total_paginas_livro - @paginas_livro_lidas
				set @diasRestantes = @pagQueRestam / @meta



			end





			select l.nome,
				   CONVERT(varchar(10), t.data_inicial, 103) [data_inicial],
				   CONVERT(varchar(10), t.data_prevista_final, 103) [data_prevista_final], 
				   t.paginas_ou_cap_lidos, 
				   t.quantidade_paginas,
				   t.tipo_de_leitura,
				   1 [RESULTADO],
				   @quantidade [QUANTIDADE],
				   t.fk_id_Livro,
				   u.nome [usuarioNome],
				   t.meta [meta]  from livro l, leitura t, usuario u
									Where l.fk_id_usuario = u.id
									and t.fk_id_Livro = l.id
									and t.fk_id_usuario = u.id
									and u.id = @id_usuario
		end
		else 
		begin
			select 'Nenhuma leitura ainda.' [MENSAGEM], 2 [RESULTADO]
		end		
		
	end try
	begin catch
		
		select 'Problemas ao atualizar leituras' [MENSAGEM], 0 [RESULTADO]
	end catch		
end
go

declare @data_passada date

set @data_passada = '25/10/2020'

if @data_passada < CONVERT(date, getdate(), 103)
begin
	select '� menor'
end
else
begin
	select '� maior'
end

select * from leitura

declare @teste int
set @teste = 0

while @teste <= 20
begin
		
	select 'funcionou ' + CONVERT(varchar(20), @teste)
		
	set @teste = @teste + 1
end