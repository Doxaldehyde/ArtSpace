package com.dox.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dox.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}
@Composable
 fun ArtSpaceApp() {
    var result by remember { mutableStateOf(1) }
    when (result) {

            1-> Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Card(
                    modifier = Modifier
                        .height(520.dp)
                        .width(350.dp),
                    border = BorderStroke(2.dp, Color.DarkGray),
                    elevation = 7.dp
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.dog_1),
                        contentDescription = "dog",
                        contentScale = ContentScale.Crop
                    )
                }
                Spacer(modifier = Modifier.height(35.dp))
                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .width(350.dp),
                    elevation = 3.dp
                ) {
                    Column {
                        Text(
                            text = stringResource(id = R.string.dog_title), modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, top = 10.dp, end = 10.dp)
                                .wrapContentWidth(
                                    Alignment.Start
                                ), fontSize = 20.sp
                        )
                        Row {
                            Text(
                                text = stringResource(id = R.string.dog_owner),
                                modifier = Modifier.padding(start = 10.dp, end = 8.dp),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(text = stringResource(id = R.string.year), fontSize = 14.sp)
                        }
                    }
                }
                Spacer(modifier = Modifier.height(25.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().padding(),
                    verticalAlignment = Alignment.Bottom
                ) {
                    Button(
                        onClick = { result = 4 }, modifier = Modifier
                            .padding()
                            .width(165.dp)
                    ) {
                        Text(text = stringResource(id = R.string.previous))
                    }
                    Button(
                        onClick = { result = 2 }, modifier = Modifier
                            .padding(start = 20.dp)
                            .width(165.dp)
                    ) {
                        Text(text = stringResource(id = R.string.Next))
                    }

                }

            }


       2 -> Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
                .wrapContentWidth(Alignment.CenterHorizontally),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Card(
                modifier = Modifier
                    .height(520.dp)
                    .width(350.dp),
                border = BorderStroke(2.dp, Color.DarkGray),
                elevation = 7.dp
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.girl_2),
                    contentDescription = "dog",
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(35.dp))
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(350.dp),
                elevation = 3.dp
            ) {
                Column {
                    Text(
                        text = stringResource(id = R.string.art_title1), modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, top = 10.dp, end = 10.dp)
                            .wrapContentWidth(
                                Alignment.Start
                            ), fontSize = 20.sp
                    )
                    Row {
                        Text(
                            text = stringResource(id = R.string.art_owner1),
                            modifier = Modifier.padding(start = 10.dp, end = 8.dp),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = stringResource(id = R.string.year2), fontSize = 14.sp)
                    }
                }
            }
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding()
            ) {
                Button(
                    onClick = { result = 1 }, modifier = Modifier
                        .padding()
                        .width(165.dp)
                ) {
                    Text(text = stringResource(id = R.string.previous))
                }
                Button(
                    onClick = { result = 3 }, modifier = Modifier
                        .padding(start = 20.dp)
                        .width(165.dp)
                ) {
                    Text(text = stringResource(id = R.string.Next))
                }

            }

        }
       3 -> Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
                .wrapContentWidth(Alignment.CenterHorizontally),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Card(
                modifier = Modifier
                    .height(520.dp)
                    .width(350.dp),
                border = BorderStroke(2.dp, Color.DarkGray),
                elevation = 7.dp
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.girl_3i),
                    contentDescription = "dog",
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(35.dp))
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(350.dp),
                elevation = 3.dp
            ) {
                Column {
                    Text(
                        text = stringResource(id = R.string.art_title2), modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, top = 10.dp, end = 10.dp)
                            .wrapContentWidth(
                                Alignment.Start
                            ), fontSize = 20.sp
                    )
                    Row {
                        Text(
                            text = stringResource(id = R.string.art_owner2),
                            modifier = Modifier.padding(start = 10.dp, end = 8.dp),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = stringResource(id = R.string.year3), fontSize = 14.sp)
                    }
                }
            }
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding()
            ) {
                Button(
                    onClick = { result = 2 }, modifier = Modifier
                        .padding()
                        .width(165.dp)
                ) {
                    Text(text = stringResource(id = R.string.previous))
                }
                Button(
                    onClick = { result = 4 }, modifier = Modifier
                        .padding(start = 20.dp)
                        .width(165.dp)
                ) {
                    Text(text = stringResource(id = R.string.Next))
                }

            }

        }
       4 -> Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
                .wrapContentWidth(Alignment.CenterHorizontally),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Card(
                modifier = Modifier
                    .height(520.dp)
                    .width(350.dp),
                border = BorderStroke(2.dp, Color.DarkGray),
                elevation = 7.dp
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.endsars_4),
                    contentDescription = "dog",
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(35.dp))
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .width(350.dp),
                elevation = 3.dp
            ) {
                Column {
                    Text(
                        text = stringResource(id = R.string.EndSars_title), modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, top = 10.dp, end = 10.dp)
                            .wrapContentWidth(
                                Alignment.Start
                            ), fontSize = 18.sp
                    )
                    Row {
                        Text(
                            text = stringResource(id = R.string.bold_youth),
                            modifier = Modifier.padding(start = 10.dp, end = 8.dp),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = stringResource(id = R.string.year4), fontSize = 12.sp)
                    }
                }
            }
            Spacer(modifier = Modifier.height(25.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding()
            ) {
                Button(
                    onClick = { result = 3 }, modifier = Modifier
                        .padding()
                        .width(165.dp)
                ) {
                    Text(text = stringResource(id = R.string.previous))
                }
                Button(
                    onClick = { result = 1 }, modifier = Modifier
                        .padding(start = 20.dp)
                        .width(165.dp)
                ) {
                    Text(text = stringResource(id = R.string.Next))
                }

            }

        }

    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}