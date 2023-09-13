package com.example.unitconverter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.zip.DeflaterOutputStream

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edt : EditText = findViewById(R.id.KiloText)
        var btn : Button = findViewById(R.id.button)
        var Result : TextView = findViewById(R.id.ResultText)

        btn.setOnClickListener(){
            var kilo : Double = edt.text.toString().toDouble()
            var pound : Double = kilo * 2.20462
            Result.text = "$pound Pounds"
        }

    }
}