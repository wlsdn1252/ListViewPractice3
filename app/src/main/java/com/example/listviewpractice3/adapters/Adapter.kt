package com.example.listviewpractice3.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listviewpractice3.R
import com.example.listviewpractice3.datas.PhoneData

class Adapter (val mCOntext : Context,val resId : Int, val mList : List<PhoneData>): ArrayAdapter<PhoneData>(mCOntext,resId,mList) {

    val inflater = LayoutInflater.from(mCOntext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
         var tmpRow = convertView
        // 리스트의 포지션을 찾기위한 변수 대입
        val listPosition = mList[position]

        if(tmpRow == null){
            tmpRow = inflater.inflate(R.layout.phone_infomation_item_list,null)
        }
        val row = tmpRow!!

        // xml파일에서 id를 찾아 변수에 대입
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val phoneInfoTxt = row.findViewById<TextView>(R.id.phoneInfoTxt)

        // 리스트의 id를 찾아 변수에 대입
        // 최종 데이터가 화면에 구현
        nameTxt.text = listPosition.name
        phoneInfoTxt.text = listPosition.phoneInfo

        return row
    }

}