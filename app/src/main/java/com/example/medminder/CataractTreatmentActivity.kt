package com.example.medminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.widget.AppCompatSeekBar
import androidx.recyclerview.widget.RecyclerView
import com.example.medminder.adapter.CataractTreatmentItemAdapter
import com.example.medminder.data.CataractTreatmentDatasource
import com.example.medminder.model.CataractTreatment

class CataractTreatmentActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cataract_treatment)

        val myDataset = CataractTreatmentDatasource().loadCataractTreatments()
        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewCataractTreatment)
        recyclerView.adapter = CataractTreatmentItemAdapter(this, myDataset)

        /**
         * This setting is only needed to improve performance.
         * Use this setting if you know that changes in content
         * do not change the layout size of the RecyclerView.
         */
        recyclerView.setHasFixedSize(true)

        val actionBar = supportActionBar
        actionBar!!.title = "Cataract Surgery"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.treatment_menu_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.TreatmentSummary -> {
                val intent = Intent(this, SummaryActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.Home -> {
                val intent = Intent(this, HomeActivity::class.java)
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