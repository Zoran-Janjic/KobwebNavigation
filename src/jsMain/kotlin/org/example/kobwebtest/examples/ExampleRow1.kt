package org.example.kobwebtest.examples

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.silk.components.text.SpanText

@Composable
fun ExampleRow1() {
    Row(modifier = Modifier.background(Colors.LightSeaGreen).fillMaxSize()) {
        SpanText(text = "Example full row 1")
    }
}
