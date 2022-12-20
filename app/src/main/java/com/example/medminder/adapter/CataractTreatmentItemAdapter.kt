package com.example.medminder.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.medminder.CataractTreatmentActivity
import com.example.medminder.R
import com.example.medminder.model.CataractTreatment
import com.google.android.material.materialswitch.MaterialSwitch

class CataractTreatmentItemAdapter(
    private val context: Context,
    private val dataset: List<CataractTreatment>
    ): RecyclerView.Adapter<CataractTreatmentItemAdapter.CataractTreatmentItemViewHolder>() {

    class CataractTreatmentItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title_cataract_treatment)
        val imageView: ImageView = view.findViewById(R.id.item_image_cataract_treatment)

        // Switch
        @SuppressLint("UseSwitchCompatOrMaterialCode")
        val switch: Switch = view.findViewById(R.id.item_switch_cataract_treatment)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CataractTreatmentItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_cataract_treatment, parent, false)
        return CataractTreatmentItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: CataractTreatmentItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}