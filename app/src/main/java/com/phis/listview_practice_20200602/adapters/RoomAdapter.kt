package com.phis.listview_practice_20200602.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.phis.listview_practice_20200602.R
import com.phis.listview_practice_20200602.datas.Room

class RoomAdapter(context: Context, resId: Int, list: List<Room>) :
    ArrayAdapter<Room>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        tempRow?.let{
            //tempRow가 null 아닐때 실행
        }.let{
            //tempRow가 null일때 실행
            tempRow = inf.inflate(R.layout.list_room_item, null)
        }
        val row = tempRow!!

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val memoTxt = row.findViewById<TextView>(R.id.memoTxt)

        val data = mList.get(position)

        priceTxt.text = data.getFormmatedPrice()
        addressAndFloorTxt.text = data.getFormmatedAddressAndFloor()
        memoTxt.text = data.memo

        return row
    }


}