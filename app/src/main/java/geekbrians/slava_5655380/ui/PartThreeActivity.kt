package geekbrians.slava_5655380.ui

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import geekbrians.slava_5655380.R
import geekbrians.slava_5655380.ui.fragments.PagerAdapter
import geekbrians.slava_5655380.ui.fragments.PartThreeFragment


class PartThreeActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_three)
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initViewPagerAndTabs()
        findViewById<BottomNavigationView>(R.id.bottom_navigation_view).setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_view_main -> {
                    Log.d("[MYLOG]", "bottom_navigation_view bottom_view_main tapped")
                    true
                }
                R.id.bottom_view_earth -> {
                    Log.d("[MYLOG]", "bottom_navigation_view bottom_view_earth tapped")
                    true
                }
                R.id.bottom_view_moon -> {
                    Log.d("[MYLOG]", "bottom_navigation_view bottom_view_moon tapped")
                    true
                }
                R.id.bottom_view_mars -> {
                    Log.d("[MYLOG]", "bottom_navigation_view bottom_view_mars tapped")
                    true
                }
                R.id.bottom_view_space -> {
                    Log.d("[MYLOG]", "bottom_navigation_view bottom_view_space tapped")
                    true
                }
                else -> false
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.getItemId()
        return if (id == R.id.menu_button_search) {
            true
        } else super.onOptionsItemSelected(item)
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