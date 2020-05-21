package br.com.kely.passandodadosactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPassandoDados.setOnClickListener {

            val intentDados = Intent(applicationContext, SegundaActivity::class.java)

            //passar dados pra outra Activity
            intentDados.putExtra("nome", "Jamilton Dasmasceno")

            intentDados.putExtra("idade", 30)

            startActivity(intentDados)
        }
    }
}
