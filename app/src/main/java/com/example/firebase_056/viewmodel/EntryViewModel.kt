package com.example.firebase_056.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.firebase_056.modeldata.DetailSiswa
import com.example.firebase_056.modeldata.UIStateSiswa
import com.example.firebase_056.repositori.RepositorySiswa
import com.example.firebase_056.modeldata.toDataSiswa
import androidx.compose.runtime.*

class EntryViewModel(private val repositorySiswa: RepositorySiswa) : ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    /
