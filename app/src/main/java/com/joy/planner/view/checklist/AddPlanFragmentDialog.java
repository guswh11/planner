package com.joy.planner.view.checklist;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;

import com.joy.planner.R;

public class AddPlanFragmentDialog extends DialogFragment {

    public static final String TAG_EVENT_DIALOG = "dialog_event";
    private Toolbar toolbar;

    public AddPlanFragmentDialog() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, android.R.style.Theme_Light_NoTitleBar_Fullscreen);
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public static AddPlanFragmentDialog getInstance() {
        AddPlanFragmentDialog addPlanFragmentDialog = new AddPlanFragmentDialog();
        return addPlanFragmentDialog;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_plan, container);

        toolbar = view.findViewById(R.id.toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_save:
                        Toast.makeText(getActivity().getApplicationContext(),
                                "save clicked", Toast.LENGTH_SHORT).show();
                        dismiss();
                }
                return true;
            }
        });

        return view;
    }
}
