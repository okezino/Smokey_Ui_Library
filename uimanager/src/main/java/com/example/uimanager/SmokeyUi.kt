package com.example.uimanager

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.shreyaspatil.MaterialDialog.MaterialDialog

fun longToast(string: String, context: Context){
    Toast.makeText(context, string, Toast.LENGTH_LONG).show()
}

fun shortToast(string: String, context: Context){
    Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
}

fun View.showSnackBar(message: String, color : Int = R.color.black) {
    Snackbar.make(this, message, Snackbar.LENGTH_SHORT).setTextColor(resources.getColor(R.color.white))
        .setBackgroundTint(resources.getColor(color))
        .show()
}

fun generateMaterialDialog(
    context: Activity, title: String, message: String
    , positiveBtnTitle: String, negativeBtnTitle: String = "",
    positiveAction: (() -> Unit)?, negativeAction: (() -> Unit)?
){
    MaterialDialog.Builder(context)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveBtnTitle) { dialogInterface, _ ->
            dialogInterface.dismiss()
            positiveAction?.invoke()
        }.setNegativeButton(negativeBtnTitle) { dialogInterface, _ ->
            dialogInterface.dismiss()
            negativeAction?.invoke()
        }.setCancelable(true)
        .build()
        .show()
}

fun getAlertDialog(context : Activity){
    val alert = AlertDialog.Builder(context).apply {
        setTitle("What is going on")
        setMessage("type in here")
        setCancelable(true)
        setPositiveButton("Yes"
        ) { p0, p1 -> longToast("peace",context)}
        setNegativeButton("No"
        ) { p0, p1 -> longToast("Nopeace",context)}
    }
    val alertDialog = alert.create()

    alertDialog.show()

}