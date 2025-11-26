package com.muhammetgumus.kotlinoop

class Piano  : HoueseDecor ,Instrument{
    override var roomname: String
        get() = "Kitchen"
        set(value) {}


    override fun info() {
        if (brand !=null) {
            println("brand :$brand")
        }
        println("digital $digital")
    }

    var brand  :String? =null
    var digital: Boolean?=null

}