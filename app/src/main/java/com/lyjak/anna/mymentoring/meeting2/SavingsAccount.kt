package com.lyjak.anna.mymentoring.meeting2

class SavingsAccount(
    private var minimalAccount: Double,
    moneyStatus: Double,
    accountNumber: Int
) : Account(moneyStatus = moneyStatus, accountNumber = accountNumber) {

    override fun update() {
        if (moneyStatus < minimalAccount) {
            println("Przekroczyłeś minimalny status konta!")
        }
    }
}