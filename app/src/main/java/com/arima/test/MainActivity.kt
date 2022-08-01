package com.arima.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvShowNumbers: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvShowNumbers = findViewById(R.id.tvShowNumbers)
        var numberPicker: NumberPicker = findViewById(R.id.numberPicker)
        numberPicker.minValue = 0
        numberPicker.maxValue = 8
        numberPicker.value = 4
        var data = arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I")
        numberPicker.displayedValues = data
        numberPicker.wrapSelectorWheel = false
        numberPicker.setOnValueChangedListener { picker, oldVal, newVal ->
            tvShowNumbers.setText("Old Value: " + oldVal.toString() + " New Value: " + newVal.toString())
        }
    }
}