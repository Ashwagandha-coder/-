package com.example.androidcore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.TextPaint
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<TextView>(R.id.Main_Text)

        // получение текста в перем

        val full_text = getString(R.string.agreement_full_text)
        val policity = getString(R.string.privacy_politicy)
        val confidental = getString(R.string.confidental_info)

        val spannableString = SpannableString(full_text)

        val confidentalClick = object : ClickableSpan() {
            override fun onClick(widget: View) {
                Snackbar.make(widget, "Go to Link", SnackBar.LENGTH_SHORT).show()
                TODO("Not yet implemented")
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)


            }
        }




        }



}