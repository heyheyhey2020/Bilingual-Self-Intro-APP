package com.example.cis600_hw1

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orientation = getResources().getConfiguration().orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
        }else{
            var ToastBtn : Button = findViewById(R.id.ToastBtn)
            ToastBtn.setOnClickListener(){
                Toast.makeText(this,"Nice to meet you!",Toast.LENGTH_SHORT).show()
            }

        }



//        ToastBtn.setOnClickListener{
//            Toast.makeText(this,"Nice to meet you!",Toast.LENGTH_SHORT).show()
//        }

//        val clickButton: Button = findViewById(R.id.ToastBtn)
//        clickButton.setOnClickListener {
//            Toast.makeText(this, "123123123", Toast.LENGTH_SHORT).show()
//        }

    }


}



