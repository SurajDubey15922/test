package com.example.githubaction

abstract class Test {
    var color: String
    abstract fun area(): Double
    abstract override fun toString(): String

    constructor(color: String?) {
        System.out.println("Shape constructor called");
        this.color = color!!

    }

    @JvmName("getColor1")
     fun getColor(): String? {
        return color
    }



}

internal class Circle(color: String?, radius: Double) : Test(color) {
    var radius: Double

    init {

        // calling Shape constructor
        println("Circle constructor called")
        this.radius = radius
    }

    override fun area(): Double {
        return Math.PI * Math.pow(radius, 2.0)
    }

    override fun toString(): String {
        return "Circle color is " + super.getColor()
            .toString() + "and area is : " + area()
    }
}

internal class Rectangle(
    color: String?, length: Double,
    width: Double
) : Test(color) {
    var length: Double
    var width: Double

    val res1 = { a: Int,b:Int -> a + b }


    init {
        // calling Shape constructor
        println("Rectangle constructor called")
        this.length = length
        this.width = width
    }

    override fun area(): Double {
        return length * width
    }

    override fun toString(): String {
        return "Rectangle color is " + super.getColor()
            .toString() + "and area is : " + area()
    }
}

