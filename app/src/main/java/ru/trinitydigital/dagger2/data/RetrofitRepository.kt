package ru.trinitydigital.dagger2.data

interface RetrofitRepository {
    suspend fun loadBLogs(limit: Int, page: Int): BaseListingResponse<BlogModel>
}

class RetrofitRepositoryImpl(private val network: RetrofitIteractor) : RetrofitRepository {
    override suspend fun loadBLogs(limit: Int, page: Int): BaseListingResponse<BlogModel> {
        val s = network.loadBLogs(limit, page)
        return s
    }
}