package br.com.kely.passandodadosactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        //recupera os dados através do Bundle
        val dados: Bundle? = intent.extras

        //recupera o nome
        val nome = dados?.getString("nome")

        textViewNome.text = nome

        //recupera a idade
        val idade = dados?.getInt("idade")

        //converte Inteiro para String
        textViewIdade.text = idade.toString()
    }
}
