package com.lyjak.anna.mymentoring.meeting2

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Bank {

    private val accountsList: MutableList<Account> = mutableListOf()

    fun createAccount(account: Account) {
        accountsList.add(account)
    }

    fun updateAccounts() {
        accountsList.forEach { account ->
            account.update()
            println("Account ${account.getNumber()} has currently ${account.getCurrentStage()} $$$")
        }
    }

    @Composable
    fun PresentAccounts() {
        Column {
            accountsList.forEach {
                Text("Account ${it.getNumber()} status: ${it.getCurrentStage()}")
            }
        }
    }
}