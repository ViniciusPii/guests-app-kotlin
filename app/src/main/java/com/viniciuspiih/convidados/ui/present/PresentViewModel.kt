package com.viniciuspiih.convidados.ui.present

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PresentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Presentes"
    }
    val text: LiveData<String> = _text
}