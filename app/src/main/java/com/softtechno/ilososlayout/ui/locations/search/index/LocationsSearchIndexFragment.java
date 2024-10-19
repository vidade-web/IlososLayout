package com.softtechno.ilososlayout.ui.locations.search.index;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.softtechno.ilososlayout.databinding.FragmentLocationsSearchIndexBinding;

public class LocationsSearchIndexFragment extends Fragment {

    private FragmentLocationsSearchIndexBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LocationsSearchIndexViewModel locationsSearchIndexViewModel = new ViewModelProvider(this).get(LocationsSearchIndexViewModel.class);
        binding = FragmentLocationsSearchIndexBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textLocationsSearchIndex;
        locationsSearchIndexViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}