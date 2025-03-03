package com.example.tojbytteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.Dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //WelcomeSearchBar("Andreas")
            ReturnSearchBar()
            ProductPage(product12345)
            MenuBar()
            /*
            PrototypeLayout1()
            Tester senere, ved ikke hvordan de skal integreres endnu,
            men kør denne alene i content, for at se siden :)
             */
        }
    }

    @Composable
    fun WelcomeSearchBar(firstName: String) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 15.dp,
                    top = 25.dp,
                    end = 15.dp,
                    bottom = 15.dp
                )
                .background(color = Color(0xFFD9D9D9)),//Developing background color
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Welcome $firstName!",
                color = Color(0xFF7D7878)
            )
            ImageButton(
                painter = painterResource(id = R.drawable.searchicon),
                contentDescription = "Icon for shopping bag"
            ) {

            }

        }
    }

    @Composable
    fun ReturnSearchBar() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 15.dp,
                    top = 25.dp,
                    end = 15.dp,
                    bottom = 15.dp
                ),//.background(color = Color(0xFFD9D9D9)),//Developing background color
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            RotatedImageButton(
                painter = painterResource(id = R.drawable.uturnicon),
                contentDescription = "Icon for U-turn",
                rotation = 90f
            ) {}
            ImageButton(
                painter = painterResource(id = R.drawable.searchicon),
                contentDescription = "Icon for search"
            ) {}
        }
    }

    @Composable
    fun MenuBar() {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Box(
                modifier = Modifier
                    .background(color = Color(0xFFD9D9D9))
                    .padding(10.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    ImageButton(
                        painter = painterResource(id = R.drawable.starsicon),
                        contentDescription = "Icon for discover page"
                    ) {}
                    ImageButton(
                        painter = painterResource(id = R.drawable.shoppingbag),
                        contentDescription = "Icon for shopping bag"
                    ) {}
                    ImageButton(
                        painter = painterResource(id = R.drawable.addicon),
                        contentDescription = "Icon for adding content"
                    ) {}
                    ImageButton(
                        painter = painterResource(id = R.drawable.hearticon),
                        contentDescription = "Icon for hearted content"
                    ) {}
                    ImageButton(
                        painter = painterResource(id = R.drawable.profileicon),
                        contentDescription = "Icon for profile page"
                    ) {}
                }
            }
        }
    }

    @Composable
    fun ImageButton(painter: Painter, contentDescription: String, onClick: () -> Unit) {
        Box(
            modifier = Modifier
                .clickable(onClick = onClick)
                .size(50.dp)
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
            )
        }
    }

    @Composable
    fun RotatedImageButton(
        painter: Painter,
        contentDescription: String,
        rotation: Float,
        onClick: () -> Unit
    ) {
        Box(
            modifier = Modifier
                .clickable(onClick = onClick)
                .graphicsLayer(rotationZ = rotation)
                .size(50.dp)
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
            )
        }
    }

    @Composable
    fun ImageWithBorder(
        painter: Painter,
        contentDescription: String,
        borderSize: Dp = 2.dp,
        borderColor: Color = Color(0xFFD9D9D9)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                //.padding(
                //    start = 25.dp,
                //    end = 25.dp,
                //    top = 100.dp
                //)
                .border(borderSize, borderColor)
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }

    val product12345 = Product(
        id = 12345,
        name = "Shirt",
        owner = "AndreasRG",
        price = 99.99,
        description = "This is an elaborate description of the item that is listed. Crafted with meticulous attention to detail, this item embodies both elegance and functionality, catering to the discerning tastes of individuals who appreciate quality. Whether admired from afar or experienced up close, its seamless design and impeccable craftsmanship make it a coveted addition to any collection. Truly, it stands as a testament to the perfect blend of tradition and innovation, promising to exceed expectations in every conceivable way.",
        image = R.drawable.airforcetest
    )

    @Composable
    fun ProductPage(productId:Product) {
        Column(modifier = Modifier){
            ImageWithBorder(
                painter = painterResource(id = productId.image),
                contentDescription = "Picture of ${productId.name}"
            )
            Row{
                Text( text = productId.name)
                Text( text = "${productId.price},-")
            }
            Row{
                Text( text = "Listed by ${productId.owner}")
                ImageButton(
                    painter = painterResource(id = R.drawable.tradesellicon),
                    contentDescription = "Icon for trade/selling"
                ) {}
            }
            Text( text = productId.description)
        }
    }
}