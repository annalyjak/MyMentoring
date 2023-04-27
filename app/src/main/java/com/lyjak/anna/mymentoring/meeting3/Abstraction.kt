package com.lyjak.anna.mymentoring.meeting3

abstract class Abstraction {
    val exampleVariable: Int = 5

    fun exampleFunction() = println("A")
    // fun exampleFunctionInAbstractClass() <- compilation error - it must have body!
}

interface Interface {
    val example: Number
    // val example: Number = 10 <- compilation error

    fun exampleFunctionInInterface()
    fun exampleFunctionInInterfaceWithDefaultImplementation() = println("I")
}

open class Example: Abstraction(), Interface {
    override val example: Number = 10

    override fun exampleFunctionInInterface() {
        // required to implement because do not have default implementation
    }
}