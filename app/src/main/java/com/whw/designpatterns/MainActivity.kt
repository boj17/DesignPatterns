package com.whw.designpatterns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whw.designpatterns.builder.BuilderActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBuilder.setOnClickListener(){
            goToActivity(BuilderActivity::class.java)
        }
    }

    fun goToActivity(clazz: Class<*>){
        var intent=Intent(this,clazz)
        startActivity(intent)
    }
}
