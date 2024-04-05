package org.example.kobwebtest.examples

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.Text


@Composable
fun ColumnExamples() {

    Column(
        modifier = Modifier.background(Colors.LightBlue).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceAround
    ) {
        Box(
            modifier = Modifier.background(Colors.LightCyan).minHeight(25.percent).minWidth(80.percent),
            Alignment.Center
        ) {
            Text(value = "Ola from John column 1")
        }
        Box(
            modifier = Modifier.background(Colors.LightGray).minHeight(25.percent).minWidth(80.percent),
            Alignment.Center
        ) {
            Text(value = "Ola from John column 2")
        }
        Box(
            modifier = Modifier.background(Colors.LightCoral).minHeight(25.percent).minWidth(80.percent),
            Alignment.Center
        ) {
            Text(value = "Ola from John column 3")
        }
    }
}