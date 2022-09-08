package com.daniel.ugd1_a_0544

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var inputUsername : TextInputLayout
    private lateinit var inputPassword : TextInputLayout
    private lateinit var mainLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputUsername = findViewById(R.id.inputLayoutUsername)
        inputPassword = findViewById(R.id.inputLayoutPassword)
        val btnClear : Button = findViewById(R.id.btnClear)
        val btnLogin : Button = findViewById(R.id.btnLogin)
        val btnRegister : Button = findViewById(R.id.btnRegister)

        btnClear.setOnClickListener {
            inputUsername.getEditText()?.setText("")
            inputPassword.getEditText()?.setText("")
            Snackbar.make(mainLayout,"Text Cleared Success",Snackbar.LENGTH_LONG).show()
        }

        btnLogin.setOnClickListener {
            var checkLogin = false
            val username: String = inputUsername.getEditText()?.getText().toString()
            val password: String = inputPassword.getEditText()?.getText().toString()

            if (username.isEmpty()){
                inputUsername.setError("Username Must Be Filled With Text")
                checkLogin = false
            }
            if (password.isEmpty()){
                inputPassword.setError("Password Must Be Filled With Text")
                checkLogin = false
            }
            if(username =="admin" && password == "0544") {
                checkLogin=true
            }
            if (!checkLogin) return@setOnClickListener
        }

        btnRegister.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
    }
}