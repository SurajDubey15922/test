package com.example.jacoco

import com.saurabhbadola.statesman.annotations.State
import com.saurabhbadola.statesman.annotations.StateField
@State
data class Main(@StateField var name:String,
                @StateField var password:String,
                @StateField var remember:Boolean)
