package com.example.test5

import dagger.Component

@Component
interface MyComponent {
    fun inject(activity: MyActivity)
}
