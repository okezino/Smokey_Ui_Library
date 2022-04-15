package com.example.uimanager

import android.app.Application
import android.widget.Toast

class UiManager : Application(){

    companion object{
//        fun toast(string: String){
//            Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
//        }

        fun sendText(): String{
            return "from library joseph"
        }

    }



}