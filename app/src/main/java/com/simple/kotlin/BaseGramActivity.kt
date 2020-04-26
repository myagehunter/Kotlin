package com.simple.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.simple.kotlin.base.MainActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.quick.component.QuickToast
import java.util.*

/**
 * Kotlin 是一种在 Java 虚拟机上运行的静态类型编程语言，被称之为 Android 世界的Swift，由 JetBrains 设计开发并开源。、
 * Kotlin 可以编译成Java字节码，也可以编译成 JavaScript，方便在没有 JVM 的设备上运行。
 * 在Google I/O 2017中，Google 宣布 Kotlin 成为 Android 官方开发语言
 * 为什么要使用kotlin
 * 简洁: 大大减少样板代码的数量。
 * 安全: 避免空指针异常等整个类的错误。
 * 互操作性: 充分利用 JVM、Android 和浏览器的现有库。
 * 工具友好: 可用任何 Java IDE 或者使用命令行构建。
 *
 * 基础语法  不需要加；
 */

class BaseGramActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_ok.setText(" 你好 kotlin!")
        QuickToast.showToastDefault("Hello KotLin!")
        btn_ok.setOnClickListener { v ->
            QuickToast.showToastDefault("欢迎  Kotlin!")
//            Toast.makeText(this, "欢迎Kotlin", Toast.LENGTH_LONG).show();
        }
    }
     fun onClickView(p0: View?) {
         val intent = Intent()
         //2.Java中 MainActivity.this   在Kotlin中 this@MainActivity
         //SecondActivity.class 写成  SecondActivity::class.java
         intent.setClass(this@BaseGramActivity, MainActivity::class.java)
         startActivity(intent)
    }
}
