package com.pnuema.android.coviSolution.api

import com.pnuema.android.coviSolution.details.models.DetailsResponse
import com.pnuema.android.coviSolution.mainscreen.models.FoursquareResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Service endpoints for interacting with the Foursquare API
 */
interface FoursquareService {
    companion object {
        private const val CLIENT_ID = "0LHUCVKQUVPPQRGLZNVYYM2RJUXTRJCR1UJSJSD0O2BRO3GL"
        private const val CLIENT_SECRET = "FIGBAFKIKG231IY5QUMDIP0VW5FZYXVPCLALX0CQZHKON5IK"
        private const val VERSION = "20180401"
        private const val COMMON_PARAMS = "&client_id=$CLIENT_ID&client_secret=$CLIENT_SECRET&v=$VERSION"

        //47.606200,-122.332100     ll=47.606200,-122.332100&
    }

    @GET("/v2/venues/search?limit=20$COMMON_PARAMS")
    fun getLocationResults(@Query("query") query: String, @Query("ll") latlng: String): Call<FoursquareResponse>

    @GET("/v2/venues/{venue_id}/?$COMMON_PARAMS")
    fun getDetails(@Path("venue_id") venueId: String): Call<DetailsResponse>
}