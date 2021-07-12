package geekbrians.slava_5655380.ui.mainactivity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import geekbrians.slava_5655380.ui.fragments.DashboardFragment
import geekbrians.slava_5655380.ui.fragments.earth.EarthDashboardChildFragmentA
import geekbrians.slava_5655380.ui.fragments.earth.EarthDashboardChildFragmentB
import geekbrians.slava_5655380.ui.fragments.home.HomeFragment
import geekbrians.slava_5655380.ui.fragments.mars.MarsFragment
import geekbrians.slava_5655380.ui.fragments.moon.MoonDashboardChildFragmentA
import geekbrians.slava_5655380.ui.fragments.moon.MoonDashboardChildFragmentB
import geekbrians.slava_5655380.ui.fragments.space.SpaceFragment

class AppFragmentPageAdapter(fm: FragmentManager?) : FragmentPagerAdapter(
    fm!!, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    val earthChildDashboardFragments = arrayListOf<Fragment>(
        EarthDashboardChildFragmentA.newInstance("Earth"),
        EarthDashboardChildFragmentB.newInstance("Earth"),
    )

    val moonChildDashboardFragments = arrayListOf<Fragment>(
        MoonDashboardChildFragmentA.newInstance("Moon"),
        MoonDashboardChildFragmentB.newInstance("Moon"),
    )

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> DashboardFragment.newInstance(
                "Earth",
                earthChildDashboardFragments
            )
            2 -> DashboardFragment.newInstance(
                "Moon",
                moonChildDashboardFragments
            )
            3 -> MarsFragment.newInstance()
            4 -> SpaceFragment.newInstance()
            else -> throw RuntimeException("Not supported")
        }
    }

    override fun getCount(): Int {
        return 5
    }
}