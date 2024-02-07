package com.example.facebooktimelinerv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {

    lateinit var image:ImageView
    var imageValu:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        image=findViewById(R.id.imageDetalis)

        var bundel:Bundle?=intent.extras

        if (bundel != null) {
            imageValu=bundel.getInt("image")
        }

         image.setImageResource(imageValu)


    }

}