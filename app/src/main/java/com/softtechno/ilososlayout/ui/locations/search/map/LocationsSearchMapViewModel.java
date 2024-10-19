package com.softtechno.ilososlayout.ui.locations.search.map;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocationsSearchMapViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LocationsSearchMapViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("LocationsSearchMapViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
