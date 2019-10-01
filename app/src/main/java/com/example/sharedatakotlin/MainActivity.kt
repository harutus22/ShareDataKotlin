package com.example.sharedatakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun send(view: View){
        shareData()
    }

    private fun shareData() {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_SUBJECT, "My Subject is here")
        intent.putExtra(Intent.EXTRA_EMAIL, "merdok@yavoo.stephen")
        intent.putExtra(Intent.EXTRA_TEXT, messageField.text.toString())
        intent.putExtra(Intent.EXTRA_TITLE, "The beginning of the end")
        startActivity(Intent.createChooser(intent, "Share by"))
    }
}
