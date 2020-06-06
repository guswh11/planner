package com.joy.planner.view.checklist.presenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.joy.planner.R;

public class AddPlanFragmentDialog extends DialogFragment {

    public static final String TAG_EVENT_DIALOG = "dialog_event";

    public AddPlanFragmentDialog() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, android.R.style.Theme_Material_Light_DarkActionBar);
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public static AddPlanFragmentDialog getInstance() {
        AddPlanFragmentDialog addPlanFragmentDialog = new AddPlanFragmentDialog();
        return addPlanFragmentDialog;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_plan, container);

        return view;
    }
}
