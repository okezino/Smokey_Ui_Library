package com.example.droiders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.droiders.databinding.ActivityMainBinding
import com.example.uimanager.generateMaterialDialog
import com.example.uimanager.getAlertDialog
import com.example.uimanager.longToast
import com.example.uimanager.showSnackBar

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpoint.setOnClickListener {
       //     longToast("TRY", this)
       //     it.showSnackBar("what is happening")

       //     generateMaterialDialog(this,"type here", "Typing is allowed","Yes", "No",null,null )
            getAlertDialog(this)
        }
    }




    override fun onResume() {
        super.onResume()
     //  binding.viewpoint.text =  UiManager.sendText()
    }
}