@file:OptIn(InternalSerializationApi::class)

package com.example.firebase_056.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firebase_056.modeldata.Siswa
import com.example.firebase_056.repositori.RepositorySiswa
import com.example.firebase_056.view.route.DestinasiDetail
import kotlinx.coroutines.launch
import kotlinx.serialization.InternalSerializationApi
import java.io.IOException


    fun hapusSatuSiswa() {
        viewModelScope.launch {
            try {
                repositorySiswa.hapusSatuSiswa(idSiswa)
                println("Sukses Hapus Data: $idSiswa")
            } catch (e: Exception) {
                println("Gagal Hapus Data: ${e.message}")
            }
        }
    }
}
