package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quero_me_castrar.*

class QueroMeCastrarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quero_me_castrar)

        BtnTermos.setOnClickListener {
            val intent=Intent(this,TermosActivity::class.java)
            startActivity(intent)
        }
    }
}
