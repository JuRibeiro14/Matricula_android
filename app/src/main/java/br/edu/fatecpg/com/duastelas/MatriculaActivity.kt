package br.edu.fatecpg.com.duastelas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MatriculaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matricula)

        val nomeAluno = intent.getStringExtra("NOME_ALUNO")
        val textViewNomeMatricula: TextView = findViewById(R.id.txt_matricula)
        val buttonGerarMatricula: Button = findViewById(R.id.btn_matricula)

        textViewNomeMatricula.text = "Aluno: $nomeAluno\nMatrícula: "

        buttonGerarMatricula.setOnClickListener {
            val matricula = gerarMatriculaAleatoria()
            textViewNomeMatricula.text = "Aluno: $nomeAluno\nMatrícula: $matricula"
        }
    }

    private fun gerarMatriculaAleatoria(): String {
        val random = Random()
        val numeroMatricula = 100000 + random.nextInt(900000)
        return numeroMatricula.toString()
    }
}
