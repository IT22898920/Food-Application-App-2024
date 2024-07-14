package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

@SuppressLint("StaticFieldLeak")
lateinit var textView13 : TextView
lateinit var textView9 : TextView
lateinit var textView10 : TextView
lateinit var addBtn : TextView
lateinit var addToCartBtn : TextView
lateinit var cart : ImageView
lateinit var home : ImageView
lateinit var addBtn_1 : TextView
lateinit var textView15 :TextView
lateinit var profile : ImageView
lateinit var imageView3 : ImageView
lateinit var textView20 : TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutResId = intent.getIntExtra(
            "layout",
            R.layout.frist
        )
        setContentView(layoutResId)

if(layoutResId == R.layout.signup_activity){
    textView13 = findViewById(R.id.textView13)
        textView13.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("layout", R.layout.login_activity)
            }
            startActivity(intent)
            finish()
        }
    }
        if(layoutResId==R.layout.intro_activity){
            textView10 = findViewById(R.id.textView10)

            textView10.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.signup_activity)
                }
                startActivity(intent)
                finish()
            }


        }

        if(layoutResId==R.layout.intro_activity){
            textView9 = findViewById(R.id.textView9)

            textView9.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.login_activity)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId==R.layout.login_activity){
            textView13 = findViewById(R.id.textView13)

            textView13.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_main)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.activity_main){
            addBtn = findViewById(R.id.addBtn)

            addBtn.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_show_details)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.activity_show_details){
            addToCartBtn = findViewById(R.id.addToCartBtn)

            addToCartBtn.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_cart_list)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.activity_main){
            cart = findViewById(R.id.cart)

            cart.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_cart_list)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.activity_cart_list){
            home = findViewById(R.id.home)

            home.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_main)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.activity_main){
            addBtn_1 = findViewById(R.id.addBtn_1)

            addBtn_1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_show_details)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.activity_main){
            textView15 = findViewById(R.id.textView15)

            textView15.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_show_details)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.activity_main){
            profile = findViewById(R.id.profile)

            profile.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.account_profile)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.activity_cart_list){
            profile = findViewById(R.id.profile)

            profile.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.account_profile)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.account_profile){
            home = findViewById(R.id.home)

            home.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_main)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.account_profile){
            cart = findViewById(R.id.cart)

            cart.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_cart_list)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.activity_main){
            imageView3 = findViewById(R.id.imageView3)

            imageView3.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.account_profile)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.frist_1){
            textView20 = findViewById(R.id.textView20)

            textView20.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.intro_activity)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId==R.layout.frist){
            textView20 = findViewById(R.id.textView20)

            textView20.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.frist_1)
                }
                startActivity(intent)
                finish()
            }
        }
    }

}