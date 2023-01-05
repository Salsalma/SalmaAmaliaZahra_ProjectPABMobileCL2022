package com.salma.film

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movies(
    var title : String = "",
    var genre : String = "",
    var rate : String = "",
    var detail : String = "",
    var photo : Int = 0,
) : Parcelable
