package com.kedditbusteps.yushka.kedditbysteps

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kedditbusteps.yushka.kedditbysteps.commons.inflate
import kotlinx.android.synthetic.main.news_fragment.*

/**
 * Created by Karnauhova.Y on 26.07.2017.
 */
class NewsFragment : Fragment() {
    private val newsList by lazy {
        news_list
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = container?.inflate(R.layout.news_fragment)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        newsList.setHasFixedSize(true)
        newsList.layoutManager = LinearLayoutManager(context)
    }
}
