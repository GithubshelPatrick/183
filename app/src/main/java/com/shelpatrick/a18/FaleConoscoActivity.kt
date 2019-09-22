package com.shelpatrick.a18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fale_conosco.*

class FaleConoscoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fale_conosco)

        BtnVoltarDeFaleconosco.setOnClickListener {
            val intent=Intent(this,Menu1Activity::class.java)
            startActivity(intent)
        }
        BtnEnviarSujestao.setOnClickListener ({
            Toast.makeText(applicationContext,"Sua sujestão está sendo enviada, Agradecemos a sua atenção",Toast.LENGTH_LONG).show();
        })
    }

}
