package com.example.test5

import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    fun provideMyDependency(): MyDependency {
        return MyDependency()
    }}