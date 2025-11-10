package com.app.cryptocurrencyapp.domain.repository

import com.app.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.app.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}