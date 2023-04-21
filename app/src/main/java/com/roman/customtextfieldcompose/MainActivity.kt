package com.roman.customtextfieldcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.roman.custom_text_field_compose.EmailTextFiled
import com.roman.custom_text_field_compose.OutlinedEmailTextFiled
import com.roman.custom_text_field_compose.OutlinedPasswordTextField
import com.roman.custom_text_field_compose.PasswordTextField
import com.roman.customtextfieldcompose.ui.theme.CustomTextFieldComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CustomTextFieldComposeTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        var outlinedPassword by remember { mutableStateOf("") }
                        var outlinedEmail by remember { mutableStateOf("") }
                        var filledPassword by remember { mutableStateOf("") }
                        var filledEmail by remember { mutableStateOf("") }

                        Spacer(modifier = Modifier.height(40.dp))

                        OutlinedPasswordTextField(
                            value = outlinedPassword,
                            onValueChange = { newValue ->
                                outlinedPassword = newValue
                            }
                        )

                        Spacer(modifier = Modifier.height(40.dp))

                        PasswordTextField(
                            value = filledPassword,
                            onValueChange = { newValue ->
                                filledPassword = newValue
                            }
                        )

                        Spacer(modifier = Modifier.height(40.dp))

                        OutlinedEmailTextFiled(
                            value = outlinedEmail,
                            onValueChange = { newValue ->
                                outlinedEmail = newValue
                            }
                        )

                        Spacer(modifier = Modifier.height(40.dp))

                        EmailTextFiled(
                            value = filledEmail,
                            onValueChange = { newValue ->
                                filledEmail = newValue
                            }
                        )
                    }
                }
            }
        }
    }
}