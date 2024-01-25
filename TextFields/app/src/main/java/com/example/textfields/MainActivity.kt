package com.example.textfields

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.textfields.ui.theme.TextFieldsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var text by remember { mutableStateOf("Type here...") }
        TextField(value = text, onValueChange = { newText ->
            text =
                newText //when something change, recomposition will update the state, cause text are being observed.
        },
            label = {
                Text(text = "Title")
            },
            maxLines = 1,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email Icon"
                )
            },
            trailingIcon = {
                IconButton(onClick = {
                    Log.d("Trailling Icon", "Clicked")
                }) {}
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Check Icon"
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Log.d("ImeAction", "Clicked")
                }
            )
        )
    }
}

@Composable
fun Greeting2() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var text by remember { mutableStateOf("Type here...") }
        OutlinedTextField(value = text, onValueChange = { newText ->
            text =
                newText //when something change, recomposition will update the state, cause text are being observed.
        },
            label = {
                Text(text = "Title")
            },
            maxLines = 1,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email Icon"
                )
            },
            trailingIcon = {
                IconButton(onClick = {
                    Log.d("Trailling Icon", "Clicked")
                }) {}
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Check Icon"
                )
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    Log.d("ImeAction", "Clicked")
                }
            )
        )
    }
}

@Composable
fun Greeting3() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var text by remember { mutableStateOf("Type here...") }
        BasicTextField(value = text, onValueChange = { newText ->
            text =
                newText //when something change, recomposition will update the state, cause text are being observed.
        },
            keyboardActions = KeyboardActions(
                onSearch = {
                    Log.d("ImeAction", "Clicked")
                }
            )
        )
    }
}

@Composable
fun Greeting4() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var password by rememberSaveable { mutableStateOf("") } //rememberSavable keeps the activity lifecycle if rotates the screen for example
        var passwordVisibility by remember { mutableStateOf(false) }

        val icon = if (passwordVisibility) {
            painterResource(id = R.drawable.baseline_visibility_24)
        } else {
            painterResource(id = R.drawable.baseline_visibility_off_24)
        }

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            placeholder = { Text(text = "Password") },
            label = { Text(text = "Password") },
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Visibility icon"
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = if (passwordVisibility) VisualTransformation.None
            else PasswordVisualTransformation()
        )
    }
}

@Composable
fun Greeting5() {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                value = text, onValueChange = { newText ->
                    text =
                        newText //when something change, recomposition will update the state, cause text are being observed.
                },
                label = {
                    Text(text = "Email")
                },
                maxLines = 1,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon"
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = "Check Icon"
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Done
                )
            )

            var password by rememberSaveable { mutableStateOf("") } //rememberSavable keeps the activity lifecycle if rotates the screen for example
            var passwordVisibility by remember { mutableStateOf(false) }

            val icon = if (passwordVisibility) {
                painterResource(id = R.drawable.baseline_visibility_24)
            } else {
                painterResource(id = R.drawable.baseline_visibility_off_24)
            }

            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                placeholder = { Text(text = "Password") },
                label = { Text(text = "Password") },
                trailingIcon = {
                    IconButton(onClick = {
                        passwordVisibility = !passwordVisibility
                    }) {
                        Icon(
                            painter = icon,
                            contentDescription = "Visibility icon"
                        )
                    }
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = if (passwordVisibility) VisualTransformation.None
                else PasswordVisualTransformation()
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextFieldsTheme {
        Greeting()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    TextFieldsTheme {
        Greeting2()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    TextFieldsTheme {
        Greeting3()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    TextFieldsTheme {
        Greeting4()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    TextFieldsTheme {
        Greeting5()
    }
}