package com.kedditbusteps.yushka.kedditbysteps.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.kedditbusteps.yushka.kedditbysteps.R
import com.kedditbusteps.yushka.kedditbysteps.commons.Extensions.getFriendlyTime
import com.kedditbusteps.yushka.kedditbysteps.commons.Extensions.inflate
import com.kedditbusteps.yushka.kedditbysteps.commons.Extensions.loadImg
import com.kedditbusteps.yushka.kedditbysteps.commons.RedditNewsItem
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by Yushka on 29.07.2017.
 */
class NewsDelagateAdapter : ViewTypeDelegateAdapter{
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return NewsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as NewsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class NewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}