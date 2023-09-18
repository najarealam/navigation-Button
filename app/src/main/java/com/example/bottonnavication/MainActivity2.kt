package com.example.bottonnavication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.zip.Inflater

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var bttn1=findViewById<Button>(R.id.button1)
        var bttn2=findViewById<Button>(R.id.button2)

        fun showdialogbox(){

  var dialog=AlertDialog.Builder(this)
           dialog.setPositiveButton("yes",DialogInterface.OnClickListener { dialogInterface, i ->
               Toast.makeText(this, "His is positive Buton", Toast.LENGTH_SHORT).show()
           })

            var alter=dialog.create()
            dialog.show()

        }
    }
}