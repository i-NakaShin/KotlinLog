package jp.techacademy.shintaro.nakagawa.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taro = Human("太朗", 20, "Kotlin")
        taro.say()
        taro.think()

        val jiro = Human("次郎", 18, "Java")
        jiro.say()
        jiro.think()
    }
}