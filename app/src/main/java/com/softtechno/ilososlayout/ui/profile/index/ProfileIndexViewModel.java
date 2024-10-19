package com.softtechno.ilososlayout.ui.profile.index;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileIndexViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ProfileIndexViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ProfileIndexViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}