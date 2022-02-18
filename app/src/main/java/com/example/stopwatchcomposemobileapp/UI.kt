package com.example.stopwatchcomposemobileapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton

import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UI(
    formattedTime: String,
    onStartClick: () -> Unit,
    onPauseClick: () -> Unit,
    onResetClick: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(R.drawable.stopwatch), contentDescription = "stopwatch",
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
        )

        Text(text = formattedTime, fontSize = 37.sp, color = Color.White)
        Spacer(Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            IconButton(
                onStartClick,
                modifier = Modifier
                    .size(55.dp)
                    .background(color = Color.DarkGray, shape = CircleShape)
            ) {
                Icon(
                    painter = painterResource(R.drawable.start),
                    contentDescription = "Start",
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .width(25.dp)
                        .height(25.dp)
                )
            }
            Spacer(Modifier.width(16.dp))
            IconButton(
                onPauseClick,
                modifier = Modifier
                    .size(55.dp)
                    .background(
                        color = Color.DarkGray,
                        shape = CircleShape
                    )
            ) {
                Icon(
                    painter = painterResource(R.drawable.pause),
                    contentDescription = "Pause",
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .width(25.dp)
                        .height(25.dp)
                )
            }
            Spacer(Modifier.width(16.dp))
            IconButton(
                onResetClick,
                modifier = Modifier
                    .size(55.dp)
                    .background(
                        color = Color.DarkGray,
                        shape = CircleShape
                    )
            ) {
                Icon(
                    painter = painterResource(R.drawable.reset),
                    contentDescription = "Reset",
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .width(25.dp)
                        .height(25.dp)
                )
            }
        }
    }
}