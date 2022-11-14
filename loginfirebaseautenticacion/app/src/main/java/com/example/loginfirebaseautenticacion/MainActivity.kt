package com.example.loginfirebaseautenticacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var authStateListener: FirebaseAuth.AuthStateListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnIngresar : Button = findViewById(R.id.btnIngresar)
        val txtemail : TextView = findViewById(R.id.editEmail)
        val txtpass : TextView = findViewById(R.id.editPassword)
        btnIngresar.setOnClickListener()
        {

        }
    }

}