package com.softtechno.ilososlayout.ui.locations.index;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocationsIndexViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LocationsIndexViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("LocationsIndexViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
