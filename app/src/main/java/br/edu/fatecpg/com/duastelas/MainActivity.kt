package br.edu.fatecpg.com.duastelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNome: EditText = findViewById(R.id.edit_nome)
        val buttonProximo: Button = findViewById(R.id.btn_proximo)

        buttonProximo.setOnClickListener {
            val nomeAluno = editTextNome.text.toString()

            // Passando o nome para a próxima tela
            val intent = Intent(this, MatriculaActivity::class.java)
            intent.putExtra("NOME_ALUNO", nomeAluno)
            startActivity(intent)
        }
    }
}
