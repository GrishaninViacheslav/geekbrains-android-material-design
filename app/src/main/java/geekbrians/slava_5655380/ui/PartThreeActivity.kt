package geekbrians.slava_5655380.ui

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import geekbrians.slava_5655380.R
import geekbrians.slava_5655380.ui.fragments.PagerAdapter
import geekbrians.slava_5655380.ui.fragments.PartThreeFragment


class PartThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_three)
        initViewPagerAndTabs()
    }

    private fun initViewPagerAndTabs() {
        val viewPager = findViewById<View>(R.id.viewPager) as ViewPager
        val pagerAdapter = PagerAdapter(supportFragmentManager)
        pagerAdapter.addFragment(PartThreeFragment.newInstance(), getString(R.string.tab_1))
        pagerAdapter.addFragment(PartThreeFragment.newInstance(), getString(R.string.tab_2))
        viewPager.adapter = pagerAdapter
        val tabLayout = findViewById<View>(R.id.tabLayout) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FF0000"));
        tabLayout.setSelectedTabIndicatorHeight((5 * getResources().getDisplayMetrics().density).toInt());
        tabLayout.setTabTextColors(Color.parseColor("#000000"), Color.parseColor("#ff0000"));
    }
}