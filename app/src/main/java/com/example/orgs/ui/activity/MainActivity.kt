package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.models.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity: AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Morango, goiaba, melancia"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            listOf(
                Produto(nome = "Teste 1", descricao = "Teste desc 1", valor = BigDecimal("19.99")),
                Produto(nome = "Teste 2", descricao = "Teste desc 2", valor = BigDecimal("22.99")),
                Produto(nome = "Teste 3", descricao = "Teste desc 3", valor = BigDecimal("25.99")),
            )
        )
    }
}