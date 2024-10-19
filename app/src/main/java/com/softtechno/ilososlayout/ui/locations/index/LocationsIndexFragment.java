package com.softtechno.ilososlayout.ui.locations.index;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.softtechno.ilososlayout.databinding.FragmentLocationsIndexBinding;

public class LocationsIndexFragment extends Fragment {

    private FragmentLocationsIndexBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LocationsIndexViewModel locationsIndexViewModel = new ViewModelProvider(this).get(LocationsIndexViewModel.class);
        binding = FragmentLocationsIndexBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textLocationsIndex;
        locationsIndexViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}