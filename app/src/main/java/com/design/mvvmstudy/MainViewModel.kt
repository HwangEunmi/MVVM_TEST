package com.design.mvvmstudy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.design.mvvmstudy.model.MainModel

class MainViewModel : ViewModel() {
    // LiveData에 저장된 데이터에 어떠한 변화가 일어난 경우, 결합된 LifecycleOwner (Activity/Fragment)에 의해서
    // 상태가 Active (활성)인 한 모든 데이터에 대해 Trigger가 발생한다.

    // 참고 URL : https://medium.com/harrythegreat/jetpack-android-livedata-%EC%95%8C%EC%95%84%EB%B3%B4%EA%B8%B0-ed49a6f17de3
    private val _mainList = MutableLiveData<List<MainModel>>()
    val mainList: LiveData<List<MainModel>>
        get() = _mainList

    init {
        val list = mutableListOf<MainModel>()
        list.add(MainModel("Hello"))
        list.add(MainModel("Kotlin"))

        _mainList.value = list
    }

}