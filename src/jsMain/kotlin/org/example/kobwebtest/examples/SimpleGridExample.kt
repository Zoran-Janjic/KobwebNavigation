package org.example.kobwebtest.examples

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint

@Composable
fun SimpleGridExample() {

    SimpleGrid(numColumns = numColumns(base = 1, md = 2), modifier = Modifier.fillMaxSize()) {
        ExampleRow1()
        ExampleRow2()
    }

}