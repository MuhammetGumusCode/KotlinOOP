package com.muhammetgumus.kotlinoop

class Dog : Animal() {


    fun test () {

        super.voice()
    }


    override fun voice() {
        println("Hav Hav")
    }
}