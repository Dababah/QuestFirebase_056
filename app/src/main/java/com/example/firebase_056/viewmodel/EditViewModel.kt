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


    init {
        viewModelScope.launch {
            uiStateSiswa = repositorySiswa.getSatuSiswa(idSiswa)!!
                .toUiStateSiswa(true)
        }
    }

