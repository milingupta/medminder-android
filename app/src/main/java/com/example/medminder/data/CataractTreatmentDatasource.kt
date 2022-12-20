package com.example.medminder.data

import com.example.medminder.R
import com.example.medminder.model.CataractTreatment

class CataractTreatmentDatasource {
    fun loadCataractTreatments(): List<CataractTreatment> {
        return listOf<CataractTreatment>(
            CataractTreatment(R.string.cataract1, R.drawable.ic_color_yellow),
            CataractTreatment(R.string.cataract2, R.drawable.ic_color_tan),
            CataractTreatment(R.string.cataract3, R.drawable.ic_color_pink),
            CataractTreatment(R.string.cataract4, R.drawable.ic_color_gray),
            CataractTreatment(R.string.cataract5, R.drawable.ic_color_black)
        )
    }
}