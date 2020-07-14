package com.nao749.sampleapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //ActivityとlayoutFileは結びついている
        //個々のViewなどは結びついていない
        //kotlinAndroidExtensionsのプラグインが入っていればわざわざfindViewIdが必要ない
        setContentView(R.layout.activity_main)

        //フラグメントの生成
        supportFragmentManager.beginTransaction().add(R.id.container_Fragment,ButtonFragment()).commit()
    }
}
