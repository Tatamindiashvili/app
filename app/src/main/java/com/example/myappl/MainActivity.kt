package com.example.myappl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var passwordre: EditText
    private lateinit var gilaki: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        registerListeners()

    }

    private fun init() {
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        passwordre = findViewById(R.id.passwordre)
        gilaki = findViewById(R.id.gilaki)
    }

    private fun registerListeners() {
        gilaki.setOnClickListener {
            val email = email.text.toString()
            val password = password.text.toString()
            val password_re = passwordre.text.toString()

            if (email.isEmpty()) {
                Toast.makeText(this, "შეიყვანეთ თქვენი ელ.ფოსტა", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                Toast.makeText(this, "შეიყვანე პაროლი", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password.length < 9) {
                Toast.makeText(this, "პაროლი უნდა შეიცავდეს მინიმუმ 6 სიმბოლოს", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }


            if (password_re.isEmpty()) {
                Toast.makeText(this, "გაიმეორე პაროლი", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password_re != password) {
                Toast.makeText(this, "პაროლები არ ემთხვევა", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
//            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
//                .addOnCompleteListener { task ->
//                    if(task.isSuccessful) {
//                        Toast.makeText(this, "მომხმარებელი წარმატებით დარეგისტრირდა", Toast.LENGTH_SHORT).show()
//                    } else {
//                        Toast.makeText(this, "აღნიშნული ელ. ფოსტა არ არსებობს ან უკვე რეგისტრირებულია", Toast.LENGTH_SHORT).show()
//                    }
//                }
        }
    }
}

