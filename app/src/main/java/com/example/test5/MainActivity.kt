package com.example.test5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.internal.DaggerGenerated
import jakarta.inject.Inject


class MyActivity : ComponentActivity() {
   @Inject
   lateinit var myDependency: MyDependency

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)

      // Initialize the component and inject dependencies
      val myComponent = DaggerMyComponent.create()
      myComponent.inject(this)

   }
}



