package jp.techacademy.shintaro.nakagawa.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    // Thinkableインターフェースのメソッドをオーバーライド
    override fun think(){
        val hobby: String = "Kotlin"
        Log.d("kotlintest","私は" + hobby + "について考える。")
    }
}