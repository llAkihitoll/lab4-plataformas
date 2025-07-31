package com.example.lab4

object PetRepository {
    fun getPetList(): List<Pet> = listOf(
        Pet("Max", "Golden Retriever", R.drawable.dog1),
        Pet("Luna", "Persian Cat", R.drawable.cat1),
        Pet("Rocky", "Bulldog", R.drawable.dog2),
        Pet("Milo", "Siamese Cat", R.drawable.cat2)
    )
}
