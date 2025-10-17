package com.example.latihan

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TatakletakColumn(modifier: Modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox (modifier: Modifier) {
    Box (
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center

    )  {
        Text(text = "Box 1")
        Text(text = "Colum 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}





