package com.softtechno.ilososlayout.ui.order.create;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OrderCreateViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public OrderCreateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("OrderCreateViewModel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}