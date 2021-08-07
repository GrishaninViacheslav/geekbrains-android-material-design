package geekbrians.slava_5655380

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import geekbrians.slava_5655380.ui.fragments.pictureoftheday.PictureOfTheDayFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitNow()
        }
    }
}