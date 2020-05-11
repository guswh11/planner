package com.joy.planner.view.basic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.joy.planner.R;
import com.joy.planner.view.checklist.ChecklistFragment;
import com.joy.planner.view.memo.MemoFragment;
import com.joy.planner.view.settings.SettingFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private ChecklistFragment checklistFragment = new ChecklistFragment();
    private MemoFragment memoFragment = new MemoFragment();
    private SettingFragment settingFragment = new SettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, checklistFragment).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());
    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(menuItem.getItemId())
            {
                case R.id.bottom_menu_checklist:
                    transaction.replace(R.id.container, checklistFragment).commitAllowingStateLoss();
                    break;
                case R.id.bottom_menu_memo:
                    transaction.replace(R.id.container, memoFragment).commitAllowingStateLoss();
                    break;
                case R.id.bottom_menu_setting:
                    transaction.replace(R.id.container, settingFragment).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    }
}
