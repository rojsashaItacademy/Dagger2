package ru.trinitydigital.dagger2.data

interface RetrofitIteractor {
    suspend fun loadBLogs(limit: Int, page: Int): BaseListingResponse<BlogModel>
}

class RetrofitIteractorImpl(private val service: RetrofitApi) : RetrofitIteractor {

    override suspend fun loadBLogs(limit: Int, page: Int): BaseListingResponse<BlogModel> {
        return service.loadBlogs(limit = limit, page = page, order = "{\"created_at\":\"asc\"}")
    }

}