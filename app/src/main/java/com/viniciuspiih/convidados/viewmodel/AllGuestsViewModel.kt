package com.viniciuspiih.convidados.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AllGuestsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Todos"
    }
    val text: LiveData<String> = _text
}