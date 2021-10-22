package com.example.probes2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textoContador.text = "0"

        btnSumar.setOnClickListener(object  : View.OnClickListener {
            override fun onClick(v: View?){
                sumar()
                textoContador.text = total.toString()
        }
    })
        btnResta.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?){
                restar()
                textoContador.text = total.toString()
        }
        })
}
    private  var total = 0
    private  fun sumar(){
        total++
    }
    private fun restar(){
        total--
    }
    }