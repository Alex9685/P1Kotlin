package com.example.P1Kotlin;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnSaludar: Button
    private lateinit var btnLimpiar: Button
    private lateinit var btnCerrar: Button
    private lateinit var lblSaludar: TextView
    private lateinit var txtNombre: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Relación de los objetos Kotlin con las vistas XML
        btnSaludar = findViewById(R.id.btnSaludar)
        lblSaludar = findViewById(R.id.lblSaludar)
        txtNombre = findViewById(R.id.txtNombre)
        btnLimpiar = findViewById(R.id.btnLimpiar)
        btnCerrar = findViewById(R.id.btnCerrar)

        // Codificar evento click botón Saludar
        btnSaludar.setOnClickListener {
            if (txtNombre.text.toString().isEmpty()) {
                // Falta capturar el nombre
                Toast.makeText(this@MainActivity, "Favor de ingresar el nombre", Toast.LENGTH_SHORT).show()
            } else {
                val saludar = txtNombre.text.toString()
                lblSaludar.text = "Hola $saludar, Se bienvenido a esta preciosa aplicación"
            }
        }

        // Codificar evento click botón Limpiar
        btnLimpiar.setOnClickListener {
            // Limpiar el contenido del EditText y el TextView
            txtNombre.text.clear()
            lblSaludar.text = ""
            txtNombre.requestFocus()
        }

        // Codificar evento click botón Cerrar
        btnCerrar.setOnClickListener {
            finish()
        }
    }
}
