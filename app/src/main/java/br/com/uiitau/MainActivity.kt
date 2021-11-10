package br.com.uiitau

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //lateinit Possibilita inicializar a variável depois de sua declaração, ou seja, inicializar tardiamente uma propriedade
    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciaViews()
        setItensLista()

    }

    private fun iniciaViews() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItensLista(){
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                    "Cartões"
                ),
                MenuItemModel(
                    "Meus Comprovantes"
                ),
                MenuItemModel(
                    "Investimentos"
                ),
                MenuItemModel(
                    "Contabilidade de Salário"
                ),
                MenuItemModel(
                    "Cartões"
                ),
                MenuItemModel(
                    "Meus Comprovantes"
                ),
                MenuItemModel(
                    "Investimentos"
                ),
                MenuItemModel(
                    "Contabilidade de Salário"
                )
            )
        )
    }
}