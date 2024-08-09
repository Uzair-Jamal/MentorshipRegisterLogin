package com.example.mentorshipprogramloginregisterpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Place
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mentorshipprogramloginregisterpractice.ui.theme.MentorshipProgramLoginRegisterPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MentorshipProgramLoginRegisterPracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xfffed523))
                        .padding(innerPadding)
                        .padding(top = 80.dp),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally
                    )
                    {
                        Text("Create Your Account",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.ExtraBold
                        )

                        Spacer(modifier = Modifier.height(80.dp))

                        TextField("", onValueChange = {}, modifier = Modifier.fillMaxWidth(0.7f),
                            placeholder = {
                                Text("Name")
                            },
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent
                            ),
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Person, contentDescription = null, tint = Color.Black)
                            }
                        )
                        Spacer(modifier = Modifier.height(15.dp))

                        TextField("", onValueChange = {},modifier = Modifier.fillMaxWidth(0.7f),
                            placeholder = {
                                Text("Add")
                            },
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent
                            ),
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Place, contentDescription = null, tint = Color.Black)
                            }
                        )

                        Spacer(modifier = Modifier.height(15.dp))

                        TextField("", onValueChange = {},modifier = Modifier.fillMaxWidth(0.7f),
                            placeholder = {
                                Text("Email")
                            },
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent
                            ),
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Email, contentDescription = null, tint = Color.Black)
                            }
                        )
                        Spacer(modifier = Modifier.height(15.dp))

                        TextField("", onValueChange = {},modifier = Modifier.fillMaxWidth(0.7f),
                            placeholder = {
                                Text("Password")
                            },
                            colors = TextFieldDefaults.colors(
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent
                            ),
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Lock, contentDescription = null, tint = Color.Black)
                            }
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Row(verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth(0.6f)) {
                        Checkbox(checked = true, onCheckedChange = {}, colors = CheckboxDefaults.colors(
                            checkedColor = Color.Black,
                            uncheckedColor = Color.Black
                        ))
                        Text("I read and agree ", color = Color.Black, fontSize = 10.sp)
                        Text("Terms and Condition", color=Color.Blue, fontSize = 10.sp)
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth(.6f),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Black
                            ),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text("Register",
                                color = Color(0xfffed523),
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp)
                        }

                    }
                }
            }
        }
    }
}