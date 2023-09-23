package com.nirvikbasnet.expensetracker.ui.screens

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.runtime.*

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IncomeForm(onSubmit: (Double) -> Unit) {
    var incomeText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Record Income", style = MaterialTheme.typography.labelMedium)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = incomeText,
            onValueChange = {
                incomeText = it
            },
            label = { Text(text = "Income Amount") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            modifier = Modifier
                .fillMaxWidth()
        )

       TextField(
            value = incomeText,
            onValueChange = {
                incomeText = it
            },
            label = { Text(text = "Income Amount") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val income = incomeText.toDoubleOrNull()
                if (income != null) {
                    onSubmit(income)
                    incomeText = ""
                }
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Submit")
        }
    }
}

@Composable
@Preview
fun IncomeFormPreview(){
    IncomeForm {  }
}

