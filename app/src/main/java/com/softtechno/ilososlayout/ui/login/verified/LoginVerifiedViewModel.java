package com.softtechno.ilososlayout.ui.login.verified;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginVerifiedViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LoginVerifiedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("LoginVerifiedViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}