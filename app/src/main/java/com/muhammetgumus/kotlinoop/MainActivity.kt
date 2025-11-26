package com.muhammetgumus.kotlinoop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var myuser =User("mehmet",20)

       // myuser.age =15 // myuser.name="Ahmet"
       println(myuser.age.toString())
       println(myuser.name)
       println(myuser.information())
        //Encapsulatıon
        var mymusician =Musician("James","Guitar",55)
        println(mymusician.age.toString())
        println(mymusician.instrument)
        println(mymusician.name)
        mymusician.Bandname()
        println(mymusician.returnBandName("Emma"))
        println(mymusician.returnBandName("Lily"))


        //inheritance
      var lars = supermusician("Lars","Drums",45)
       println(lars.name)
       println(lars.instrument)
       lars.sing()
      println (lars.returnBandName("Em"))


      //Polymorphism

      // Static Polymorphism
      var mat =Mathematics()
         println(mat.sum())
         println(mat.sum(3,4))
         println (mat.sum(3,4,5) )

      //dynamic Polymorphism

      val animal =Animal()
        animal.voice()

       val dog =Dog()
        dog.voice()
        dog.test()

      //Abstract & interface

      var mypiano = Piano()
        mypiano.brand="Yamaha"
        mypiano.digital=false
        println(mypiano.roomname)
        mypiano.info()

      //Lambda expressions

        fun printString(myString:String) {
            println(myString)
        }
        printString("my test String")

        val testString={myString:String->println(myString)}
        testString("my lambda String")

        val multiplyLambda ={a:Int,b:Int->a*b}
        println(multiplyLambda(4,5))

        val multiplyLambda2:(Int,Int)->Int={a,b->a*b}
        println(multiplyLambda2(3,4))

        //asynchrnous
        //callback function,listener function,completion function

        fun downloadMusicians(url :String,completion :(Musician)->Unit){
            //url ->download
            //data
            val kirkHammet=Musician("Kirk","Guitar",60)
            completion(kirkHammet)

        }
        downloadMusicians("metallica.com",{musician-> println(musician.name) })








    }
}