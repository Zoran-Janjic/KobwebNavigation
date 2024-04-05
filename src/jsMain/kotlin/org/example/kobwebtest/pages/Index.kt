package org.example.kobwebtest.pages

import androidx.compose.runtime.*
import com.stevdza.san.kotlinbs.components.BSButton
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.localStorage
import org.example.kobwebtest.components.ProfileCard
import org.example.kobwebtest.components.ThemeSwitchButton
import org.example.kobwebtest.examples.*
import org.example.kobwebtest.utils.Res
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    var buttonLoading by remember { mutableStateOf(false) }
    val context = rememberPageContext()
    val scope = rememberCoroutineScope()
    val breakpoint = rememberBreakpoint()

//    var colorMode by ColorMode.currentState

//    LaunchedEffect(colorMode) {
//        val savedTheme = localStorage.getItem(Res.String.SAVED_THEME) ?: ColorMode.LIGHT.name
//        colorMode = ColorMode.valueOf(savedTheme)
//    }
//
//    ThemeSwitchButton(
//        colorMode = colorMode,
//        onClick = {
//            colorMode = colorMode.opposite
//            localStorage.setItem(Res.String.SAVED_THEME, colorMode.name)
//        }
//    )

//    Box(
//        Modifier
//            .fillMaxSize()
//            .backgroundImage(
//                linearGradient(
//                    dir = LinearGradient.Direction.ToRight,
//                    from = if (colorMode.isLight) Res.Theme.GRADIENT_ONE.color
//                    else Res.Theme.GRADIENT_ONE_DARK.color,
//                    to = if (colorMode.isLight) Res.Theme.GRADIENT_TWO.color
//                    else Res.Theme.GRADIENT_TWO_DARK.color
//                )
//            ),
//        contentAlignment = Alignment.Center
//    ) {
//        ProfileCard(colorMode = colorMode)
//
//
//    }


    Column(modifier = Modifier.fillMaxSize()) {
        //  Examples
        navigationExample(context = context) {

//                Here should the index page go
            SimpleGridExample()


        }

    }

//    Column(modifier = Modifier.fillMaxSize()) {
//        SimpleGridExample()
//        FooterExample(breakpoint = breakpoint)
}
//    RowExamples()
//    ColumnExamples()
//}