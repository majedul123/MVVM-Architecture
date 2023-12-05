package com.majedul.mvvm.di.component

import dagger.Component
import com.majedul.mvvm.di.ActivityScope
import com.majedul.mvvm.di.module.ActivityModule
import com.majedul.mvvm.ui.topheadline.SearchActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: SearchActivity)

}