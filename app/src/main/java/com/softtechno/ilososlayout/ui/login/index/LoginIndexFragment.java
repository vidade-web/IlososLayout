package com.softtechno.ilososlayout.ui.login.index;

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
import ru.tinkoff.decoro.MaskImpl;
import ru.tinkoff.decoro.slots.PredefinedSlots;
import ru.tinkoff.decoro.watchers.FormatWatcher;
import ru.tinkoff.decoro.watchers.MaskFormatWatcher;
import com.softtechno.ilososlayout.MainActivity;
import com.softtechno.ilososlayout.R;
import com.softtechno.ilososlayout.databinding.FragmentLoginIndexBinding;

public class LoginIndexFragment extends Fragment {

    private FragmentLoginIndexBinding binding;
    private EditText userPhone;
    private EditText userName;
    private TextView submitError;
    private Button submitButton;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MainActivity activity = ((MainActivity) getActivity());
        if(activity != null) {
            activity.setTopbar(R.string.login_index_pagetitle, "big", false, false, false);
        }
        binding = FragmentLoginIndexBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        userPhone = binding.loginUserPhone;
        userName = binding.loginUserName;
        submitError = binding.submitError;
        submitButton = binding.submitButton;
        return root;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FormatWatcher formatWatcher = new MaskFormatWatcher(MaskImpl.createTerminated(PredefinedSlots.RUS_PHONE_NUMBER));
        formatWatcher.installOn(userPhone);
        submitButton.setOnClickListener(v -> {
            submitError.setVisibility(View.INVISIBLE);
            userPhone.setBackgroundResource(R.drawable.custom_edittext);
            if (userPhone.getText().toString().isEmpty()) {
                submitError.setVisibility(View.VISIBLE);
                userPhone.setBackgroundResource(R.drawable.custom_edittext_error);
            } else if (userPhone.getText().toString().length() != 18) {
                userPhone.setBackgroundResource(R.drawable.custom_edittext_error);
            } else {
                boolean isNotName = userName.getText().toString().isEmpty();
                Bundle bundle = new Bundle();
                if (isNotName) bundle.putString("phone", userPhone.getText().toString());
                int id = isNotName ? R.id.nav_login_verified : R.id.nav_order_create;
                NavHostFragment.findNavController(LoginIndexFragment.this).navigate(id, bundle);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

