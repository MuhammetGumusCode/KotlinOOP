package com.muhammetgumus.kotlinoop

class User  : people{
    //property
    var name :String? = null
    var age  : Int? =null

     //constructor vs init
     constructor (nameInput :String , ageInput:Int) {
         this.name=nameInput
         this.age=ageInput
         println("User created")
     }



    init {

        println("init")
    }




}