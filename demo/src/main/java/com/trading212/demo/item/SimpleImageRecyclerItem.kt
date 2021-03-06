package com.trading212.demo.item

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trading212.demo.R
import com.trading212.diverserecycleradapter.DiverseRecyclerAdapter

/**
 * Created by svetlin on 9.12.17.
 */
class SimpleImageRecyclerItem : DiverseRecyclerAdapter.RecyclerItem<Nothing, SimpleImageRecyclerItem.ViewHolder>() {

    companion object {

        @JvmField
        val TYPE = ItemType.SIMPLE_IMAGE.ordinal
    }

    override val type: Int = TYPE

    override fun createViewHolder(parent: ViewGroup, inflater: LayoutInflater): ViewHolder
            = ViewHolder(inflater.inflate(R.layout.item_simple_image, parent, false))

    class ViewHolder(itemView: View) : DiverseRecyclerAdapter.ViewHolder<Nothing>(itemView) {

        override fun bindTo(data: Nothing?) {}
    }
}