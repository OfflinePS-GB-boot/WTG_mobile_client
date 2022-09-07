package ru.sectorsj.wtg_mobile_client.ui.route_card

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.sectorsj.wtg_mobile_client.databinding.FragmentRouteCardBinding


class RouteCardFragment : Fragment() {

    private var _binding: FragmentRouteCardBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRouteCardBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}