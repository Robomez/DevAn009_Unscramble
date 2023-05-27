package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    init {
        Log.d("GameFragment", "GameViewModel created!")
    }

    private var score = 0
    private var currentWordCount = 0

    private var _count = 0
    val count: Int get() = _count

    private var _currentScrabledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrabledWord

    override fun onCleared() {
        super.onCleared()
        Log.d("GameFragment", "GameViewModel destroyed!")
    }
}