package com.example.firebase_056.view.controllNavigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.firebase_056.view.DetailSiswaScreen
import com.example.firebase_056.view.EditSiswaScreen
import com.example.firebase_056.view.EntrySiswaScreen
import com.example.firebase_056.view.HomeScreen
import com.example.firebase_056.view.route.DestinasiDetail
import com.example.firebase_056.view.route.DestinasiEdit
import com.example.firebase_056.view.route.DestinasiEntry
import com.example.firebase_056.view.route.DestinasiHome


        composable(DestinasiDetail.routeWithArgs,arguments = listOf(navArgument
            (DestinasiDetail.itemIdArg) {
            type = NavType.StringType })
        ){
            DetailSiswaScreen(navigateToEditItem = {navController.navigate("${DestinasiEdit
                .route}/${it}")},
                navigateBack = { navController.navigate(DestinasiHome.route) })
        }

