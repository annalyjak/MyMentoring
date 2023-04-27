package com.lyjak.anna.mymentoring.meeting3

class Unbounded {

    fun example() {
        val p: MyPair<String, Int> = MyPair("Five", 5)
        val s: String = p.fst
        val numberInt: Int = p.snd
        val numberNum: Number = p.snd
    }

}

open class MyPair<A, B>(var fst: A, var snd: B) {

    override fun toString(): String {
        return "(" + fst + ", " + snd + ")"
    }
}

// Klasy generyczne mogą być rozszerzane przez dziedziczenie
// Klasa PairMut rozszerza funkcjonalność klasy Pair o możliwość zastępowania obiektów w istniejącej parze.
class PairMut<A, B>(fst: A, snd: B) : MyPair<A, B>(fst, snd) {

    fun setFstA(e: A) {
        fst = e
    }

    fun setSndB(e: B) {
        snd = e
    }
}

// Możliwe jest też zdefiniowanie klasy dla pary homogenicznej, w której obydwa elementy muszą być tego samego typu.
class PairHomo<A>(fst: A, snd: A) : MyPair<A, A>(fst, snd)