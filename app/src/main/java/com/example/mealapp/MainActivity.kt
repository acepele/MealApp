package com.example.mealapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {


    var costPerMeal = 5.50
    var numberOfMeals: Int = 0
    var totalCharges: Double = 0.00
    var tipChoice = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var meals: EditText = findViewById(R.id.idAmount)
        var group: Spinner = findViewById(R.id.idChoices)
        var charges: Button = findViewById(R.id.idBtn)
        var result: TextView = findViewById(R.id.txtResult)

        charges.setOnClickListener{
            numberOfMeals = meals.text.toString().toInt()
            var currency = DecimalFormat("$###,###.00")
            totalCharges = costPerMeal * numberOfMeals.toDouble()
            tipChoice = group.selectedItem.toString()
            var totalChargesFormatted = currency.format(totalCharges)

            result.text = "Cost for meal with $tipChoice tips for $numberOfMeals orders is $totalChargesFormatted"


        }
    }
}