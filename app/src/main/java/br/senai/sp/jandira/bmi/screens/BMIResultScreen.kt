package br.senai.sp.jandira.bmi.screens

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R


@Composable
fun BMIResultScrenn(modifier: Modifier = Modifier) {

    val context = LocalContext.current
    val userFile = context
        .getSharedPreferences("user_file", Context.MODE_PRIVATE)
    val userAge = userFile.getInt("user_age", 0)
    val userWei = userFile.getFloat("user_weight", 0.0f)
    val userHei = userFile.getFloat("user_height", 0.0f)


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFA500000),
                        Color(0xFA940101),
                        Color(0xFF910000),
                        Color(0xFF3F0000)

                    )
                )
            )
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Transparent),
            verticalArrangement = Arrangement.SpaceBetween

        ) {
            Text(
                text = stringResource(
                    R.string.your_bmi
                ),
                modifier = modifier
                    .padding(top = 70.dp)
                    .padding(horizontal = 15.dp),
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold
            )
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                modifier = modifier
                    .fillMaxWidth()
                    .height(700.dp)
                    .padding(top = 20.dp),
                shape = RoundedCornerShape(
                    topStart = 33.dp,
                    topEnd = 33.dp
                )


            ) {
                Column(
                    modifier = modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Card(
                        modifier = modifier
                            .padding(top = 10.dp)
                            .size(130.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 7.dp,
                            brush = Brush.linearGradient(
                                listOf(
                                    Color(0xFA500000),
                                    Color(0xFA940101),
                                    Color(0xFF910000),
                                    Color(0xFF3F0000)

                                )
                            )
                        )
                    ) {
                        Column(
                            modifier = modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "60,6",
                                fontSize = 40.sp,
                                fontWeight = FontWeight.ExtraBold

                            )
                        }
                    }
                    Text(
                        text = stringResource(
                            R.string.you_have
                        ),
                        modifier = modifier
                            .padding(top = 7.dp),
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.ExtraBold



                    )
                    Card(
                        modifier = modifier
                            .padding(top = 7.dp)
                            .height(95.dp)
                            .width(320.dp)

                    ) {
                        Row (
                            modifier = Modifier
                                .fillMaxSize()
                        ){
                            Column (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = stringResource(
                                        R.string.age
                                    ),
                                    modifier = Modifier
                                        .padding(3.dp)
                                )
                                Text(
                                    text = "$userAge" ,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Black
                                )
                            }
                            VerticalDivider(
                                modifier = Modifier
                                    .width(15.dp)
                            )
                            Column (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = stringResource(
                                        R.string.weight
                                    ),
                                    modifier = Modifier
                                        .padding(3.dp)
                                )
                                Text(
                                    text = "$userWei",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Black
                                )

                            }
                            VerticalDivider()
                            Column (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ){
                                Text(
                                    text = stringResource(
                                        R.string.height
                                    ),
                                    modifier = Modifier
                                        .padding(3.dp)

                                )
                                Text(
                                    text = "$userHei",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Black
                                )
                            }


                        }
                    }
                    Card(
                        modifier = modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth()
                            .height(230.dp),
                    ) { }
                    HorizontalDivider(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .height(15.dp)
                    )
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color(0xFF6A0303)),
                        modifier = modifier
                            .padding(top = 30.dp)
                            .width(300.dp)
                            .height(50.dp)

                    ) {
                        Text(
                            text = stringResource(
                                R.string.new_calc
                            ),
                            fontSize = 30.sp
                        )
                    }
                }

            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview() {
    BMIResultScrenn()
}