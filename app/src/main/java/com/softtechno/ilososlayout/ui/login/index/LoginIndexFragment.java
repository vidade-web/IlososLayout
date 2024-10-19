package com.softtechno.ilososlayout.ui.login.index;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.softtechno.ilososlayout.MainActivity;
import com.softtechno.ilososlayout.R;
import com.softtechno.ilososlayout.databinding.FragmentLoginIndexBinding;

public class LoginIndexFragment extends Fragment {

    private FragmentLoginIndexBinding binding;
    private EditText userPhone;
    private TextView loginError;
    private final String deafultUserPhone = "11111";

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLoginIndexBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        userPhone = binding.loginUserPhone;
        loginError = binding.loginError;
        MainActivity activity = ((MainActivity) getActivity());
        if(activity != null) activity.setPagetitle(R.string.login_index_pagetitle, "big");
        return root;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.loginButton.setOnClickListener(v -> {
            loginError.setVisibility(View.INVISIBLE);
            userPhone.setBackgroundResource(R.drawable.custom_edittext);
            if (userPhone.getText().toString().isEmpty()) {
                loginError.setVisibility(View.VISIBLE);
                userPhone.setBackgroundResource(R.drawable.custom_edittext_error);
            } else if (!userPhone.getText().toString().equals(deafultUserPhone)) {
                userPhone.setBackgroundResource(R.drawable.custom_edittext_error);
            } else {
                NavHostFragment.findNavController(LoginIndexFragment.this).navigate(R.id.nav_login_verified);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

