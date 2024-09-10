package vn.edu.usth.moodlereplica;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager = findViewById(R.id.view_pager);
        TabLayout tabs = findViewById(R.id.tabs);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this);
        viewPager.setAdapter(sectionsPagerAdapter);

        new TabLayoutMediator(tabs, viewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        switch (position) {
                            case 0:
                                tab.setText("USTH Moodle");
//                                tab.setIcon(R.drawable.icon); // Use your icons
                                break;
                            case 1:
                                tab.setText("Notifications");
//                                tab.setIcon(R.drawable.icon);
                                break;
                            case 2:
                                tab.setText("Calender");
//                                tab.setIcon(R.drawable.icon);
                                break;
                            case 3:
                                tab.setText("Site blog");
//                                tab.setIcon(R.drawable.icon);
                                break;
                            case 4:
                                tab.setText("More");
//                                tab.setIcon(R.drawable.icon);
                                break;
                        }
                    }
                }).attach();
    }
}