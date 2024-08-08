package com.example.mentorshipprogramloginregisterpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mentorshipprogramloginregisterpractice.ui.theme.MentorshipProgramLoginRegisterPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MentorshipProgramLoginRegisterPracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column(modifier = Modifier.padding(innerPadding)){
                        Text(
                            "Hey This Is Uzair!",
                            color = Color.Blue,
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            textAlign = TextAlign.Justify,
                            modifier = Modifier.background(Color.Red)
                                .fillMaxSize(.8f)
                            )
                    }
                }
            }
        }
    }
}