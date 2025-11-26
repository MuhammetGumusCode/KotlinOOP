package com.muhammetgumus.kotlinoop

open class Musician(nameMusician: String, instrument: String, age: Int) {

     var name:String?=nameMusician
         private set
                 get



   var instrument :String?=instrument
       private set
               get

   var age : Int ?=age
       private set
               get


    private var bandName :String ?="Emma"


 fun Bandname () {
       println("Bandname is $bandName")

    }

     fun returnBandName (password:String):String {
        if (password=="Emma") {
            return bandName !!
        }else {
            return "Wrong password"
        }
    }

}




