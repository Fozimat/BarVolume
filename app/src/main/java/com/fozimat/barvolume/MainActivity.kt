package com.fozimat.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtWidth : EditText
    private lateinit var edtLength : EditText
    private lateinit var edtHeight : EditText
    private lateinit var btnCalculate : Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtWidth = findViewById(R.id.edt_width)
        edtLength = findViewById(R.id.edt_length)
        edtHeight = findViewById(R.id.edt_height)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_calculate) {
            val inputWidth = edtLength.text.toString().trim()
            val inputLength = edtLength.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()

            val volume = inputWidth.toDouble() * inputLength.toDouble() * inputHeight.toDouble()
            tvResult.text = volume.toString()
        }
    }
}