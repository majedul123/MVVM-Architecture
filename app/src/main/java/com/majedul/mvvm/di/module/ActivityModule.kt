package com.majedul.mvvm.di.module

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import com.majedul.mvvm.data.repository.DataRepository
import com.majedul.mvvm.di.ActivityContext
import com.majedul.mvvm.ui.base.ViewModelProviderFactory
import com.majedul.mvvm.ui.topheadline.SearchAdapter
import com.majedul.mvvm.ui.topheadline.SearchViewModel

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideTopHeadlineViewModel(topHeadlineRepository: DataRepository): SearchViewModel {
        return ViewModelProvider(activity,
            ViewModelProviderFactory(SearchViewModel::class) {
                SearchViewModel(topHeadlineRepository)
            })[SearchViewModel::class.java]
    }

    @Provides
    fun provideTopHeadlineAdapter() = SearchAdapter(ArrayList())

}