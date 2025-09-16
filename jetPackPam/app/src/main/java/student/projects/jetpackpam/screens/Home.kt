package student.projects.jetpackpam.screens

import ads_mobile_sdk.h3
import android.R.attr.onClick
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import student.projects.jetpackpam.R
import student.projects.jetpackpam.ui.theme.White


@Composable
fun HomeScreen(onMessageClick: () -> Unit) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color.White // optional background color
    ) { paddingValues ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues), // respect Scaffold padding
            contentAlignment = Alignment.BottomCenter // content aligned toward bottom
        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(25.dp)
            ) {
                // Image
                Image(
                    painter = painterResource(id = R.drawable.pamicon),
                    contentDescription = "PAM",
                    modifier = Modifier.size(320.dp)
                )

                // Text
                Text(
                    text = "I’m ready to help you with anything.\nJust type below or say the word",
                    fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )

                // Button
                MessageButton(onClick = onMessageClick)
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


@Composable
fun MessageButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,  // no cast needed
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = White, // background color
            contentColor = Color.Black           // text & icon color
        )

    ) {

            Icon(
                imageVector = Icons.Default.Create,
                contentDescription = "Message Icon",
                modifier = Modifier.size(24.dp),

            )


    }
}
