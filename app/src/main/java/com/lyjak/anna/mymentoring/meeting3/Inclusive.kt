package com.lyjak.anna.mymentoring.meeting3

class Inclusive {

    fun example() {
        lateinit var p: Pair
        p = Pair("Five", 5)
        var numeral: String = p.fst as String
        var number: Int = p.snd as Int
        numeral = p.snd as String // wyjątek: ClassCastException
    }

}

class Pair(var fst: Any, var snd: Any) {

    override fun toString(): String {
        return "(" + fst + ", " + snd + ")"
    }
}

