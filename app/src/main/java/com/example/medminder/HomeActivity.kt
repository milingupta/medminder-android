package com.example.medminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val actionBar = supportActionBar
        actionBar!!.title = "Home"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val cataractButton: Button = findViewById(R.id.buttonCataract)
        val glaucomaButton: Button = findViewById(R.id.buttonGlaucoma)
        val uveitisButton: Button = findViewById(R.id.buttonUveitis)
        val dryEyeButton: Button = findViewById(R.id.buttonDryEye)

        cataractButton.setOnClickListener {
            val intent = Intent(this, CataractTreatmentActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_menu_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.TreatmentSummary -> {
                val intent = Intent(this, SummaryActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.Help -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}