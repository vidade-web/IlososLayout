package com.softtechno.ilososlayout.ui.locations.help;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocationsHelpViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LocationsHelpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("LocationsHelpViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
