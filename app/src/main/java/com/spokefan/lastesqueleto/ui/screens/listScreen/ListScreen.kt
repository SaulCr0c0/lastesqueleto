package com.spokefan.lastesqueleto.ui.screens.listScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.spokefan.lastesqueleto.data.server.models.Post

@Composable
fun ListScreen(

){

}

@Composable
fun ListScreenContent(){

}

@Preview(showBackground = true)
@Composable
fun ListScreenPreview(){
    ListScreenContent()
}

@Composable
fun PostCard(post:Post){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(

        ) {
            Text(text = "ID User: ${post.userId}")
            Text(text = "ID: ${post.id}")
            Text(text = "Tittle: ${post.title}")
            Text(text = "Body: ${post.body}")
        }
    }
}