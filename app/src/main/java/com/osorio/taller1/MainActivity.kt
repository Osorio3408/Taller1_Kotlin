package com.osorio.taller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        val switchButton = findViewById<Switch>(R.id.switch1)
        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        var text = editText.text.toString()
        var ToggleChecked = toggleButton.isChecked
        var radiotext = radioButton.text.toString()
        var switchChecked = switchButton.isChecked

        Toast.makeText(this, "$text $radiotext $ToggleChecked $switchChecked ", Toast.LENGTH_LONG).show()

    }
}