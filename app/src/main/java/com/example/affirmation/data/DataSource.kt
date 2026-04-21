package com.example.affirmation.data

import com.example.affirmation.R
import com.example.affirmation.model.Country

class Datasource() {
    fun loadCountries(): List<Country> {
        return listOf(
            Country("RD Congo", "Kinshasa", "CD", R.drawable.image1),
            Country("France", "Paris", "FR", R.drawable.image2),
            Country("Belgique", "Bruxelles", "BE", R.drawable.image3),
            Country("États-Unis", "Washington D.C.", "US", R.drawable.image4),
            Country("Canada", "Ottawa", "CA", R.drawable.image5),
            Country("Brésil", "Brasília", "BR", R.drawable.image6),
            Country("Allemagne", "Berlin", "DE", R.drawable.image7),
            Country("Japon", "Tokyo", "JP", R.drawable.image8),
            Country("Italie", "Rome", "IT", R.drawable.image9),
            Country("Espagne", "Madrid", "ES", R.drawable.image10)
        )
    }
}
