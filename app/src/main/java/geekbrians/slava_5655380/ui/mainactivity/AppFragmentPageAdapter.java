package geekbrians.slava_5655380.ui.mainactivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import geekbrians.slava_5655380.ui.fragments.moon.NotificationFragment;
import geekbrians.slava_5655380.ui.fragments.home.HomeFragment;

public class AppFragmentPageAdapter extends FragmentPagerAdapter {

  public AppFragmentPageAdapter(FragmentManager fm) {
    super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
  }

  @NonNull
  @Override
  public Fragment getItem(int position) {
    switch (position) {
      case 0:
        return new HomeFragment();
      case 1:
        return DashboardFragment.newInstance("Tony");
      case 2:
        return NotificationFragment.newInstance();
      case 3:
        return NotificationFragment.newInstance();
      case 4:
        return NotificationFragment.newInstance();
      default:
        throw new RuntimeException("Not supported");
    }
  }

  @Override
  public int getCount() {
    return 5;
  }
}
