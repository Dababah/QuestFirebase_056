package com.example.firebase_056.viewmodel



import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.firebase_056.modeldata.UIStateSiswa
import com.example.firebase_056.repositori.RepositorySiswa
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewModelScope
import com.example.firebase_056.modeldata.DetailSiswa
import com.example.firebase_056.modeldata.toDataSiswa
import com.example.firebase_056.modeldata.toUiStateSiswa
import com.example.firebase_056.view.route.DestinasiDetail
import kotlinx.coroutines.launch



    fun updateUiState(detailSiswa: DetailSiswa) {
        uiStateSiswa =
            UIStateSiswa(detailSiswa = detailSiswa, isEntryValid = validasiInput
                (detailSiswa))
    }

    private fun validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa) : Boolean {
        return with(uiState) {
            nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }

    