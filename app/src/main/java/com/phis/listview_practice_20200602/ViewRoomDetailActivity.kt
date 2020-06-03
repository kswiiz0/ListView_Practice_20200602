package com.phis.listview_practice_20200602

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.phis.listview_practice_20200602.datas.Room
import kotlinx.android.synthetic.main.activity_view_room.*

class ViewRoomDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room)

    }

    override fun setupEvents() {
        btnGoBack.setOnClickListener {
            finish()
        }

    }

    override fun setValues() {
        val room = intent.getSerializableExtra("room") as Room

        tvRoomPrice.text = room.getFormmatedPrice().toString()
        tvMemo.text = room.memo.toString()
        tvAddress.text = room.address.toString()
        tvFloor.text = room.getFormmatedFloor().toString()

    }


}
