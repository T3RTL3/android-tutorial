package com.example.kotlinapplication

data class Hobby(var title: String){

    object Supplier{

        val hobbies = listOf<Hobby>(

                Hobby("Swimming"),
                Hobby("Volleyball"),
                Hobby("Basketball"),
                Hobby("Soccer"),
                Hobby("Football"),
                Hobby("Programming")
        )

    }
}
