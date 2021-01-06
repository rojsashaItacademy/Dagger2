package ru.trinitydigital.dagger2.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import ru.trinitydigital.dagger2.di.inject

class MainViewModel : ViewModel() {

    private val repository by inject { retrofitRepository }
    private val prefs by inject { preference }

    private val scope = CoroutineScope(Job())

    fun loadList() {
        scope.launch(Dispatchers.IO) {
            runCatching {
                val result = repository.loadBLogs(20, 1)
                Log.d("daasdasd", "sadsadsadsad")
            }.onFailure {
                Log.d("daasdasd", it?.localizedMessage)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        scope.cancel()
    }

}