package org.example.kobwebtest.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.kobwebtest.components.displayModal
import org.example.kobwebtest.examples.ExampleRow1
import org.example.kobwebtest.examples.ExampleRow2
import org.example.kobwebtest.examples.navigationExample

@Page
@Composable
fun About() {
    val context = rememberPageContext()


    navigationExample(context = context) {
        Box(Modifier.fillMaxSize().backgroundColor(Colors.Lime), contentAlignment = Alignment.Center) {
            Column() {
                SpanText(text = "Example full row in about")
                displayModal()
            }
        }
    }
}