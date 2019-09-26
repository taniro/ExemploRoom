package br.ufrn.eaj.tads.exemploroom

import androidx.room.*

@Dao
interface CarroDao {
    @Insert
    fun inserir(carro: Carro): Long

    @Delete
    fun deletar(carro: Carro): Int

    @Update
    fun atualizar(carro: Carro): Int

    @Query("SELECT * FROM tabela_carro")
    fun listAll(): Array<Carro>

    @Query("SELECT * FROM TABELA_CARRO WHERE id = :id")
    fun findById(id: Long): Carro

    @Query("SELECT * FROM TABELA_CARRO WHERE nome = :nome")
    fun findByName (nome: String) : Carro
}