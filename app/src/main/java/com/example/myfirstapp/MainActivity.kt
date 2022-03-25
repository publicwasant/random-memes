package com.example.myfirstapp

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val memes = arrayOf(
            R.drawable.meme1,
            R.drawable.meme2,
            R.drawable.meme3,
            R.drawable.meme4,
            R.drawable.meme5,
            R.drawable.meme6,
            R.drawable.meme7,
            R.drawable.meme8,
            R.drawable.meme9,
            R.drawable.meme10,
            R.drawable.meme11,
            R.drawable.meme12,
            R.drawable.meme13,
            R.drawable.meme14
        )

        val jokes = arrayOf(
            "มึงก็ไม่ชอบล่ะไอ่เหี้ย",
            "วันพระใหญ่น่าา",
            "Why do we tell actors to break a leg? Because every play has a cast.",
            "What did one traffic light say to the other? Stop looking! I'm changing!",
            "What do you call a boomerang that wont't come back? -A stick.",
            "Why did the teacher draw on the window? because he wanted his lesson to be very clear!"
        )

        val imageView = findViewById<ImageView>(R.id.imageView)
        val randomButton = findViewById<Button>(R.id.random_button)

        imageView.setImageResource(memes.random())
        randomButton.setOnClickListener {
            imageView.setImageResource(memes.random())
            Toast.makeText(this,  jokes.random(), Toast.LENGTH_LONG).show()
        }
    }
}