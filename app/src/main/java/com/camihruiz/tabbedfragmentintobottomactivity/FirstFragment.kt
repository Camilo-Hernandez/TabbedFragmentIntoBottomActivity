package com.camihruiz.tabbedfragmentintobottomactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.camihruiz.tabbedfragmentintobottomactivity.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
	
	private lateinit var firstBinding: FragmentFirstBinding
	
	override fun onCreateView(
		inflater: LayoutInflater , container: ViewGroup? ,
		savedInstanceState: Bundle?
	): View {
		// Inflate the layout for this fragment
		firstBinding = FragmentFirstBinding.inflate(inflater, container, false)
		return firstBinding.root
	}
	
	companion object {
		/**
		 * Use this factory method to create a new instance of
		 * this fragment using the provided parameters.
		 *
		 * @return A new instance of fragment FirstFragment.
		 */
		// TODO: Rename and change types and number of parameters
		@JvmStatic
		fun newInstance() =	FirstFragment()
	}
	
	
	
}