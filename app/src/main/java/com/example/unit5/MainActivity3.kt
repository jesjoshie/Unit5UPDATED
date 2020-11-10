package com.example.unit5

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        val pickBtn = findViewById<Button>(R.id.pickDateBtn)
        val dateTv1 = findViewById(R.id.dateTv)as TextView
        val shwinfo = findViewById<Button>(R.id.show_info)




        pickBtn.setOnClickListener {
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view: DatePicker, mYear: Int, mMonth: Int, mDay: Int ->
                    dateTv1.setText("" + mDay + "/" + mMonth + "/" + mYear)
                }, year, month, day
            )
            dpd.show()
        }
            shwinfo.setOnClickListener {

                val datebirth = dateTv1.text.toString()
                val intent = Intent(this@MainActivity3, MainActivity2::class.java)

                intent.putExtra("BirthDate:", datebirth)
                startActivity(intent)
            }
        }

    }
