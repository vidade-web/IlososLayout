package com.softtechno.ilososlayout.ui.profile.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.softtechno.ilososlayout.databinding.FragmentProfileSettingsBinding;

public class ProfileSettingsFragment extends Fragment {

    private FragmentProfileSettingsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ProfileSettingsViewModel profileSettingsViewModel = new ViewModelProvider(this).get(ProfileSettingsViewModel.class);
        binding = FragmentProfileSettingsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textProfileSettings;
        profileSettingsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}