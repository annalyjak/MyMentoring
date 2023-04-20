package com.lyjak.anna.mymentoring

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lyjak.anna.mymentoring.meeting2.Account
import com.lyjak.anna.mymentoring.meeting2.Bank
import com.lyjak.anna.mymentoring.meeting2.SaveAccount
import com.lyjak.anna.mymentoring.meeting2.SavingsAccount
import com.lyjak.anna.mymentoring.ui.theme.MyMentoringTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMentoringTheme {
                Screen()
            }
        }
    }
}

@Composable
fun Screen() {
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val bank = Bank()
        bank.createAccount(SaveAccount(1.0, 10.0, 1))
        bank.createAccount(SaveAccount(0.1, 40.0, 2))
        bank.createAccount(SaveAccount(0.1, 50.0, 3))
        bank.createAccount(SavingsAccount(10.0, 50.0, 4))
        bank.createAccount(SavingsAccount(10.0, 10.0, 5))
        bank.createAccount(SavingsAccount(9.0, 3.0, 6))
        val state = remember { mutableStateOf(bank.getAccounts()) }
        Column {
            bank.updateAccounts()
            AccountList(accountList = state)
            Button(onClick = {
                bank.updateAccounts()
                bank.createAccount(SavingsAccount(10.0, 3.0, 6))
                state.value = bank.getAccounts()
            }, modifier = Modifier, enabled = true) {
                Text(text = "Button")
            }
        }
    }
}

@Composable
fun AccountList(accountList: MutableState<List<Account>>) {
    LazyColumn {
        items(accountList.value) { item ->
            Text("Account ${item.getNumber()} status: ${item.getCurrentStage()}")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Goodby(name: String) {
    Column(
        Modifier
            .padding(50.dp)
    ) {
        Text(text = "By $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyMentoringTheme {
        Screen()
    }
}