package com.whw.designpatterns.builder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whw.designpatterns.R
import com.whw.designpatterns.builder.builder1.Director
import com.whw.designpatterns.builder.builder1.LowConfigBuilder
import kotlinx.android.synthetic.main.activity_builder.*

class BuilderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builder)
        var director=Director(LowConfigBuilder())
        btnLow.setOnClickListener { tvShow }

    }
}
