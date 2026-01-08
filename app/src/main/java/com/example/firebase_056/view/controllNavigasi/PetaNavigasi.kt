
        composable(
            DestinasiEdit.routeWithArgs, arguments = listOf(navArgument
                (DestinasiEdit.itemIdArg){
                type= NavType.StringType})){
            EditSiswaScreen(navigateBack = { navController.navigate(DestinasiHome.route) },
                onNavigateUp = { navController.navigateUp() })
        }
    }
}
