package com.viniciuspiih.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.viniciuspiih.convidados.R
import com.viniciuspiih.convidados.viewmodel.GuestsViewModel
import kotlinx.android.synthetic.main.activity_guest_form.*

class GuestFormActivity : AppCompatActivity() {

    private lateinit var mViewModel: GuestsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_form)

        mViewModel = ViewModelProvider(this).get(GuestsViewModel::class.java)

        button_add_guest.setOnClickListener { }
    }
}