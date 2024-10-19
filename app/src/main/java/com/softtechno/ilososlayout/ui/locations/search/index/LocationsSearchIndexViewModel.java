package com.softtechno.ilososlayout.ui.locations.search.index;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocationsSearchIndexViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LocationsSearchIndexViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("LocationsSearchIndexViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
