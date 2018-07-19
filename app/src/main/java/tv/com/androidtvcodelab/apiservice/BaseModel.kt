package tv.com.androidtvcodelab.apiservice

data class BaseModel<T>(
        var page: Int,
        var total_results: Int,
        var total_pages: Int,
        var results: T? = null
)