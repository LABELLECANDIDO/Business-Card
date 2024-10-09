package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {

                BusinessCard()
            }
        }
    }
}


data class ProfileData(
    val name: String = "Labelle",
    val title: String = "Desenvolvedora Android",
    val phone: String = "(81) 00000-0000",
    val email: String = "labelle.silva@faculdadenovaroma.com"
)

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFFF5F5F5)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(32.dp))
        ContactSection()
    }
}

// Composable para a seção do cabeçalho (logotipo, nome e título)
@Composable
fun HeaderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logotipo
        Image(
            painter = painterResource(id = R.drawable.ic_logo), //
            contentDescription = "Logotipo",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape) // Logotipo com bordas circulares
                .background(Color.Gray) // Placeholder para fundo da imagem
                .padding(bottom = 16.dp)
        )

        Text(
            text = "Labelle Candido",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Desenvolvedora Android",
            fontSize = 18.sp,
            color = Color.Gray
        )
    }
}


@Composable
fun ContactSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White, RoundedCornerShape(16.dp)) // Card com fundo branco e bordas arredondadas
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ContactRow(
            icon = Icons.Filled.Phone, // Ícone de telefone
            contentDescription = "Telefone",
            text = "(81) 96040-0200"
        )

        Spacer(modifier = Modifier.height(8.dp)) // Espaçamento entre telefone e email

        // Informações de Email
        ContactRow(
            icon = Icons.Filled.Email, // Ícone de email
            contentDescription = "Email",
            text = "labelle.silva@faculdadenovaroma.com.br"
        )
    }
}


@Composable
fun ContactRow(icon: androidx.compose.ui.graphics.vector.ImageVector, contentDescription: String, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = Color(0xFF3DDC84),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, fontSize = 16.sp)
    }
}
