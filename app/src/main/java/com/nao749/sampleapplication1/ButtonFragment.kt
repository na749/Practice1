package com.nao749.sampleapplication1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.fragment_button.*


class ButtonFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button.setOnClickListener(this)
    }

    //buttonのクリック処理
    //interfaceになっている（関数型インターフェース）
    //setOnClickListenerの中の唯一の処理（λ式の中の処理）
    override fun onClick(button : View?) {
        if(editName.text.toString() == ""){
            return
        }

        val yourName = editName.text.toString()

        txt_show_name.text = "こんにちは!" +yourName+ "さん"
        image_hello.visibility = View.VISIBLE
        button!!.isEnabled = false
    }

}
