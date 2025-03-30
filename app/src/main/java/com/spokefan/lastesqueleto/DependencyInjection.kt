package com.spokefan.lastesqueleto

import android.app.Application
import com.spokefan.data.server.DataModule
import com.spokefan.usescases.UsesCasesModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.ksp.generated.module

fun Application.initDependencyInjection(){
    startKoin {
        androidLogger(Level.ERROR)
        androidContext(this@initDependencyInjection)
        modules(AppModule().module, DataModule().module,UsesCasesModule().module)
    }
}

@Module
@ComponentScan
class AppModule