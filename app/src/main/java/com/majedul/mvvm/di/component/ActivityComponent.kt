package com.majedul.mvvm.di.component

import dagger.Component
import com.majedul.mvvm.di.ActivityScope
import com.majedul.mvvm.di.module.ActivityModule
import com.majedul.mvvm.ui.topheadline.TopHeadlineActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}