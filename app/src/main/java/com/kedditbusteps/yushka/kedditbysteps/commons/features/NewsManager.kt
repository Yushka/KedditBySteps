package com.kedditbusteps.yushka.kedditbysteps.commons.features

import com.kedditbusteps.yushka.kedditbysteps.api.RestAPI
import com.kedditbusteps.yushka.kedditbysteps.commons.RedditNewsItem
import rx.Observable

/**
 * Created by Yushka on 29.07.2017.
 */
class NewsManager(private val api: RestAPI = RestAPI()) {
    fun getNews(limit: String = "10"): Observable<List<RedditNewsItem>> {
        return Observable.create {
            subscriber ->
            val callResponse = api.getNews("", limit)
            val response = callResponse.execute()

            if (response.isSuccessful) {
                val news = response.body().data.children.map {
                    val item = it.data
                    RedditNewsItem(item.author, item.title, item.numComments,
                            item.created, item.thumbnail, item.url)
                }
                subscriber.onNext(news)
                subscriber.onCompleted()
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }
}