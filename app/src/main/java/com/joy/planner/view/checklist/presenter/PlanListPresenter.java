package com.joy.planner.view.checklist.presenter;

import com.joy.planner.view.checklist.PlanItemView;
import com.joy.planner.view.checklist.adapter.model.Plan;

import java.util.List;

public class PlanListPresenter {
    private final List<Plan> planList;

    public PlanListPresenter(List<Plan> planList) {
        this.planList = planList;
    }

    public void onBindPlanItemViewAtPosition(int position, PlanItemView planItemView) {
        Plan plan = planList.get(position);
        planItemView.setPlanName(plan.getPlanName());
        planItemView.setPlanContent(plan.getPlanContent());
    }

    public int getPlanListSize() {
        return planList.size();
    }
}
