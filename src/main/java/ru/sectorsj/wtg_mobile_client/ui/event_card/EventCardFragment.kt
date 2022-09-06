package ru.sectorsj.wtg_mobile_client.ui.event_card

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.sectorsj.wtg_mobile_client.databinding.FragmentEventCardBinding


class EventCardFragment : Fragment() {

    private var _binding: FragmentEventCardBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEventCardBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

}