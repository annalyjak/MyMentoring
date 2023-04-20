package com.lyjak.anna.mymentoring.meeting2

class Bank {

    val accountsList: MutableList<Account> = mutableListOf()

    fun createAccount(account: Account) {
        accountsList.add(account)
    }

    fun updateAccounts() {
        accountsList.forEach { account ->
            account.update()
            println("Account ${account.getNumber()} has currently ${account.getCurrentStage()} $$$")
        }
    }

    fun getAccounts() = accountsList.toList()
}