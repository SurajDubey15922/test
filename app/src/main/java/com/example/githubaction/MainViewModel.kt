package com.example.githubaction

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.jacoco.MainState
import com.saurabhbadola.statesman.BaseViewModel

class MainViewModel(application: Application) :BaseViewModel<MainState>(application) {


    override fun createInitialState(): MainState {
        return MainState(
            name = "",
            password = "",
            remember = false
        )
    }

    fun setName(name:String?){
        setState(
            MainState(
                name=name
            )
        )
    }

    fun setRemember(remember:Boolean){
        setState(MainState(
            remember=remember
        ))
    }

    fun setPassword(password:String?){
        setState(
            MainState(
                password=password
            )
        )

    }

}