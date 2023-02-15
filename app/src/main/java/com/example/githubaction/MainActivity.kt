package com.example.githubaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s1: Circle = Circle("Red", 2.2)
        val s2: Rectangle = Rectangle("Yellow", 2.0, 4.0)
       val result=  s2.res1(3,5)
        System.out.println(result.toString())
        System.out.println(s1.toString())
        System.out.println(s2.toString())
        val arr= arrayOf(-1,0,3,4)
        println(arr.filter { a-> a>1 })



    }
}