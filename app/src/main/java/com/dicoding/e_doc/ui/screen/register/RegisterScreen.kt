package com.dicoding.e_doc.ui.screen.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dicoding.e_doc.R

@Composable
fun RegisterScreen() {
    Column(
        modifier = Modifier
            .padding(start = 32.dp, end = 32.dp)
            .background(color = Color(0xFFFFFFFF)), horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Sign Up",
            modifier = Modifier.padding(top = 64.dp),
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),
            )
        )
        Text(
            text = "Selamat Datang",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF5B5B5B),
            )
        )
        Image(
            painter = painterResource(R.drawable.selfie),
            contentDescription = "Selife image",
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .padding(top = 53.dp)
                .size(80.dp),
        )
        Text(
            text = "Email", modifier = Modifier.padding(top = 53.dp), style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            )
        )
        SimpleOutlinedTextFieldSample()
        Text(
            text = "Password", modifier = Modifier.padding(top = 18.dp), style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            )
        )
        SimpleOutlinedTextFieldSample()
        Text(
            text = "Konfirmasi Password",
            modifier = Modifier.padding(top = 18.dp),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            )
        )
        SimpleOutlinedTextFieldSample()
        FilledTonalButtons {}

        Row(modifier = Modifier.padding(top = 12.dp)) {
            Text(
                text = "Sudah Punya Akun? ",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF5B5B5B),
                )
            )
            Text(
                text = "Masuk",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF5B5B5B),
                )
            )
        }


    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleOutlinedTextFieldSample() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 8.dp),
        value = text,
        onValueChange = { text = it },
    )
}

@Composable
fun FilledTonalButtons(onClick: () -> Unit) {
    Button(onClick = { onClick() }, colors = ButtonDefaults.buttonColors(
        containerColor = Color(0xFF3A94EC),
        contentColor = Color.White),modifier = Modifier
        .padding(top = 52.dp)
        .fillMaxWidth()
        .height(53.dp)
        ) {
        Text("Daftar")
    }
}