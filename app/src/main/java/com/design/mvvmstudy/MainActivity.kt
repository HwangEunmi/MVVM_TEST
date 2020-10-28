package com.design.mvvmstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var testViewModel: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        testViewModel = ViewModelProvider(this).get(TestViewModel::class.java)

        initObserve()
    }

    private fun initView() {
        // TODO : Adapter 초기화
    }

    private fun initObserve() {
        mainViewModel.mainList.observe(this, Observer { main ->
            tv_value.text = main?.get(0)?.title
        })
    }
}
