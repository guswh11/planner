package com.joy.planner.view.checklist.adapter.viewholder;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joy.planner.R;
import com.joy.planner.view.checklist.PlanItemView;

public class PlanViewHolder extends RecyclerView.ViewHolder implements PlanItemView {
    private TextView planNameTextView;
    private TextView planContentTextView;

    private ImageButton statusImgBtn;
    private ImageButton dragImgBtn;

    public PlanViewHolder(@NonNull View itemView) {
        super(itemView);
        planNameTextView = itemView.findViewById(R.id.text_view_plan_name);
        planContentTextView = itemView.findViewById(R.id.text_view_plan_content);

        statusImgBtn = itemView.findViewById(R.id.img_btn_drag);
        dragImgBtn = itemView.findViewById(R.id.img_btn_drag);
    }

    @Override
    public void setPlanName(String planName) {
        planNameTextView.setText(planName);
    }

    @Override
    public void setPlanContent(String planContent) {
        planContentTextView.setText(planContent);
    }
}
