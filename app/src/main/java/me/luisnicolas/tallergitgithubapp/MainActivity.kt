package me.luisnicolas.tallergitgithubapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.mi_foto), // pon tu imagen en res/drawable
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Nicolás Bernal", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text(text = "Desarrollador Móvil Jr.", fontSize = 16.sp, color = Color(0xFF1976D2))

        Spacer(modifier = Modifier.height(24.dp))

        ProfileField(label = "EDAD", value = "20 años")
        ProfileField(label = "CORREO", value = "lbernal818@unab.edu.co")
        ProfileField(label = "CIUDAD", value = "Bucaramanga, Colombia")

        Spacer(modifier = Modifier.height(16.dp))
        HorizontalDivider()
        Spacer(modifier = Modifier.height(16.dp))


        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { /* acción de contacto */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Contactar conmigo")
        }
    }
}

@Composable
fun ProfileField(label: String, value: String) {
    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp)) {
        Text(text = label, fontSize = 11.sp, color = Color.Gray)
        Text(text = value, fontSize = 15.sp)
    }
}
