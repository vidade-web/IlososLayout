package com.softtechno.ilososlayout.ui.locations.create;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.softtechno.ilososlayout.databinding.FragmentLocationsCreateBinding;

public class LocationsCreateFragment extends Fragment {

    private FragmentLocationsCreateBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LocationsCreateViewModel locationsCreateViewModel = new ViewModelProvider(this).get(LocationsCreateViewModel.class);
        binding = FragmentLocationsCreateBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textLocationsCreate;
        locationsCreateViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}