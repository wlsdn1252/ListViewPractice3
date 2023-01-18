package com.example.listviewpractice3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice3.adapters.Adapter
import com.example.listviewpractice3.datas.PhoneData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : Adapter
    val phoneList = ArrayList<PhoneData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phoneList.add(PhoneData("강진우","갤럭시s22+"))
        phoneList.add(PhoneData("이봉준","아이폰+"))
        phoneList.add(PhoneData("ㅁㅁㅁ","샤오미"))
        phoneList.add(PhoneData("ㅇㅇㅇ","ㅏㅏㅏ"))
        phoneList.add(PhoneData("ㄱㄱㄱ","ㅂㅂㅂ"))
        phoneList.add(PhoneData("ㅅㅅㅅ","ㅇㄻㅈㄷ"))

        mAdapter = Adapter(this,R.layout.phone_infomation_item_list,phoneList)

        mainListView.adapter = mAdapter



    }
}