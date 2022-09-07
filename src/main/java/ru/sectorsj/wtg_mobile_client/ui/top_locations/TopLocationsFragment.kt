package ru.sectorsj.wtg_mobile_client.ui.top_locations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.sectorsj.wtg_mobile_client.R
import ru.sectorsj.wtg_mobile_client.databinding.FragmentTopEventsBinding
import ru.sectorsj.wtg_mobile_client.databinding.FragmentTopLocationsBinding

class TopLocationsFragment : Fragment() {

    private var _binding: FragmentTopLocationsBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTopLocationsBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}