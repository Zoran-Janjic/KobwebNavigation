package org.example.kobwebtest.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
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
import org.example.kobwebtest.examples.ExampleRow1
import org.example.kobwebtest.examples.SimpleGridExample
import org.example.kobwebtest.examples.navigationExample

@Page
@Composable
fun Contact() {
    val context = rememberPageContext()

    navigationExample(context = context) {

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 1),
            modifier = Modifier.fillMaxSize().backgroundColor(Colors.LightPink)
        ) {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                SpanText(text = "Example full row in contact")
            }

        }

    }

}