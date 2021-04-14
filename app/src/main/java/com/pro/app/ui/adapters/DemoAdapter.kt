package com.pro.app.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.pro.app.R
import com.pro.app.data.models.DemoItem
import com.pro.app.databinding.ItemDemoBinding
import com.pro.app.ui.base.BaseAdapterNormal
import com.pro.app.ui.views.activities.MainActivity

class DemoAdapter(
    private val context: Context,
    private val data: List<DemoItem>,
    private val handleClick: MainActivity
) : BaseAdapterNormal<DemoItem>() {

    override fun createBinding(parent: ViewGroup, viewType: Int): ViewDataBinding {
        return DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            getItemLayoutId(0),
            parent,
            false
        )
    }

    override fun getItemLayoutId(viewType: Int) = R.layout.item_demo

    override fun bind(binding: ViewDataBinding, position: Int) {
        val bind = binding as ItemDemoBinding
        bind.item = data[position]
        bind.callback = handleClick
    }

    override fun bindWithPayload(binding: ViewDataBinding, position: Int, any: Any) {}

    override fun getItemCount() = data.size
}