package com.joy.planner.view.checklist.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joy.planner.databinding.ItemPlanBinding;
import com.joy.planner.view.checklist.adapter.model.Plan;
import com.joy.planner.view.checklist.adapter.viewholder.PlanViewHolder;

import java.util.List;

public class PlanRecyclerViewAdapter extends RecyclerView.Adapter<PlanViewHolder> {
    private List<Plan> planList;

    public PlanRecyclerViewAdapter(List<Plan> planList) {
        this.planList = planList;
    }

    @NonNull
    @Override
    public PlanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPlanBinding binding = ItemPlanBinding.
                inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new PlanViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanViewHolder holder, int position) {
        Plan plan = planList.get(position);
        holder.bind(plan);
    }

    @Override
    public int getItemCount() {
        return planList.size();
    }

    public void setItem(List<Plan> planList) {
        if (planList == null) {
            return;
        }

        this.planList = planList;
        notifyDataSetChanged();
    }
}
