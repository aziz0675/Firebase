package com.example.android_firebase.manager

import java.lang.Exception

interface StorageHandler {
    fun onSuccess(imgUrl: String)
    fun onError(exception: Exception?)
}