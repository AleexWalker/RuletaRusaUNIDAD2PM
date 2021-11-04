package com.example.ruletarusaunidad2pm

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton2 = false ; button2.isEnabled = false
        var boton3 = false ; button3.isEnabled = false
        var boton4 = false ; button4.isEnabled = false
        var boton5 = false ; button5.isEnabled = false
        var boton6 = false ; button6.isEnabled = false
        var boton7 = false ; button7.isEnabled = false
        var tambor : Int = 0

        button8.setOnClickListener {
            tambor = (2..7).random()
            button2.isEnabled = true ; button3.isEnabled = true ; button4.isEnabled = true ; button5.isEnabled = true ; button6.isEnabled = true ; button7.isEnabled = true
            boton2 = false ; boton3 = false ; boton4 = false ; boton5 = false ; boton6 = false ; boton7 = false ;
            if (tambor == 2)
                boton2 = true
            if (tambor == 3)
                boton3 = true
            if (tambor == 4)
                boton4 = true
            if (tambor == 5)
                boton5 = true
            if (tambor == 6)
                boton6 = true
            if (tambor == 7)
                boton7 = true

            background.setBackgroundColor(Color.parseColor("#fafafa"))
            textView.text = ""
        }

        button2.setOnClickListener {
            if (boton2) {
                background.setBackgroundColor(Color.parseColor("#c62828"))
                disableButtons()
                textView.text = "¡BANG!"
            }
            else {
                background.setBackgroundColor(Color.parseColor("#4caf50"))
                button2.isEnabled = false
            }
        }

        button3.setOnClickListener {
            if (boton3) {
                background.setBackgroundColor(Color.parseColor("#c62828"))
                disableButtons()
                textView.text = "¡BANG!"
            }
            else {
                background.setBackgroundColor(Color.parseColor("#4caf50"))
                button3.isEnabled = false
            }
        }

        button4.setOnClickListener {
            if (boton4) {
                background.setBackgroundColor(Color.parseColor("#c62828"))
                disableButtons()
                textView.text = "¡BANG!"
            }
            else {
                background.setBackgroundColor(Color.parseColor("#4caf50"))
                button4.isEnabled = false
            }
        }

        button5.setOnClickListener {
            if (boton5) {
                background.setBackgroundColor(Color.parseColor("#c62828"))
                disableButtons()
                textView.text = "¡BANG!"
            }
            else {
                background.setBackgroundColor(Color.parseColor("#4caf50"))
                button5.isEnabled = false
            }
        }

        button6.setOnClickListener {
            if (boton6) {
                background.setBackgroundColor(Color.parseColor("#c62828"))
                disableButtons()
                textView.text = "¡BANG!"
            }
            else {
                background.setBackgroundColor(Color.parseColor("#4caf50"))
                button6.isEnabled = false
            }
        }

        button7.setOnClickListener {
            if (boton7) {
                background.setBackgroundColor(Color.parseColor("#c62828"))
                disableButtons()
                textView.text = "¡BANG!"
            }
            else {
                background.setBackgroundColor(Color.parseColor("#4caf50"))
                button7.isEnabled = false
            }
        }
    }

    fun disableButtons() {
        // Get all touchable views
        val botonesArray: ArrayList<View> = layout.touchables

        // loop through them, if they are instances of Button, disable them.
        for (i in botonesArray) {
            if (i is Button) {
                (i as Button).setEnabled(false)
            }
        }
        button8.isEnabled = true
    }
}