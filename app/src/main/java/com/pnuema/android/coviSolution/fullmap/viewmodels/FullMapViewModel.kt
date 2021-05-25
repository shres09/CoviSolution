package com.pnuema.android.coviSolution.fullmap.viewmodels

import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.LatLng
import com.pnuema.android.coviSolution.mainscreen.ui.models.LocationResult

class FullMapViewModel : ViewModel() {
    var locationResults: List<LocationResult> = ArrayList()
    var currentLocation: LatLng? = null
}