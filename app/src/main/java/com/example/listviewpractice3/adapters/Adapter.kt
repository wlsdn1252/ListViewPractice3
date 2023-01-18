package com.example.listviewpractice3.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewpractice3.R
import com.example.listviewpractice3.datas.PhoneData

class Adapter (val mCOntext : Context,val resId : Int, val mList : List<PhoneData>): ArrayAdapter<PhoneData>(mCOntext,resId,mList) {

    val inflater = LayoutInflater.from(mCOntext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
         var tmpRow = convertView

        if(tmpRow == null){
            tmpRow = inflater.inflate(R.layout.phone_infomation_item_list,null)
        }
        val row = tmpRow!!
        return row
    }

}