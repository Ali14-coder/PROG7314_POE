package student.projects.jetpackpam.screens.bottomnavscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import student.projects.jetpackpam.R


@Composable
fun HomeScreen(onMessageClick: () -> Unit) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color.White // optional background color
    ) { paddingValues ->


            Column(
                modifier = Modifier
                    .padding(50.dp).padding(paddingValues).padding(top = 80.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(50.dp)
            ) {
                // Image
                Image(
                    painter = painterResource(id = R.drawable.pamicon),
                    contentDescription = "PAM",
                    modifier = Modifier.size(270.dp).fillMaxWidth()
                )

                // Text
                Text(
                    text = "I’m ready to help you with anything.\nJust type below or say the word",
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.SansSerif

                )


                Row(modifier = Modifier
                    .fillMaxWidth()
                    ){
                    ElevatedButton( onClick = { "You want to talk to me?" }) {
                        Icon(imageVector = Icons.Default.ChatBubbleOutline, contentDescription = "TextButton"
                               )
                    }
                }


            }

    }
}


@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen(
        onMessageClick = { /* do nothing for preview */ }
    )
}


