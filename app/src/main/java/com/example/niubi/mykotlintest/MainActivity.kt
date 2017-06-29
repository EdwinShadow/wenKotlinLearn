package com.example.niubi.mykotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello.text = "我的天啊   这么好用！"

        val a = 12 // An int
        val b = 0x0f //一个十六进制的Int类型
        val c = 3L //A long
        val d = 3.5 // A Double
        val f = 3.5F // A Float

        val e: Byte = 1
        val j: Int = e.toInt()

    }

    fun pow(a: Int): Double {
        return Math.pow(a.toDouble(), 2.toDouble())
    }

    val h =1.toLong()+1 //Long +int --->long

    val c : Char = 'c'
    val g : Int = c.toInt()

    val booltest = true

    val s = "example"
}
