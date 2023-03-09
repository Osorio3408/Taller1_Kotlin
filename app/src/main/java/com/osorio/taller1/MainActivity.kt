package com.osorio.taller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnEnter: Button = findViewById(R.id.btnPresioname)
        btnEnter.setOnClickListener { ejecutarAccion() }
    }

    private fun ejecutarAccion() {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioBtnId = radioGroup.checkedRadioButtonId
        val radioButton = findViewById<RadioButton>(radioBtnId)
        val checkBox1:CheckBox = findViewById<CheckBox>(R.id.checkBox1)
        val checkBox2:CheckBox = findViewById<CheckBox>(R.id.checkBox2)
        val switchButton = findViewById<Switch>(R.id.switch1)
        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        var text = editText.text.toString()
        var toggleChecked = toggleButton.isChecked
        var radiotext = radioButton.text.toString()
        var switchChecked = switchButton.isChecked
        var checkbox1 = checkBox1.isChecked
        var checkbox2 = checkBox2.isChecked

        Toast.makeText(this, "$text \n $radiotext Seleccionado \n $checkbox1 \n $checkbox2 \n $toggleChecked \n $switchChecked \n", Toast.LENGTH_LONG).show()



    }
}