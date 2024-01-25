package com.senai.vsconnect_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.senai.vsconnect_kotlin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    //É uma propriedade privada  como o nome binding do tipo ActivityLoginBinding
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Atribui à variável binding um objeto que contém referências (propriedades) aos elementos definidos no layout
        binding = ActivityLoginBinding.inflate(layoutInflater)

        //setOnClickListener é um ouvinte de clique
        //Ou seja, quando clicar no botão entrar irá cair nesse bloco
        binding.btnEntrar.setOnClickListener {
            //variável mainIntent com a intenção de sair da LoginActivity e ir para MainActivity
            val mainIntent = Intent(this@LoginActivity, MainActivity::class.java)
            //executa a intenção armazenada na variável mainIntent
            startActivity(mainIntent)
            //finaliza a LoginActivity
            finish()
        }
        setContentView(binding.root)

    }
}