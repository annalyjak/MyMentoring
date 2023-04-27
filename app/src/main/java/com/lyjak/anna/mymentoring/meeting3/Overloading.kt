package com.lyjak.anna.mymentoring.meeting3

class Overloading {

    fun exampleOnNumbers() {
        val forNumbers = (1 as Int) + (1.5 as Double)
    }

    fun exampleOnClasses() {
        val num: Number = 1.2
        val i: Int = 2
        var a = AA()
        a.m(i)
        val b = BB()
        b.m(num)
        b.m(i)
        a = b
        a.m(num)
        a.m(i)
    }

}

open class AA {
    open fun m(a: Number) { // parametr ogólniejszy
        println("A")
    }
}

class BB : AA() {

    fun m(b: Int) {
        println("B")
    }

}
