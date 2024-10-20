package com.softtechno.ilososlayout.ui.login.verified;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.softtechno.ilososlayout.MainActivity;
import com.softtechno.ilososlayout.R;
import com.softtechno.ilososlayout.databinding.FragmentLoginVerifiedBinding;

public class LoginVerifiedFragment extends Fragment {

    private FragmentLoginVerifiedBinding binding;
    private EditText verifiedCode;
    private TextView submitError;
    private Button submitButton;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MainActivity activity = ((MainActivity) getActivity());
        if(activity != null) {
            activity.setTopbar(R.string.login_verified_pagetitle, "small", false, true, false);
        }
        binding = FragmentLoginVerifiedBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        verifiedCode = binding.loginVerifiedCode;
        submitError = binding.submitError;
        submitButton = binding.submitButton;
        Bundle bundle = getArguments();
        TextView pageDescription = binding.loginVerifiedDescription;
        String pageDescriptionData = getString(R.string.login_verified_description);
        if(bundle != null) {
            String phone = bundle.getString("phone");
            if(phone != null) pageDescriptionData += phone;
        }
        pageDescription.setText(pageDescriptionData);
        return root;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        submitButton.setOnClickListener(v -> {
            submitError.setVisibility(View.INVISIBLE);
            verifiedCode.setBackgroundResource(R.drawable.custom_edittext);
            if (verifiedCode.getText().toString().isEmpty()) {
                submitError.setVisibility(View.VISIBLE);
                verifiedCode.setBackgroundResource(R.drawable.custom_edittext_error);
            } else {
                NavHostFragment.findNavController(LoginVerifiedFragment.this).navigate(R.id.nav_order_create);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
