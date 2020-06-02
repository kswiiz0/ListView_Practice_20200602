package com.phis.listview_practice_20200602.datas

import java.text.DecimalFormat
import java.text.NumberFormat


class Room(val price: Int, val address: String, val floor: Int, val memo: String) {

    fun getFormmatedAddressAndFloor(): String {
        var floorTxt: String

        if (floor < 0) {
            floorTxt = "지하${floor * -1}층"
        } else if (floor == 0) {
            floorTxt = "반지하"
        } else {
            floorTxt = "${floor}층"
        }



        return "${this.address}, ${floorTxt}"
    }

    fun getFormmatedPrice(): String {
        if (this.price < 10000) {
            return NumberFormat.getInstance().format(this.price)

        } else {
            var uk = this.price / 10000
            var remainder = this.price % 10000

            return "${uk}억${NumberFormat.getInstance().format(remainder)}"

        }

    }

}