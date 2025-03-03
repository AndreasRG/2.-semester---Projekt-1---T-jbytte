package com.example.tojbytteapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


data class ItemData(
    val name: String,
    val price: String,
    val iconResId: Int,
    val backgroundImageResId: Int
)

@Composable
fun PrototypeLayout1() {
    val items = listOf(
        ItemData("Item 1", "$10", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 2", "$15", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 3", "$20", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 4", "$25", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 5", "$30", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 6", "$35", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 7", "$40", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 8", "$45", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 9", "$50", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 10", "$55", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 11", "$60", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 12", "$65", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 13", "$70", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 14", "$75", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 15", "$80", R.drawable.addicon, R.drawable.shoppingcarticon),
        ItemData("Item 16", "$85", R.drawable.addicon, R.drawable.shoppingcarticon),
        // Add more items as needed
    )
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
        ) {
            // Sticky Header
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
                    .align(Alignment.TopCenter)
            ) {
                FrontpageHeader()
            }
            // Content
            // Nok ikke den mest optimale måde hardcoded, men this good!
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 100.dp, bottom = 170.dp)
            ) {
                item { FrontpageTitle() }
                items(items.chunked(2)) { rowItems ->
                    Row(modifier = Modifier.fillMaxWidth()) {
                        rowItems.forEach { item ->
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(8.dp)
                                    .background(Color.LightGray)
                                    .padding(16.dp)
                            ) {
                                Text(//name
                                    text = item.name,
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    modifier = Modifier.align(Alignment.Start)
                                )
                                Spacer(modifier = Modifier.weight(1f))
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Image( //Add to cart icon
                                        painter = painterResource(id = item.iconResId),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(24.dp)
                                            .align(Alignment.CenterVertically)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text( //price
                                        text = item.price,
                                        color = Color.Black,
                                        fontSize = 18.sp,
                                        modifier = Modifier.align(Alignment.CenterVertically)
                                    )
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
                    FrontpageFooter()
                }
            }
        }
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
            fontSize = 36.sp
        )
    }
}

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
}
