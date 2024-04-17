package com.example.firebasestorage

import com.google.firebase.firestore.Exclude

data class Patients(
    @Exclude var courseID: String? = "",
    var courseName: String? = "",
    var courseDuration: String? = "",
    var courseDescription: String? = "")
