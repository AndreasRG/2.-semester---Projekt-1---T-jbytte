package com.example.tojbytteapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tojbytteapp.Product
import com.example.tojbytteapp.getRandomProduct
import com.example.tojbytteapp.productsList


data class ItemData(
    val name: String,
    val price: String,
    val tradable: Boolean,
    val backgroundImageResId: Int
)

@Composable
fun PrototypeLayout1() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                //.padding(innerPadding)
        ) {
            // Sticky Header
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    //.background(Color.Gray)
                    .align(Alignment.TopCenter)
            ) {
                WelcomeSearchBar("User")
            }
            // Content
            // Nok ikke den mest optimale måde hardcoded, men this good!
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 70.dp, //bottom = 170.dp
                        start = 10.dp,
                        end = 10.dp
                    )
            ) {
                item { FrontpageTitle() }
                items(items.chunked(2)) { rowItems ->
                    Row(modifier = Modifier.fillMaxWidth()) {
                        rowItems.forEach { item ->
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(start = 12.dp,
                                        end = 12.dp,
                                        top = 12.dp,
                                        bottom = 12.dp)
                                    .background(Color(0xFFD9D9D9))
                                    .height(170.dp)
                                    .width(150.dp)
                                    //.padding(57.dp)
                            ) {
                                Text(//name
                                    text = item.name,
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .padding(10.dp)
                                )
                                Spacer(modifier = Modifier.weight(1f))
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    if (item.tradable) {
                                        Image( //Tradable Icon
                                            painter = painterResource(id = R.drawable.tradeicon),
                                            contentDescription = null,
                                            modifier = Modifier
                                                //.size(24.dp)
                                                .height(34.dp)
                                                .width(24.dp)
                                                .align(Alignment.CenterVertically)
                                                //.padding(bottom = 5.dp)
                                        )

                                    }
                                    Spacer(modifier = Modifier.width(8.dp))
                                    if (item.tradable) {
                                    Text( //price
                                        text = item.price,
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .padding(end = 5.dp)
                                    )
                                    } else {
                                        Text( //price
                                            text = item.price,
                                            color = Color.Black,
                                            fontSize = 15.sp,
                                            fontWeight = FontWeight.Bold,
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .padding(end = 5.dp, bottom = 5.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
            // Sticky Footer
            //It was nessesary to add a box to get the footer all the way down, because of the align modifier only works in box
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Gray)
                        .align(Alignment.BottomCenter)
                )
                {
                    //FrontpageFooter()
                }
            }
        }
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
                end = 15.dp//,
                //bottom = 15.dp
            )
            ,//.background(color = Color(0xFFD9D9D9)),//Developing background color
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Welcome $firstName!",
            color = Color(0xFF7D7878)
        )
        ImageButton(
            painter = painterResource(id = R.drawable.searchicon),
            contentDescription = "Icon for search icon"
        ) {

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
fun FrontpageHeader(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Box(
            modifier = Modifier.align(Alignment.CenterVertically)
        ){
            Text(
                text = "Welcome user!",
                textAlign = TextAlign.Start,
                fontSize = 14.sp
            )
        }
        Box(
            modifier = Modifier
                .size(40.dp),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(R.drawable.search),
                contentDescription = "Add",
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
            )
        }
    }
}

@Composable
fun FrontpageTitle(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp, 10.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = "Discover what's new!",
            modifier = Modifier.align(Alignment.CenterVertically),
            textAlign = TextAlign.Center,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,

        )
    }
}
/*
@Composable
fun FrontpageFooter(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Image(
            painter = painterResource(id = R.drawable.handimage),
            contentDescription = "Shopping Cart",
            modifier = Modifier
                .size(128.dp)
                .clip(CircleShape)
        )
        Text(
            text = "--------Floating Action button her---------"
        )

    }
}*/
