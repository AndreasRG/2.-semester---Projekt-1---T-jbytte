package com.example.tojbytteapp

import android.media.Image

class Product constructor(
    val id:Int,
    var name:String,
    val owner:String,
    var price:Double,
    var description:String,
    var image: Int
) {}