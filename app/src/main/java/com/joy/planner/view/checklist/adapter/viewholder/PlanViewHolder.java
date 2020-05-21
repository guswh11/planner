package com.joy.planner.view.checklist.adapter.viewholder;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joy.planner.R;

public class PlanViewHolder extends RecyclerView.ViewHolder{
    private TextView planTextView;
    private ImageButton statusImgBtn;
    private ImageButton dragImgBtn;

    public PlanViewHolder(@NonNull View itemView) {
        super(itemView);
        planTextView = itemView.findViewById(R.id.text_view_plan);
        statusImgBtn = itemView.findViewById(R.id.img_btn_status);
        dragImgBtn = itemView.findViewById(R.id.img_btn_drag);
    }

    public void setPlan(String plan) {
        planTextView.setText(plan);
    }
}
