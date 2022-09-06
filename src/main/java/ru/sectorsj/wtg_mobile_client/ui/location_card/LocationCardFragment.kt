package ru.sectorsj.wtg_mobile_client.ui.location_card

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.sectorsj.wtg_mobile_client.R
import ru.sectorsj.wtg_mobile_client.databinding.FragmentFavoriteBinding
import ru.sectorsj.wtg_mobile_client.databinding.FragmentLocationCardBinding

class LocationCardFragment : Fragment() {

    private var _binding: FragmentLocationCardBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLocationCardBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}