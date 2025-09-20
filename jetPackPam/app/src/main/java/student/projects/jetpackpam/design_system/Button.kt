package student.projects.jetpackpam.design_system

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


import student.projects.jetpackpam.ui.theme.Primary


@Composable
fun LongButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
)
{
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Primary
        )
    ) {
        Text(text = text,
        style = MaterialTheme.typography.titleSmall
        )
    }
}
