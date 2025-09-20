package student.projects.jetpackpam.design_system

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import student.projects.jetpackpam.ui.theme.Primary


@Composable
fun TextFieldLong(
    text: String,
    onValueChange: (String) -> Unit,
    label: String,
    hint: String,
    isTextSecret: Boolean,
    modifier: Modifier = Modifier
)
{
    var isPasswordVisible by remember {
        mutableStateOf(false)
}
    Column (
        modifier = modifier
    ){
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = text,
            onValueChange = onValueChange,
            visualTransformation = if(isPasswordVisible){
                PasswordVisualTransformation(mask = '*')
            }else VisualTransformation.None,
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = Primary,
                focusedBorderColor = Primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text = hint,
                    style = MaterialTheme.typography.bodyLarge
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            trailingIcon = {
                if(isTextSecret){
                    IconButton(
                        onClick = {isPasswordVisible = !isPasswordVisible}
                    ) {
                        when {
                            isPasswordVisible ->{
                                    Icon(
                                        imageVector = Icons.Default.VisibilityOff,
                                        contentDescription = "Hide password"
                                    )
                            }
                            !isPasswordVisible ->{
                                Icon(
                                    imageVector = Icons.Default.Visibility,
                                    contentDescription = "Show password"
                                )

                        }
                        }
                    }
                }


            }
        )
    }
}

//@Composable
//@Preview(showBackground = true)
//fun TextLong() {
//    TextFieldLong(
//        onMessageClick = { /* do nothing for preview */ }
//    )
//}