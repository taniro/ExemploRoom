package br.ufrn.eaj.tads.exemploroom

import androidx.room.Database
import androidx.room.RoomDatabase



@Database (entities = [Carro::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun carroDao(): CarroDao
}