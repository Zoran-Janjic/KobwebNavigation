package org.example.kobwebtest.components

import androidx.compose.runtime.*
import com.stevdza.san.kotlinbs.components.BSButton
import com.stevdza.san.kotlinbs.components.BSModal
import com.stevdza.san.kotlinbs.components.BSSpinner
import com.stevdza.san.kotlinbs.components.showModalOnClick
import com.stevdza.san.kotlinbs.forms.BSCheckbox
import com.stevdza.san.kotlinbs.models.SpinnerVariant
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.percent


@Composable
fun displayModal() {


    BSModal(
        id = "updateTeachers",
        title = "Set available teachers",
        body = {

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                BSSpinner(variant = SpinnerVariant.Default)
            }


        },

        positiveButtonText = "Update",
        negativeButtonText = "Cancel",
        onPositiveButtonClick = {
            println("Clicked")
        },
        onNegativeButtonClick = {}
    )

    BSButton(
        modifier = Modifier.showModalOnClick(id = "updateTeachers"),
        text = "Click me",
        onClick = {}
    )
}
