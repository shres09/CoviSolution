package com.pnuema.android.coviSolution.api

import com.pnuema.android.coviSolution.mainscreen.ui.models.LocationResult

interface LocationResultsListener {
    fun success(locations: ArrayList<LocationResult>)
    fun failed()
}