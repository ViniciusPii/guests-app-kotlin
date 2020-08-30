package com.viniciuspiih.convidados.service.repository

import com.viniciuspiih.convidados.service.model.GuestModel

class GuestRepository {

    fun getAllGuest(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getPresent(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun getAbsent(): List<GuestModel> {
        val list: MutableList<GuestModel> = ArrayList()
        return list
    }

    fun saveGuest(guest: GuestModel) {}
    fun updateGuest(guest: GuestModel) {}
    fun deleteGuest(guest: GuestModel) {}
    fun findGuest(guest: GuestModel) {}
}