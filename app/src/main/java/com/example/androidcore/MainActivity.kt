package com.example.androidcore

import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView: TextView = findViewById<TextView>(R.id.Main_Text)

        // получение текста в перем

        val full_text = getString(R.string.agreement_full_text)
        val policity = getString(R.string.privacy_politicy)
        val confidental = getString(R.string.confidental_info)

        val spannableString = SpannableString(full_text)

        val confidentalClick = object : ClickableSpan() {
            override fun onClick(widget: View) {
                Snackbar.make(widget, "Go to Link", Snackbar.LENGTH_SHORT).show()
                TODO("Not yet implemented")
            }


            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = true
                ds.color = Color.parseColor("#FF3700B3")



            }
        }

        val policityClick = object : ClickableSpan() {
            override fun onClick(widget: View) {
                Snackbar.make(widget, "Go to Link2", Snackbar.LENGTH_SHORT).show()
                TODO("Not yet implemented")
            }


            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = true
                ds.color = Color.parseColor("#FF3700B3")

            }
        }
        spannableString.setSpan(confidentalClick,full_text.indexOf(confidental),
            full_text.indexOf(confidental) + confidental.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        spannableString.setSpan(policityClick,full_text.indexOf(policity),
            full_text.indexOf(policity) + policity.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        textView.run { text = spannableString
            movementMethod = LinkMovementMethod.getInstance()
        highlightColor = Color.TRANSPARENT }




        }



}