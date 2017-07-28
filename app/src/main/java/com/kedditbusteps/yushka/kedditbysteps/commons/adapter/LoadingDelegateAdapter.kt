package com.kedditbusteps.yushka.kedditbysteps.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.kedditbusteps.yushka.kedditbysteps.R
import com.kedditbusteps.yushka.kedditbysteps.commons.inflate

/**
 * Created by Karnauhova.Y on 28.07.2017.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    override fun onCreateViewHolder(parent: ViewGroup) = LoadingViewHolder(parent)

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }

}