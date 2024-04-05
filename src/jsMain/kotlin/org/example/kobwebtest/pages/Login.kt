package org.example.kobwebtest.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText

@Page
@Composable
fun loginPage(){
    SpanText(text = "Login")
}