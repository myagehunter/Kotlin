package com.simple.kotlin.base

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.simple.kotlin.R
import kotlinx.android.synthetic.main.activity_layout.*

/**
 *    author : jianghuizhong
 *    date   : 2020/4/26
 *    desc   :
 */
class MainActivity : AppCompatActivity() , View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)
        btan_back.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        finish();
    }
}