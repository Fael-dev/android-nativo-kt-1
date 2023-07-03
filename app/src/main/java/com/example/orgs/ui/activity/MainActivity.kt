package com.example.orgs.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.models.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity: AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            listOf(
                Produto(nome = "Teste 1", descricao = "Teste desc 1", valor = BigDecimal("19.99")),
                Produto(nome = "Teste 2", descricao = "Teste desc 2", valor = BigDecimal("22.99")),
                Produto(nome = "Teste 3", descricao = "Teste desc 3", valor = BigDecimal("25.99")),
            )
        )
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }
}