package ru.sectorsj.wtg_mobile_client.ui.routes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.sectorsj.wtg_mobile_client.R
import ru.sectorsj.wtg_mobile_client.databinding.FragmentMainBinding
import ru.sectorsj.wtg_mobile_client.databinding.FragmentRoutesBinding

class RoutesFragment : Fragment() {

    private var _binding: FragmentRoutesBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRoutesBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}