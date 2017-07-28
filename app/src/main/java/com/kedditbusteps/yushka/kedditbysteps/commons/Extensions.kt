@file:JvmName("ExtensionsUtils")
package com.kedditbusteps.yushka.kedditbysteps.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * Created by Karnauhova.Y on 26.07.2017.
 */


fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}