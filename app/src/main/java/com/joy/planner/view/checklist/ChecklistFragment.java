package com.joy.planner.view.checklist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.joy.planner.R;
import com.joy.planner.databinding.FragmentChecklistBinding;
import com.joy.planner.view.checklist.adapter.PlanRecyclerViewAdapter;
import com.joy.planner.view.checklist.adapter.model.Plan;
import com.joy.planner.view.checklist.presenter.PlanListPresenter;

import java.util.ArrayList;

public class ChecklistFragment extends Fragment {
    FragmentManager fragmentManager;
    FragmentChecklistBinding binding;
    MaterialDatePicker datePicker;

    AddPlanFragmentDialog addPlanFragmentDialog;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_checklist, container, false);
        binding.setFragment(this);
        View view = binding.getRoot();

        fragmentManager = getActivity().getSupportFragmentManager();
        addPlanFragmentDialog = AddPlanFragmentDialog.getInstance();

        MaterialDatePicker.Builder builder = MaterialDatePicker.Builder.datePicker();
        builder.setTitleText("Select a date");
        datePicker = builder.build();

        //create plan-recyclerview
        ArrayList<Plan> planList = new ArrayList<>();
        for(int i=0;i<4;i++){
            Plan plan = new Plan();
            plan.setPlanName("plan"+i);
            plan.setPlanContent("content"+i);
            planList.add(plan);
        }

        binding.listViewPlan.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        PlanListPresenter presenter = new PlanListPresenter(planList);
        PlanRecyclerViewAdapter adapter = new PlanRecyclerViewAdapter(presenter);
        binding.listViewPlan.setAdapter(adapter);


        return view;
    }

    public void openDatePicker(View view){
        datePicker.show(fragmentManager, "date_picker");
    }

    public void openAddPlanFragmentDialog(View view) {
        addPlanFragmentDialog.show(fragmentManager, addPlanFragmentDialog.TAG_EVENT_DIALOG);
    }
}
