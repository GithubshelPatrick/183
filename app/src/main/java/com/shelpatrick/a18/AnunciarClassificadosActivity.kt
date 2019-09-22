package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_anunciar_classificados.*

class AnunciarClassificadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anunciar_classificados)

        BtnOlharAnuncio.setOnClickListener {
            val intent = Intent(this, OlharAnuncioActivity::class.java)
            startActivity(intent)
        }

    }

}
