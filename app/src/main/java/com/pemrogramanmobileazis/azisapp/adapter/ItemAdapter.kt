package com.pemrogramanmobileazis.azisapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pemrogramanmobileazis.azisapp.R
import com.pemrogramanmobileazis.azisapp.model.Affirmation

//TODO 1 (203310027 Azis Nur Fajar) : Untuk Menampilkan objek data [Afirmasi].
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //TODO 2 (203310027 Azis Nur Fajar) : Menampilkan lebih dari satu item yang bisa akses semua tampilan untuk item data.
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    //TODO 3 (203310027 Azis Nur Fajar) : Membuat tampilan baru ditampilkan di template list item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // TODO 4 (203310027 Azis Nur Fajar) : Membuat tampilan baru
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //TODO 5 (203310027 Azis Nur Fajar) : Mengganti konten tampilan
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    //TODO 6 (203310027 Azis Nur Fajar) : Mengembalikan kumpulan data
    override fun getItemCount() = dataset.size
}