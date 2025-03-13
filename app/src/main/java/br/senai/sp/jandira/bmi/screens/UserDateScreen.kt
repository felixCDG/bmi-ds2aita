package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Tag
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen(modifier: Modifier = Modifier) {

   var ageState = remember {
       mutableStateOf("Age")
   }
    var weiState = remember {
       mutableStateOf("Weight")
   }
    var heiState = remember {
       mutableStateOf("Height")
   }



    Box (
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
    ){
        Column (
            modifier = modifier
                .fillMaxSize()
                .background(Color.Transparent),
            verticalArrangement = Arrangement.SpaceBetween

        ){
            Text(
                text = stringResource(
                    R.string.hi
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
                Column (
                    modifier = modifier
                        .fillMaxSize()
                        .padding(top = 20.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row (
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(bottom = 0.dp)
                    ){
                        Column {
                            Image(
                                painter = painterResource(
                                    R.drawable.mas
                                ),
                                contentDescription = "",
                            )
                            Button(
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(Color(0xFF6A0303)),
                                modifier = Modifier
                                    .padding(horizontal = 42.dp)
                                    .width(100.dp)

                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.male
                                    ),
                                    fontWeight = FontWeight.ExtraBold
                                )
                            }
                        }
                        Column{
                            Image(
                                painter = painterResource(
                                    R.drawable.fem
                                ),
                                contentDescription = "",
                            )
                            Button(
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(Color(0xFF6A0303)),
                                modifier = Modifier
                                    .padding(horizontal = 45.dp)
                                    .width(100.dp)
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.female
                                    ),
                                )
                            }
                        }
                    }
                    Column (
                        modifier = modifier
                            .fillMaxWidth()
                            .height(380.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.spacedBy(18.dp)

                    ){
                        OutlinedTextField(
                            value = ageState.value,
                            onValueChange = {
                                ageState.value = it
                            },
                            modifier = modifier
                                .width(320.dp)
                                .padding(bottom = 18.dp),
                            shape = RoundedCornerShape(20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number

                            ),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Tag,
                                    contentDescription = "",
                                    tint = Color(0xFF910000)

                                )
                            }

                        )
                        OutlinedTextField(
                            value = weiState.value,
                            onValueChange = {
                                weiState.value = it
                            },
                            modifier = modifier
                                .width(320.dp)
                                .padding(bottom = 18.dp),
                            shape = RoundedCornerShape(20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number

                            ),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Balance,
                                    contentDescription = "",
                                    tint = Color(0xFF910000)

                                )
                            }
                        )
                        OutlinedTextField(
                            value = heiState.value,
                            onValueChange = {
                                heiState.value = it
                            },
                            modifier = modifier
                                .width(320.dp),
                            shape = RoundedCornerShape(20.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number

                            ),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Height,
                                    contentDescription = "",
                                    tint = Color(0xFF910000)

                                )
                            }
                        )
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(Color(0xFF6A0303)),
                            modifier = modifier
                                .padding(top = 50.dp)
                                .width(320.dp)
                                .height(50.dp)


                        ) {
                            Text(
                                text = stringResource(
                                    R.string.calculate
                                ),
                                fontSize = 30.sp
                            )
                        }
                    }
                    
                }
            }
        }
    }



}





@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview(){
    UserDataScreen()
}