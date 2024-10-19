package com.softtechno.ilososlayout.ui.locations.search.map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.softtechno.ilososlayout.databinding.FragmentLocationsSearchMapBinding;

public class LocationsSearchMapFragment extends Fragment {

    private FragmentLocationsSearchMapBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LocationsSearchMapViewModel locationsSearchMapViewModel = new ViewModelProvider(this).get(LocationsSearchMapViewModel.class);
        binding = FragmentLocationsSearchMapBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textLocationsSearchMap;
        locationsSearchMapViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}