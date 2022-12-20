package com.example.medminder.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CataractTreatment(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)