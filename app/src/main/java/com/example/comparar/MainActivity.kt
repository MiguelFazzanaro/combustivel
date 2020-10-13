package com.example.comparar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var precoGasolina:String = input1.text.toString()
            var precoEtanol:String = input2.text.toString()
            var calculo:Double = (precoEtanol.toDouble()/precoGasolina.toDouble())

            if (calculo <= 0.7){
                Toast.makeText(this, "Etanol", Toast.LENGTH_SHORT).show()
                comp_image.setImageResource(R.drawable.abasteca_etanol)
            }
            else {
                Toast.makeText(this, "Gasolina", Toast.LENGTH_SHORT).show()
                comp_image.setImageResource(R.drawable.abasteca_gasolina)
            }
        }
    }




}


