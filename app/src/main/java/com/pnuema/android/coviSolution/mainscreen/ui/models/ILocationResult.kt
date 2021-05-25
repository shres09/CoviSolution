package com.pnuema.android.coviSolution.mainscreen.ui.models

interface ILocationResult {
    fun areItemsSame(other: ILocationResult): Boolean
    fun areContentsSame(other: ILocationResult): Boolean
}