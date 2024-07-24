package screen.detail

import androidx.lifecycle.ViewModel
import domain.Repository

class DetailViewModel(private val repo: Repository) : ViewModel() {
    init {
        println("Detail ViewModel init...")
    }

    override fun onCleared() {
        super.onCleared()
        println("Detail ViewModel clearing...")
    }
}