package com.joy.planner.view.checklist.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joy.planner.R;
import com.joy.planner.view.checklist.PlanItemView;
import com.joy.planner.view.checklist.adapter.viewholder.PlanViewHolder;
import com.joy.planner.view.checklist.presenter.PlanListPresenter;

public class PlanRecyclerViewAdapter extends RecyclerView.Adapter<PlanViewHolder> {
    private final PlanListPresenter planListPresenter;

    public PlanRecyclerViewAdapter(PlanListPresenter planListPresenter) {
        this.planListPresenter = planListPresenter;
    }

    @NonNull
    @Override
    public PlanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlanViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_plan, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlanViewHolder holder, int position) {
        planListPresenter.onBindPlanItemViewAtPosition(position, (PlanItemView) holder);
    }

    @Override
    public int getItemCount() {
        return planListPresenter.getPlanListSize();
    }
}
