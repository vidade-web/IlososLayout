package com.softtechno.ilososlayout.ui.order.create;

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
import com.softtechno.ilososlayout.databinding.FragmentOrderCreateBinding;

public class OrderCreateFragment extends Fragment {

    private FragmentOrderCreateBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MainActivity activity = ((MainActivity) getActivity());
        if(activity != null) {
            activity.setTopbar(R.string.login_verified_pagetitle, "big", true, false, true);
        }


        OrderCreateViewModel orderCreateViewModel = new ViewModelProvider(this).get(OrderCreateViewModel.class);
        binding = FragmentOrderCreateBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textOrderCreate;
        orderCreateViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);




        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}