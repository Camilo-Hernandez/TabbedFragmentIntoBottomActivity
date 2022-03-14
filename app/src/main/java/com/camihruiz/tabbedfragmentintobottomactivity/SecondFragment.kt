package com.camihruiz.tabbedfragmentintobottomactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.camihruiz.tabbedfragmentintobottomactivity.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
	
	private lateinit var secondBinding: FragmentSecondBinding
	
	override fun onCreateView(
		inflater: LayoutInflater , container: ViewGroup? ,
		savedInstanceState: Bundle?
	): View {
		// Inflate the layout for this fragment
		secondBinding = FragmentSecondBinding.inflate(inflater,container,false)
		return secondBinding.root
	}
	
	companion object {
		/**
		 * Use this factory method to create a new instance of
		 * this fragment using the provided parameters.
		 *
		 * @return A new instance of fragment SecondFragment.
		 */
		// TODO: Rename and change types and number of parameters
		@JvmStatic
		fun newInstance() =	SecondFragment()
	}
}