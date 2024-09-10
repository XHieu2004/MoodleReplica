package com.example.moodleui;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);

       viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
           @Override
           public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

           }

           @Override
           public void onPageSelected(int position) {
               switch (position){
                   case 0:
                       bottomNavigationView.getMenu().findItem(R.id.home_dashboard).setChecked(true);
                       break;
                   case 1:
                       bottomNavigationView.getMenu().findItem(R.id.notifications_button).setChecked(true);
                       break;
                   case 2:
                       bottomNavigationView.getMenu().findItem(R.id.calender_button).setChecked(true);
                       break;
                   case 3:
                       bottomNavigationView.getMenu().findItem(R.id.site_blog_button).setChecked(true);
                       break;
                   case 4:
                       bottomNavigationView.getMenu().findItem(R.id.more_button).setChecked(true);
                       break;


               }

           }

           @Override
           public void onPageScrollStateChanged(int state) {

           }
       });


}






}