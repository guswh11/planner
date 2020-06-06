package com.joy.planner.view.checklist;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.joy.planner.R;
import com.joy.planner.databinding.FragmentChecklistBinding;

public class ChecklistFragment extends Fragment {
    FragmentChecklistBinding binding;
    MaterialDatePicker datePicker;


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_checklist, container, false);
        binding.setFragment(this);
        View view = binding.getRoot();

        MaterialDatePicker.Builder builder = MaterialDatePicker.Builder.datePicker();
        builder.setTitleText("Select a date");
        datePicker = builder.build();

        return view;
    }

    public void openDatePicker(View view){
        datePicker.show(getActivity().getSupportFragmentManager(), "date_picker");
    }

    public void openAddPlanFragmentDialog(View view) {

    }
}
