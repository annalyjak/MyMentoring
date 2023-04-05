package com.lyjak.anna.mymentoring.meeting2

class SaveAccount(
    private var percent: Double,
    moneyStatus: Double,
    accountNumber: Int
) : Account(moneyStatus = moneyStatus, accountNumber = accountNumber) {

    override fun update() {
        moneyStatus = (moneyStatus + moneyStatus * percent)
    }

}