package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        BtnQueroMeCadastrar.setOnClickListener {
            val intent=Intent(this,QueroMeCastrarActivity::class.java)
            startActivity(intent)
        }
        BtnEsqueciSenha.setOnClickListener {
            val intent=Intent(this,EsqueciASenhaActivity::class.java)
            startActivity(intent)
        }
        BtnEntar.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
    }
}
