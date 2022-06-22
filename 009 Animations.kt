package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Paint.Align
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            var sizeState by remember { mutableStateOf(200.dp) }

            val size by animateDpAsState(
                targetValue = sizeState,
                tween(
                    durationMillis = 2000,
                    delayMillis = 500,
                    easing = LinearOutSlowInEasing
                )
//                spring(
//                    Spring.DampingRatioMediumBouncy
//                )
            )

            Box(modifier = Modifier
                .size(size)
                .background(Color.Red),
                Alignment.Center
            ){
                Button(onClick = {
                    sizeState+=50.dp
                }) {

                }
            }

        }
    }
}




