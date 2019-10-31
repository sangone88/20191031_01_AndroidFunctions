package com.tjoeun.a20191031_01_androidfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        intent에 첨부된 데이터를 찾아주는 코드.
        var receivedName = intent.getStringExtra("name")
        var receivedId = intent.getStringExtra("memberId")
        var receivedNumber = intent.getStringExtra("memberNumber")

        memberNumTxt.text = "${receivedNumber} 번 회원"
        memberNameTxt.text = "${receivedName}(${receivedId})"
    }
}
