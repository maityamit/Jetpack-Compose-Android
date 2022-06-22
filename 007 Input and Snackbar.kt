package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Paint.Align
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            var textfieldState by remember {
                mutableStateOf("")
            }
            val scaffoldState = rememberScaffoldState() // this contains the `SnackbarHostState`
            val coroutineScope = rememberCoroutineScope()

            Scaffold(
                modifier = Modifier,
                scaffoldState = scaffoldState // attaching `scaffoldState` to the `Scaffold`
            ) {

                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp)
                ){
                    TextField(
                        value = textfieldState,
                        label = {
                            Text(text = "Enter your name")
                        },
                        onValueChange = {
                            textfieldState = it
                        },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {
                            coroutineScope.launch { // using the `coroutineScope` to `launch` showing the snackbar
                                // taking the `snackbarHostState` from the attached `scaffoldState`
                                val snackbarResult = scaffoldState.snackbarHostState.showSnackbar(
                                    message = "Hello $textfieldState",
                                    actionLabel = "Do something."
                                )
                                when (snackbarResult) {
                                    SnackbarResult.Dismissed -> Log.d("SnackbarDemo", "Dismissed")
                                    SnackbarResult.ActionPerformed -> Log.d("SnackbarDemo", "Snackbar's button clicked")
                                }
                            }
                        }
                    ) {
                        Text(text = "Show grt msg")
                    }
                }
            }

            
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}



