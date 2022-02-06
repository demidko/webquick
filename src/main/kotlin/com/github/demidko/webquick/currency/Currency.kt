package com.github.demidko.webquick.currency

sealed interface Currency {

  val count: Int

  private class Dollars(override val count: Int) : Currency

  private class Euros(override val count: Int) : Currency

  private class Roubles(override val count: Int) : Currency

  companion object {
    fun dollars(count: Int): Currency = Dollars(1)
    fun roubles(count: Int): Currency = Roubles(1)
    fun euros(count: Int): Currency = Euros(1)
  }
}