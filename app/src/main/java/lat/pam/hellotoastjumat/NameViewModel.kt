package lat.pam.hellotoastjumat

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {

    //create a LiveData with a string
    val currentName: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    //Rest of the ViewModel
}