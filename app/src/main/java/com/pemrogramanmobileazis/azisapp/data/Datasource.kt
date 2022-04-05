package com.pemrogramanmobileazis.azisapp.data

import com.pemrogramanmobileazis.azisapp.R
import com.pemrogramanmobileazis.azisapp.model.Affirmation

class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.berita1),
            Affirmation(R.string.affirmation2, R.drawable.berita2),
            Affirmation(R.string.affirmation3, R.drawable.berita3),
            Affirmation(R.string.affirmation4, R.drawable.berita4),
            Affirmation(R.string.affirmation5, R.drawable.berita5),
            Affirmation(R.string.affirmation6, R.drawable.berita6),
            Affirmation(R.string.affirmation7, R.drawable.berita7),
            Affirmation(R.string.affirmation8, R.drawable.berita8),
            Affirmation(R.string.affirmation9, R.drawable.berita9),
            Affirmation(R.string.affirmation10, R.drawable.berita10)
        )
    }
}