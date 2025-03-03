package com.example.tojbytteapp

import android.media.Image

class Product constructor(
    val id:Int,
    var name:String,
    val owner:String,
    var price:Double,
    var tradable:Boolean,
    var description:String,
    var image: Int
) {
    override fun toString(): String {
        return "$price,-"
    }
}

    //AI Generated for testing:
    val product12346 = Product(
        id = 12346,
        name = "Sneakers",
        owner = "User1",
        price = 120.50,
        tradable = true,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12347 = Product(
        id = 12347,
        name = "Basketball Shoes",
        owner = "User2",
        price = 180.00,
        tradable = true,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12348 = Product(
        id = 12348,
        name = "Running Shoes",
        owner = "User3",
        price = 99.99,
        tradable = true,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12349 = Product(
        id = 12349,
        name = "Casual Shoes",
        owner = "User4",
        price = 75.99,
        tradable = true,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12350 = Product(
        id = 12350,
        name = "Formal Shoes",
        owner = "User5",
        price = 200.00,
        tradable = true,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12374 = Product(
        id = 12374,
        name = "Slippers",
        owner = "User29",
        price = 19.99,
        tradable = true,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12375 = Product(
        id = 12375,
        name = "Loafers",
        owner = "User30",
        price = 150.00,
        tradable = true,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )
    val product12351 = Product(
        id = 12351,
        name = "Boots",
        owner = "User6",
        price = 145.75,
        tradable = true,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12352 = Product(
        id = 12352,
        name = "Sandals",
        owner = "User7",
        price = 49.99,
        tradable = true,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12353 = Product(
        id = 12353,
        name = "Flip Flops",
        owner = "User8",
        price = 19.99,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12354 = Product(
        id = 12354,
        name = "High Heels",
        owner = "User9",
        price = 199.99,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12355 = Product(
        id = 12355,
        name = "Ankle Boots",
        owner = "User10",
        price = 160.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12356 = Product(
        id = 12356,
        name = "Espadrilles",
        owner = "User11",
        price = 70.50,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12357 = Product(
        id = 12357,
        name = "Clogs",
        owner = "User12",
        price = 55.75,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12358 = Product(
        id = 12358,
        name = "Moccasins",
        owner = "User13",
        price = 80.99,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12359 = Product(
        id = 12359,
        name = "Oxfords",
        owner = "User14",
        price = 130.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12360 = Product(
        id = 12360,
        name = "Dress Shoes",
        owner = "User15",
        price = 170.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12361 = Product(
        id = 12361,
        name = "Wedges",
        owner = "User16",
        price = 110.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12362 = Product(
        id = 12362,
        name = "Pumps",
        owner = "User17",
        price = 140.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12363 = Product(
        id = 12363,
        name = "Boat Shoes",
        owner = "User18",
        price = 95.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12364 = Product(
        id = 12364,
        name = "Chelsea Boots",
        owner = "User19",
        price = 175.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12365 = Product(
        id = 12365,
        name = "Combat Boots",
        owner = "User20",
        price = 185.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12366 = Product(
        id = 12366,
        name = "Hiking Boots",
        owner = "User21",
        price = 190.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12367 = Product(
        id = 12367,
        name = "Slip-On Shoes",
        owner = "User22",
        price = 80.50,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12368 = Product(
        id = 12368,
        name = "Athletic Shoes",
        owner = "User23",
        price = 135.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12369 = Product(
        id = 12369,
        name = "Skate Shoes",
        owner = "User24",
        price = 110.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12370 = Product(
        id = 12370,
        name = "Work Boots",
        owner = "User25",
        price = 180.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12371 = Product(
        id = 12371,
        name = "Walking Shoes",
        owner = "User26",
        price = 105.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12372 = Product(
        id = 12372,
        name = "Court Shoes",
        owner = "User27",
        price = 115.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    val product12373 = Product(
        id = 12373,
        name = "Trail Shoes",
        owner = "User28",
        price = 125.00,
        tradable = false,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    //Random ID generator and list with all AI Generated ID's:
    fun getRandomProduct(list: List<Product>): Product {
        return list.shuffled().first()
    }
    val productsList: List<Product> = listOf(
        product12346,
        product12347,
        product12348,
        product12349,
        product12350,
        product12374,
        product12375,
        product12351,
        product12352,
        product12353,
        product12354,
        product12355,
        product12356,
        product12357,
        product12358,
        product12359,
        product12360,
        product12361,
        product12362,
        product12363,
        product12364,
        product12365,
        product12366,
        product12367,
        product12368,
        product12369,
        product12370,
        product12371,
        product12372,
        product12373
    )
