package com.example.mynotes.utils
import com.example.mynotes.model.ModelNote

interface onClickItemListener {
    fun onClick(modelNote: ModelNote, position: Int)
}