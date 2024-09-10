package vn.edu.usth.moodlereplica;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SectionsPagerAdapter extends FragmentStateAdapter {

    public SectionsPagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new UsthMoodleFragment();  // Tab 1 Fragment
            case 1:
                return new NotificationsFragment();  // Tab 2 Fragment
            case 2:
                return new CalendarFragment();  // Tab 3 Fragment
            case 3:
                return new SiteBlogFragment();  // Tab 4 Fragment
            case 4:
                return new MoreFragment();  // Tab 5 Fragment
            default:
                return new UsthMoodleFragment();  // Default tab
        }
    }

    @Override
    public int getItemCount() {
        return 5;  // Number of tabs
    }
}

