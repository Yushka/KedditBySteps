package com.kedditbusteps.yushka.kedditbysteps.commons.adapter

import android.support.v4.util.SparseArrayCompat

/**
 * Created by Karnauhova.Y on 28.07.2017.
 */
class NewsAdapter {
    private var items: ArrayList<ViewType>

    private val loadingItem = object : ViewType {
        override fun getViewType() = AdapterConstants.LOADING
    }

    private var delegateAdapters = SparseArrayCompat<ViewTypeDelegateAdapter>()

    init {
        delegateAdapters.put(AdapterConstants.LOADING, LoadingDelegateAdapter())
        items = ArrayList()
        items.add(loadingItem)
    }
}