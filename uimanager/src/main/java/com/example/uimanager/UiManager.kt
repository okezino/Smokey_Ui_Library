package com.example.uimanager

import android.app.Application
import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

//class UiManager : Application(){
//
//    companion object{
//        fun View.longToast(string: String, context: Context){
//            Toast.makeText(context, string, Toast.LENGTH_LONG).show()
//        }
//
//        fun View.shortToast(string: String, context: Context){
//            Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
//        }
//
//        fun View.showSnackBar(message: String, color : Int = R.color.black) {
//            Snackbar.make(this, message, Snackbar.LENGTH_SHORT).setTextColor(resources.getColor(R.color.white))
//                .setBackgroundTint(resources.getColor(color))
//                .show()
//        }
//
//    }
//
//}