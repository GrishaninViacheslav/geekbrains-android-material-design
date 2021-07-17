package geekbrians.slava_5655380.ui

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import geekbrians.slava_5655380.R
import geekbrians.slava_5655380.ui.fragments.PagerAdapter
import geekbrians.slava_5655380.ui.fragments.DemoTabFragment
import geekbrians.slava_5655380.ui.fragments.pictureoftheday.PictureOfTheDayFragment


class PartThreeActivity : AppCompatActivity() {
    fun openFragment(name: String, instance: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, supportFragmentManager.findFragmentByTag(name) ?: instance, name)
            .addToBackStack(null)
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_part_three)
        findViewById<BottomNavigationView>(R.id.bottom_navigation_view).setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_view_main -> {
                    val fragment = PictureOfTheDayFragment.newInstance()
                    openFragment(fragment.name, fragment)
                    true
                }
                R.id.bottom_view_earth -> {
                    val fragment = HomeFragment.newInstance()
                    openFragment(fragment.name, fragment)
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
        val fragment = PictureOfTheDayFragment.newInstance()
        openFragment(fragment.name, fragment)
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
}