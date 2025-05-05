package com.spokefan.lastesqueleto.ui.screens.homeScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(){

}

@Composable
fun HomeScreenContent(){
    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column {
            Text(text = "Hola Usuario, bienvenido")



            Button(onClick = {}) {
                Text("Mostrar Post")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreenContent()
}