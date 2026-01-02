package com.example.firebase_056.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.firebase_056.modeldata.DetailSiswa
import com.example.firebase_056.modeldata.UIStateSiswa
import com.example.firebase_056.repositori.RepositorySiswa
import com.example.firebase_056.modeldata.toDataSiswa
import androidx.compose.runtime.*

si untuk menyimpan data yang di-entry */
    suspend fun addSiswa() {
        if (validasiInput()) {
            repositorySiswa.postDataSiswa(uiStateSiswa.detailSiswa.toDataSiswa())
        }
    }
}
