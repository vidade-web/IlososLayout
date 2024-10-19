package com.softtechno.ilososlayout.ui.login.verified;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.softtechno.ilososlayout.MainActivity;
import com.softtechno.ilososlayout.R;
import com.softtechno.ilososlayout.databinding.FragmentLoginVerifiedBinding;

public class LoginVerifiedFragment extends Fragment {

    private FragmentLoginVerifiedBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LoginVerifiedViewModel loginVerifiedViewModel = new ViewModelProvider(this).get(LoginVerifiedViewModel.class);
        binding = FragmentLoginVerifiedBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textLoginVerified;
        loginVerifiedViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        MainActivity activity = ((MainActivity) getActivity());
        if(activity != null) {
            activity.setPagetitle(R.string.login_verified_pagetitle, "small");
            activity.setStatusBackButton(true);
        }
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
