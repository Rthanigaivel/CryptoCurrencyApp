package com.app.cryptocurrencyapp.data.repository

import javax.inject.Inject
import com.app.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.app.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.app.cryptocurrencyapp.data.remote.dto.CoinDto
import com.app.cryptocurrencyapp.domain.repository.CoinRepository

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}