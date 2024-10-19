package com.softtechno.ilososlayout.ui.profile.settings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileSettingsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ProfileSettingsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ProfileSettingsViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}