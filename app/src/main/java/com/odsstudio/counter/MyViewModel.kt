package com.odsstudio.counter

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    val nums = mutableStateOf(0)

    fun increment() {
        nums.value++
    }


}