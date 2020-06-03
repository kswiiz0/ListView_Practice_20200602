package com.phis.listview_practice_20200602.datas

import java.io.Serializable
import java.text.DecimalFormat
import java.text.NumberFormat


class Room(val price: Int, val address: String, val floor: Int, val memo: String) : Serializable {

    fun getFormmatedAddressAndFloor(): String {
        return "${this.address}, ${getFormmatedFloor()}"
    }

    fun getFormmatedFloor(): String {
        var floorTxt: String

        if (floor < 0) {
            floorTxt = "지하${floor * -1}층"
//            floorTxt = "지하${-floor}층"
        } else if (floor == 0) {
            floorTxt = "반지하"
        } else {
            floorTxt = "${floor}층"
        }
        return floorTxt
    }


    fun getFormmatedPrice(): String {
        if (this.price < 10000) {
            return "${NumberFormat.getInstance().format(this.price)}만원"

        } else {
            var uk = this.price / 10000
            var remainder = this.price % 10000

            if (remainder > 0) {
                return "${uk}억${NumberFormat.getInstance().format(remainder)}만원"
            } else {
                return "${uk}억"
            }


        }

    }

}