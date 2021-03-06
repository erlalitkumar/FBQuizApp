package com.lkb.fbquizapp.view.result

import androidx.lifecycle.ViewModel
import com.lkb.fbquizapp.model.Repository
import com.lkb.fbquizapp.model.persistance.User
import io.reactivex.Maybe
import org.koin.java.KoinJavaComponent.inject


class ResultViewModel : ViewModel() {
    private val repository: Repository by inject(Repository::class.java)
    fun getTopResults(): Maybe<List<User>>? {
        return repository.getTopFiveUser()
    }

}