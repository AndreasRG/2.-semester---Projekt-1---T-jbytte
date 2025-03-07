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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.foundation.border
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomepageLayout()
            //ProductpageLayout()
            //TradepageLayout()
        }
    }

    @Composable
    fun HomepageLayout() {
        PrototypeLayout1()
        MenuBar()
    }

    @Composable
    fun ProductpageLayout() {
        ReturnSearchBar()
        ProductPage(getRandomProduct(productsList))
        MenuBar()
    }

    @Composable
    fun TradepageLayout() {
        Column {
            TradePageBar()
            TradeWindow(myItemList, "Your")
            TradeConfirmDeny()
            TradeWindow(userItemList, userItemList[0].owner)
        }
        Column {
            TradePageBarFiller()
            SelectedItemsTradeWindow(myItemList)
            TradeConfirmDenyFiller()
            SelectedItemsTradeWindow(userItemList)
        }
        MenuBar()
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
    fun TradePageBar() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 15.dp,
                    top = 25.dp,
                    end = 15.dp,
                    bottom = 15.dp
                ),//.background(color = Color(0xFFD9D9D9)),//Developing background color
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            RotatedImageButton(
                painter = painterResource(id = R.drawable.uturnicon),
                contentDescription = "Icon for U-turn",
                rotation = 90f
            ) {}
            Text( text = "Trade offer from ${userItemList[0].owner}",
                color = Color(0xFF5F5B5B),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
           )
            Image(
                painter = painterResource(id = R.drawable.uturnicon),
                contentDescription = "",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .graphicsLayer(alpha = 0f)
            )
        }
    }
    @Composable
    fun TradeConfirmDenyFiller() {
        Row(modifier = Modifier
            .padding(
                start = 15.dp,
                top = 50.dp,
                end = 15.dp,
                bottom = 7.dp
            ))//.background(color = Color(0xFFD9D9D9)),//Developing background color
            {}
    }

    @Composable
    fun TradePageBarFiller() {
        Row(modifier = Modifier
            .padding(
                start = 15.dp,
                top = 75.dp,
                end = 15.dp,
                bottom = 15.dp
            ))//.background(color = Color(0xFFD9D9D9)),//Developing background color
        {}
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
                .clickable(onClick = onClick) // Correct the clickable usage
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
    fun SmallerImageButton(painter: Painter, contentDescription: String, onClick: () -> Unit) {
        Box(
            modifier = Modifier
                .clickable(onClick = onClick)
                .size(30.dp)
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp)
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
                .border(borderSize, borderColor)
                .height(350.dp)
        ) {
            Column(modifier = Modifier
                .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
    }


    @Composable
    fun ProductPage(productId:Product) {
        Column(modifier = Modifier
                .padding(
                    start = 25.dp,
                    end = 25.dp,
                    top = 90.dp
                )
                ) {
            ImageWithBorder(
                painter = painterResource(id = productId.image),
                contentDescription = "Picture of ${productId.name}"
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 10.dp
                    ),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = productId.name,
                    fontSize = 40.sp
                )
                Text(
                    text = "${productId.price},-",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box {
                    Row() {
                        Text(
                            text = "Listed by ",
                            fontSize = 16.sp,
                            color = Color(0xFFB7B2B2),
                            modifier = Modifier.padding(top = 5.dp)
                        )
                        Text(
                            text = productId.owner,
                            fontSize = 16.sp,
                            color = Color(0xFF4F4F4F),
                            modifier = Modifier.padding(top = 5.dp)
                        )
                        SmallerImageButton(
                            painter = painterResource(id = R.drawable.profileicon),
                            contentDescription = "Icon for ${productId.name} profile"
                        ) {}
                    }
                }
                ImageButton(
                    painter = painterResource(id = R.drawable.tradesellicon),
                    contentDescription = "Icon for trade/selling"
                ) {}
            }
            Box(modifier = Modifier
                . padding(
                    top = 10.dp
                    )
            ){
            Text(
                text = productId.description,
                fontSize = 16.sp,
                lineHeight = 20.sp
            )
            }
        }
    }

    @Composable
    fun TradeWindow(selectedItems: MutableList<Product>, nameOfTrader: String) {
        Column( modifier = Modifier
            .padding(
                start = 25.dp,
                end = 25.dp,
                bottom = 50.dp,
                top = 50.dp
            ),
            verticalArrangement = Arrangement.SpaceEvenly

        ) {
            Text( text = "$nameOfTrader item(s) to trade",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
            Row( modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 9.dp,
                    bottom = 9.dp
                ),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                for (i in 1..5) {
                    TradeImage()
                }
            }
            Row( modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 9.dp,
                    bottom = 9.dp
                ),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                for (i in 1..5) {
                    TradeImage()
                }
            }
            Row( modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 9.dp,
                    bottom = 9.dp
                ),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                for (i in 1..5) {
                    TradeImage()
                }
            }
        }
    }

    @Composable
    fun SelectedItemsTradeWindow(selectedItems: MutableList<Product>) {
        Column(
            modifier = Modifier
                .padding(
                    start = 25.dp,
                    end = 25.dp,
                    bottom = 50.dp,
                    top = 50.dp
                ),
                //.background(color = Color(0xFF000000))
                //.graphicsLayer(alpha = 0.7f), // Opacity for development/overlapping items
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                modifier = Modifier.graphicsLayer(alpha = 0f),
                text = "HEJ",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFffffff)
            )

            val totalRows = maxOf((selectedItems.size + 4) / 5, 3)
            for (row in 0 until totalRows) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 9.dp,
                            bottom = 9.dp
                        ),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    val startIndex = row * 5
                    val endIndex = minOf(startIndex + 5, selectedItems.size)

                    if (startIndex < selectedItems.size) {
                        for (i in startIndex until endIndex) {
                            ProductImage(selectedItems[i].image)
                        }
                        val emptySlots = 5 - (endIndex - startIndex)
                        for (i in 0 until emptySlots) {
                            TradeImage()
                        }
                    } else {
                        for (i in 0 until 5) {
                            TradeImage()
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun TradeConfirmDeny() {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text( text = "Confirm",
                modifier = Modifier
                    .background(color = Color(0xFFD9D9D9),
                        shape = RoundedCornerShape(5.dp))
                    .padding(5.dp),
                fontSize = 20.sp,
                color = Color(0xFF43893D),
                fontWeight = FontWeight.Bold
            )
            Column (modifier = Modifier
                .padding(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Request",
                    modifier = Modifier
                        .background(color = Color(0xFFD9D9D9),
                            shape = RoundedCornerShape(topStart = 5.dp, topEnd = 5.dp))
                        .padding(5.dp, top = 5.dp, bottom = 0.dp, end = 5.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "change",
                    modifier = Modifier
                        .background(color = Color(0xFFD9D9D9),
                            shape = RoundedCornerShape(bottomStart = 5.dp, bottomEnd = 5.dp))
                        .padding(start = 8.5.dp, end = 8.5.dp, bottom = 5.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Text( text = "Decline",
                modifier = Modifier
                    .background(color = Color(0xFFD9D9D9),
                        shape = RoundedCornerShape(5.dp))
                    .padding(5.dp),
                fontSize = 20.sp,
                color = Color(0xFFAC341F),
                fontWeight = FontWeight.Bold
            )
        }
    }


    @Composable
    fun TradeImage() {
        Image(
            painter = painterResource(id = R.drawable.greyicon),
            contentDescription = "Grey background icon",
            modifier = Modifier
                .width(57.dp)
                .height(57.dp)
        )
    }
    @Composable
    fun ProductImage(imageOfProduct: Int) {
        Image(
            painter = painterResource(id = imageOfProduct),
            contentDescription = "Grey background icon",
            modifier = Modifier
                .width(57.dp)
                .height(57.dp)
        )
    }

}