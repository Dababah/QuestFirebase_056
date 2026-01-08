package com.example.firebase_056.view


import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.firebase_056.R
import com.example.firebase_056.modeldata.Siswa
import com.example.firebase_056.view.route.DestinasiDetail
import com.example.firebase_056.viewmodel.DetailViewModel
import com.example.firebase_056.viewmodel.PenyediaViewModel
import com.example.firebase_056.viewmodel.StatusUIDetail
import kotlinx.coroutines.launch


        var deleteConfirmationRequired by rememberSaveable { mutableStateOf(false) }

        when (statusUIDetail) {
            is StatusUIDetail.Loading -> {
                CircularProgressIndicator()
            }

            is StatusUIDetail.Success -> {
                DetailDataSiswa(
                    siswa = statusUIDetail.satusiswa,
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedButton(
                    onClick = { deleteConfirmationRequired = true },
                    shape = MaterialTheme.shapes.small,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(stringResource(R.string.delete))
                }
            }

            StatusUIDetail.Error -> {
                Text("Data siswa tidak ditemukan")
            }
        }

        if (deleteConfirmationRequired) {
            DeleteConfirmationDialog(
                onDeleteConfirm = {
                    deleteConfirmationRequired = false
                    onDelete()
                },
                onDeleteCancel = { deleteConfirmationRequired = false },
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium))
            )
        }
    }
}

