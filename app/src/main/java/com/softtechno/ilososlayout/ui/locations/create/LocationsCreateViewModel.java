package com.softtechno.ilososlayout.ui.locations.create;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocationsCreateViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LocationsCreateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("LocationsCreateViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
