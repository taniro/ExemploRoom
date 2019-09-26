package br.ufrn.eaj.tads.exemploroom

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "tabela_carro")
data class Carro (
    var nome:String,
    var tipo:String,
    @ColumnInfo(name = "descricao")
    var desc:String,
    var ano:Int){
    @PrimaryKey (autoGenerate = true)
    var id = 0
    @Ignore
    var imagem:Bitmap? = null
}