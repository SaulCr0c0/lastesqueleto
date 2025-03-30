package com.spokefan.lastesqueleto
import android.app.Application

class Application: Application() {
    override fun onCreate() {
        super.onCreate()
        initDependencyInjection()
    }
}