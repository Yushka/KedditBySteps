@file:JvmName("ExtensionsUtils")
package com.kedditbusteps.yushka.kedditbysteps.commons.Extensions

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.kedditbusteps.yushka.kedditbysteps.R


/**
 * Created by Karnauhova.Y on 26.07.2017.
 */


fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

fun ImageView.loadImg(imageUrl: String) {
    if (TextUtils.isEmpty(imageUrl)) {
        Glide
                .with(context)
                .load(R.mipmap.ic_launcher)
                .into(this)
    } else {
        Glide
                .with(context)
                .load(imageUrl)
                .into(this)
    }
}