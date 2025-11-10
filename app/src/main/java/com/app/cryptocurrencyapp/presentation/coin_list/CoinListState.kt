package com.app.cryptocurrencyapp.presentation.coin_list

import com.app.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoading : Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
