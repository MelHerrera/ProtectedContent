package com.example.protectedcontent

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var lab3_text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lab3_text = findViewById(R.id.lab3_text)

        val tuple = ContentValues()
        tuple.put(Constants.TEXT, Constants.TEXT_DATA)
        contentResolver.insert(Constants.URL, tuple)

        val cols = arrayOf(Constants.ID, Constants.TEXT)
        val u = Constants.URL
        val c = contentResolver.query(u, cols, null, null, null)

        if(c?.moveToFirst() == true)
            lab3_text.text = "Data read from content provider: " + c.getString(c.getColumnIndexOrThrow(Constants.TEXT))
        else
            lab3_text.text = "Access denied"
    }
}