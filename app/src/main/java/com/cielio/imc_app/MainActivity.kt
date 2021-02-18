package com.cielio.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("Lifecycle", "CREATE - criando a tela")

        buttonCalcular.setOnClickListener {
            val peso = editTextPeso.text.toString().toDoubleOrNull()
            val altura = editTextAltura.text.toString().toDoubleOrNull()

            if (peso != null && altura != null ){
                val imc = peso.div((altura.pow(2)))
                textViewResult.text = "%.2f".format(imc)
            }
        }
    }

    override fun onStart() {

        super.onStart()
        Log.w("Lifecycle", "START - deixei a tela visivel para voce")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "RESUME - deixei a tela visivel para voce")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "PAUSE - Atela perdeu o foco, voce nao pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle", "STOP - a tela nao esta visivel, mas ainda exite")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle", "DESTROY - Ha nao! a tela foi detruida")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle", "RESTART - a tela esta retomando o foco")
    }


}