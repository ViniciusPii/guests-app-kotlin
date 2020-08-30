package com.viniciuspiih.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.viniciuspiih.convidados.R
import com.viniciuspiih.convidados.viewmodel.GuestsFormViewModel
import kotlinx.android.synthetic.main.activity_guest_form.*

class GuestFormActivity : AppCompatActivity() {

    private lateinit var mViewModel: GuestsFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_form)

        mViewModel = ViewModelProvider(this).get(GuestsFormViewModel::class.java)

        observe()

        button_add_guest.setOnClickListener {
            val name = edit_guest.text.toString()
            val presence = radio_present.isChecked

            mViewModel.save(name, presence)
        }
    }

    private fun observe() {
        mViewModel.saveGuest.observe(this, Observer {
            if (it) {
                Toast.makeText(
                    applicationContext,
                    getString(R.string.toast_success),
                    Toast.LENGTH_SHORT
                )
            } else {
                Toast.makeText(
                    applicationContext,
                    getString(R.string.toast_fail),
                    Toast.LENGTH_SHORT
                )
            }
        })
    }
}