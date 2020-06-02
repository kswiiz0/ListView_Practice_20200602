package com.phis.listview_practice_20200602

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.phis.listview_practice_20200602.adapters.RoomAdapter
import com.phis.listview_practice_20200602.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    val listRooms = ArrayList<Room>()
    lateinit var roomAdapter: RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }

    override fun setupEvents() {
        listViewRooms.setOnItemClickListener { parent, view, position, id ->

            val clickedRoom = listRooms.get(position)
            Toast.makeText(
                mContext,
                "${clickedRoom.getFormmatedAddressAndFloor()}(${clickedRoom.getFormmatedPrice()})을 선택하였습니다.",
                Toast.LENGTH_SHORT
            ).show()


        }
    }

    override fun setValues() {

        //데이터 생성
        addRooms()
        //어뎁터 설정
        roomAdapter = RoomAdapter(this, R.layout.list_room_item, listRooms)
        listViewRooms.adapter = roomAdapter

    }

    private fun addRooms() {
        //데이터를 생성/입력한다.
        listRooms.add(Room(8000, "강서구 등촌동", -1, "신축투룸/역세권/대형마트"))
        listRooms.add(Room(7000, "강서구 염창동", 0, "신축투룸/역세권/대형마트"))
        listRooms.add(Room(6500, "강서구 목2동", -2, "신축투룸"))
        listRooms.add(Room(18000, "강서구 화곡동", 2, "신축투룸/역세권/대형마트"))
        listRooms.add(Room(15000, "강서구 마곡동", 3, "신축투룸/역세권"))
        listRooms.add(Room(20000, "마포구 합정동", 5, "신축투룸/대형마트"))
        listRooms.add(Room(22000, "마포구 망원동", 4, "신축오피스텔/역세권"))
        listRooms.add(Room(58000, "강서구 화곡동", 2, "신축쓰리룸+/테라스/역세권/대형마트"))
        listRooms.add(Room(45000, "마포구 서교동", 3, "신축쓰리룸/역세권"))
    }

}
