package ru.trinitydigital.dagger2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import ru.trinitydigital.dagger2.R
import ru.trinitydigital.dagger2.di.inject
import ru.trinitydigital.dagger2.utils.viewModel

class MainActivity : AppCompatActivity() {

    private val vm by viewModel(MainViewModel::class)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.loadList()
    }
}