package com.example.androidcore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<TextView>(R.id.Main_Text)

        // получение текста в перем

        val full_text = getString(R.string.agreement_full_text)
        val confidental = getString(R.string.confidental_info)
        val policity = getString(R.string.privacy_politicy)

        val spannableString = SpannableString(full_text)

        val confidentalClicable = object : ClickableSpan() {

            override fun onClick(widget: View) {
                SnackBar.make
                TODO("Not yet implemented")
            }

        }

    }


}