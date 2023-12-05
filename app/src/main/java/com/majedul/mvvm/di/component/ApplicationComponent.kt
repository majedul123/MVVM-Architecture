package com.majedul.mvvm.di.component

import android.content.Context
import dagger.Component
import com.majedul.mvvm.MVVMApplication
import com.majedul.mvvm.data.api.NetworkService
import com.majedul.mvvm.data.repository.DataRepository
import com.majedul.mvvm.di.ApplicationContext
import com.majedul.mvvm.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MVVMApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): DataRepository

}