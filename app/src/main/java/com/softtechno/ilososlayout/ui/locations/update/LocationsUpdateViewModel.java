package com.softtechno.ilososlayout.ui.locations.update;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocationsUpdateViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LocationsUpdateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("LocationsUpdateViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
