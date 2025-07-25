package ru.job4j.lambda

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import ru.job4j.labmda.Account

class AccountTest {

    @Test
    fun filter1IvanWithPositiveBalanceTest() {
        val accounts = mutableListOf<Account>()
        accounts.add(Account("John", 5))
        accounts.add(Account("Marry", 0))
        accounts.add(Account("Ivan", 10))

        val resultAccounts = accounts.filter { it.name == "Ivan" && it.balance > 0 }

        Assertions.assertThat(resultAccounts.size).isEqualTo(1)
        Assertions.assertThat(resultAccounts[0].name).isEqualTo("Ivan")
        Assertions.assertThat(resultAccounts[0].balance).isEqualTo(10)
    }

    @Test
    fun filter1IvanWithPositiveBalanceAnd1IvanWithNegativeBalanceTest() {
        val accounts = mutableListOf<Account>()
        accounts.add(Account("Ivan", -1))
        accounts.add(Account("Marry", 0))
        accounts.add(Account("Ivan", 10))

        val resultAccounts = accounts.filter { it.name == "Ivan" && it.balance > 0 }

        Assertions.assertThat(resultAccounts.size).isEqualTo(1)
        Assertions.assertThat(resultAccounts[0].name).isEqualTo("Ivan")
        Assertions.assertThat(resultAccounts[0].balance).isEqualTo(10)
    }
}