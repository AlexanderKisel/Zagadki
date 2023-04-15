package com.example.zagadki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.zagadki.databinding.ActivityStatBinding

class StatActivity : AppCompatActivity() {
    private lateinit var bind: ActivityStatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind= ActivityStatBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.textView9.text=intent.getStringExtra("yep")
        bind.textView10.text=intent.getStringExtra("bruh")
    }
    fun returnClick(view: View){
        finish()
    }
}