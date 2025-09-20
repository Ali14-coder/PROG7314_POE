package student.projects.jetpackpam.design_system

import androidx.compose.foundation.clickable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import student.projects.jetpackpam.ui.theme.Primary

@Composable
fun LinkButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
 Text(
     text = text,
     modifier = modifier
         .clickable(onClick = onClick),
     style = MaterialTheme.typography.titleSmall,
     color = Primary,
     textAlign = TextAlign.Center
 )

}