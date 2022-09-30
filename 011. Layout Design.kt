package com.example.myapplication

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme() {
                // A surface container that uses the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ImageCard(contentDescription = "Amit", title = "Asim")
                }
            }
        }
    }
}

@Composable
fun ImageCard(contentDescription: String, title: String, modifier: Modifier = Modifier){


    LazyColumn() {

        item{
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp,
            ) {
                Row(modifier = Modifier
                    .height(50.dp)
                    .wrapContentHeight(Alignment.CenterVertically)
                ) {
                    Spacer(modifier = Modifier.width(15.dp))
                    Image(painter = painterResource(id = R.drawable.ic_baseline_search_24 ), contentDescription = "" )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Resutarant option or a dish", color = Color.Gray, fontSize = 18.sp)

                }
            }
        }

        item{
            Card(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp
            ) {
                Column(modifier = Modifier.height(250.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.image1),
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(150.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column() {
                            Text(text = "Chai Dukaan", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                            Text(text = "Tea, Burger, Fast Food", fontSize = 18.sp)
                        }
                        Column() {
                            Card(
                                modifier = modifier
                                    .width(70.dp)
                                    .height(25.dp),
                                backgroundColor = Color(0xFF00838F).compositeOver(Color.White),
                                shape = RoundedCornerShape(15.dp)
                            ) {
                                Text(text = "4.7 ⭐", textAlign = TextAlign.Center, color = Color.White)
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(text = "₹200 for one", fontSize = 13.sp)
                        }
                    }
                }
            }
        }

        item { Card(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp
        ) {
            Column(modifier = Modifier.height(250.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.image2),
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(150.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        Text(text = "Ministary of Food", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Text(text = "Non veg, Bengali Recipe", fontSize = 18.sp)
                    }
                    Column() {
                        Card(
                            modifier = modifier
                                .width(70.dp)
                                .height(25.dp),
                            backgroundColor = Color(0xFF00838F).compositeOver(Color.White),
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Text(text = "4.1 ⭐", textAlign = TextAlign.Center, color = Color.White)
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(text = "₹100 for one", fontSize = 13.sp)
                    }
                }
            }
        } }


        item{
            Card(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp
            ) {
                Column(modifier = Modifier.height(250.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.image3),
                        contentDescription = contentDescription,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(150.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column() {
                            Text(text = "Rim Naam - The Oberai", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                            Text(text = "Thai, Asian, Sea Food, Desserts", fontSize = 18.sp)
                        }
                        Column() {
                            Card(
                                modifier = modifier
                                    .width(70.dp)
                                    .height(25.dp),
                                backgroundColor = Color(0xFF00838F).compositeOver(Color.White),
                                shape = RoundedCornerShape(15.dp)
                            ) {
                                Text(text = "4.8 ⭐", textAlign = TextAlign.Center, color = Color.White)
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(text = "₹400 for one", fontSize = 13.sp)
                        }
                    }
                }
            }
        }



    }

}

