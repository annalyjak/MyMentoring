package com.lyjak.anna.mymentoring.meeting3

class Bounded {

    fun example() {
        val l1: MutableList<BBB> = mutableListOf()
        l1.add(BBB())
        l1.add(CCC())

        val l2: MutableList<out AAA> = l1
        //l2.add(AAA()) // błąd kompilacji (nie wiadomo, jakiego typu elementy na liście)

        val a: AAA = l2[0] // Bezpieczne odczyty (na pewno dzieci AAA)
        println(l2[1]::class.java.name) // class CCC
    }

}

open class AAA
open class BBB : AAA()
class CCC : BBB()