package org.example.kobwebtest.examples

import androidx.compose.runtime.Composable
import com.stevdza.san.kotlinbs.components.BSNavBar
import com.stevdza.san.kotlinbs.models.BackgroundStyle
import com.stevdza.san.kotlinbs.models.button.ButtonVariant
import com.stevdza.san.kotlinbs.models.navbar.*
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.OutlineColor
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.example.kobwebtest.components.Navigation.Screen
import org.example.kobwebtest.utils.Res
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Col

@Composable
fun navigationExample(context: PageContext, content: @Composable () -> Unit) {
    val breakpoint = rememberBreakpoint()

    BSNavBar(
        modifier = Modifier.fillMaxWidth(),
        stickyTop = true,
        itemsAlignment = Alignment.CenterHorizontally,
        brand = NavBarBrand(
            title = "JapanWing",
            href = "#"
        ),
        expand = NavBarExpand.MD,
        backgroundStyle = BackgroundStyle.Primary,
        items = listOf(
            NavLink(
                id = "homeLink",
                title = "Home",
                onClick = {
                    context.router.navigateTo(Screen.HomePage.route)
                }
            ),
            NavLink(
                id = "contactLink",
                title = "Contact",
                onClick = {
                    context.router.navigateTo(Screen.ContactPage.route)
                }
            ),
            NavLink(
                id = "aboutLink",
                title = "About",
                onClick = { context.router.navigateTo(Screen.AboutPage.route) }
            ),

            NavDropdown(
                placeholder = "Language",
                items = listOf(
                    NavDropdownItem(
                        id = "kotlinLanguage",
                        title = "Kotlin",
                        onClick = {
                            println("Index: $it Title: Kotlin")
                        }
                    ),
                    NavDropdownItem(
                        id = "javaLanguage",
                        title = "Java",
                        onClick = {}
                    )
                )
            )
        ),
        button = NavBarButton(
            text = "Logout",
            variant = ButtonVariant.LightOutline,
            onClick = { println("logged out") }
        )
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        content()
        FooterExample(breakpoint)
    }
}