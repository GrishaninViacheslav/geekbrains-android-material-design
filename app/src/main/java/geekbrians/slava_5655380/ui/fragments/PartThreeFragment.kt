package geekbrians.slava_5655380.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import geekbrians.slava_5655380.R
import geekbrians.slava_5655380.ui.viewmodels.PartThreeViewModel

class PartThreeFragment : Fragment() {

    companion object {
        fun newInstance() = PartThreeFragment()
    }

    private lateinit var viewModel: PartThreeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.part_three_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PartThreeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}