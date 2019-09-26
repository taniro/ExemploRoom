package br.ufrn.eaj.tads.exemploroom

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.*

class MainActivity : AppCompatActivity() {

    val db:AppDatabase by lazy {
        Room.databaseBuilder(
            this,
            AppDatabase::class.java, "database-name")
            .allowMainThreadQueries()
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db.carroDao().inserir(Carro("nome", "tipo", "desc", 2018))
        db.carroDao().listAll().forEach { Log.i("APPROOM", it.toString()) }
    }

}
