package com.softtechno.ilososlayout.ui.locations.help;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.softtechno.ilososlayout.databinding.FragmentLocationsHelpBinding;

public class LocationsHelpFragment extends Fragment {

    private FragmentLocationsHelpBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LocationsHelpViewModel locationsHelpViewModel = new ViewModelProvider(this).get(LocationsHelpViewModel.class);
        binding = FragmentLocationsHelpBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textLocationsHelp;
        locationsHelpViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}