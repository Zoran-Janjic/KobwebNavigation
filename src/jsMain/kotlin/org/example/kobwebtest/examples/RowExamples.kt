package org.example.kobwebtest.examples

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.Text


@Composable
fun RowExamples() {
    Row(
        modifier = Modifier.background(Colors.LightSalmon).fillMaxWidth().height(5.percent),
        horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically
    ) {
        Box() { Text(value = "Ola from John row 1") }
        Box() { Text(value = "Ola from John row 2") }
        Box() { Text(value = "Ola from John row 3") }
    }

}
