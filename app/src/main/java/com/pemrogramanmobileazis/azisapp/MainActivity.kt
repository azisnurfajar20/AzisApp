package com.pemrogramanmobileazis.azisapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.pemrogramanmobileazis.azisapp.adapter.ItemAdapter
import com.pemrogramanmobileazis.azisapp.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 1 (203310027 - Azis Nur Fajar) : Untuk Menginisialisasi data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // TODO 2 (203310027 - Azis Nur Fajar) : Untuk mengatur tata letak RecyclerView
        recyclerView.setHasFixedSize(true)


    }
}