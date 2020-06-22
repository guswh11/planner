package com.joy.planner.view.checklist.adapter.viewholder;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joy.planner.BR;
import com.joy.planner.R;
import com.joy.planner.databinding.ItemPlanBinding;
import com.joy.planner.view.checklist.adapter.model.Plan;

public class PlanViewHolder extends RecyclerView.ViewHolder {
    ItemPlanBinding binding;

    public PlanViewHolder(@NonNull ItemPlanBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Plan plan){
        binding.setVariable(BR.plan, plan);
    }
}
