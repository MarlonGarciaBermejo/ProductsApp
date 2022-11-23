package com.firstapp.productsapp

object DataManager {

    val items = mutableListOf<Items>()

    init {
        createMockData()
    }

    fun createMockData() {
        items.add(Items("RTX 2080", 7000, R.drawable.rtx_2080))
        items.add(Items("RTX 3060", 4500, R.drawable.rtx_3060))
        items.add(Items("RTX 3070", 6500, R.drawable.rtx_3070))
        items.add(Items("RTX 3080", 8000, R.drawable.rtx_3080))
        items.add(Items("IntelCore i7", 4200, R.drawable.intel_corei7))
        items.add(Items("IntelCore i9", 6900, R.drawable.intel_corei9))
        items.add(Items("ROG MB", 3800, R.drawable.rog_mb))
        items.add(Items("ROG Strix MB", 4100, R.drawable.rog_strix_mb))
        items.add(Items("CorsairDM Ram", 2700, R.drawable.corsair_dominator_ram))
        items.add(Items("CorsairV Ram", 1500, R.drawable.corsair_vengeance_ram))
    }
}