package com.lyjak.anna.mymentoring.meeting3

class Overriding {

    fun example() {
        var a = A()
        var n: Number = a.m()
        println(n) // wypisuje: 3.14
        a = B()
        n = a.m()
        println(n) // wypisuje: 5
    }

}

open class A {
    open fun m(): Number = 3.14
}
class B : A() {
    override fun m(): Number = 5.0
}
