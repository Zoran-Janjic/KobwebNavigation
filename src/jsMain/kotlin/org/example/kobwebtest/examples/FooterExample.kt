package org.example.kobwebtest.examples

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun FooterExample(breakpoint: Breakpoint) {
    if (breakpoint <= Breakpoint.SM) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .minHeight(30.px)
                .maxHeight(30.px)
                .padding(all = 50.px).backgroundColor(Colors.LightPink),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box() { Text(value = "Ola from John footer 1") }
            Box() { Text(value = "Ola from John footer 2") }
            Box() { Text(value = "Ola from John footer 3") }
        }
    } else {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .minHeight(30.px)
                .maxHeight(30.px)
                .padding(all = 30.px),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Box() { Text(value = "Ola from John footer 1") }
            Box() { Text(value = "Ola from John footer 2") }
            Box() { Text(value = "Ola from John footer 3") }
        }
    }
}