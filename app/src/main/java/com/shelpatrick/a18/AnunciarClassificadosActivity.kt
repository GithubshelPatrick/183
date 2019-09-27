package com.shelpatrick.a18

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_anunciar_classificados.*

class AnunciarClassificadosActivity : AppCompatActivity() {

    val CAMERA_REQUEST_CODE=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anunciar_classificados)

        BtnOlharAnuncio.setOnClickListener {
            val intent = Intent(this, OlharAnuncioActivity::class.java)
            startActivity(intent)
        }


        ImgAtivarCamera.setOnClickListener {
            val callCamera= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (callCamera.resolveActivity(packageManager)!=null){
                startActivityForResult(callCamera, CAMERA_REQUEST_CODE)
            }
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode){
            CAMERA_REQUEST_CODE ->{
                if (resultCode == Activity.RESULT_OK && data != null){
                    photo1.setImageBitmap(data.extras?.get("data") as Bitmap)

                }
            }
            else->{
                Toast.makeText(this, "É NESCESSARIO DAR PERMISSAO AO USO DA CAMERA" , Toast.LENGTH_LONG).show()
            }
        }
    }

}
