package geekbrians.slava_5655380.ui.fragments.earth

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import geekbrians.slava_5655380.R
import geekbrians.slava_5655380.databinding.FragmentEarthBinding

class EarthFragment(val name: String = "HomeFragment") : Fragment() {
    private var _binding: FragmentEarthBinding? = null
    private val binding get() = _binding!!
    private lateinit var toolbar: Toolbar

//    val pagerAdapter: PagerAdapter by lazy {
//        PagerAdapter(requireActivity().supportFragmentManager).apply {
//            addFragment(DemoTabFragment.newInstance(), getString(R.string.tab_1))
//            addFragment(DemoTabFragment.newInstance(), getString(R.string.tab_2))
//        }
//    }

    private fun initViewPagerAndTabs() {
        val pagerAdapter = PagerAdapter(requireActivity().supportFragmentManager).apply {
            addFragment(DemoTabFragment.newInstance(), getString(R.string.tab_1))
            addFragment(DemoTabFragment.newInstance(), getString(R.string.tab_2))
        }
        val viewPager = binding.viewPager
        viewPager.adapter = pagerAdapter
        val tabLayout = binding.tabLayout
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FF0000"));
        tabLayout.setSelectedTabIndicatorHeight((5 * getResources().getDisplayMetrics().density).toInt());
        tabLayout.setTabTextColors(Color.parseColor("#000000"), Color.parseColor("#ff0000"));
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEarthBinding.inflate(inflater, container, false)
        toolbar = binding.toolbar
        (activity as AppCompatActivity).setSupportActionBar(toolbar); // TODO: попробоавть вызывать setSupportActionBar +  menuInflater.inflate при открытии фрагмен
        initViewPagerAndTabs()
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = EarthFragment()
    }
}