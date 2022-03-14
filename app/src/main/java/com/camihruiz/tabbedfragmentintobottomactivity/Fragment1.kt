package com.camihruiz.tabbedfragmentintobottomactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.camihruiz.tabbedfragmentintobottomactivity.databinding.Fragment1Binding

class Fragment1 : Fragment() {

	private lateinit var fragment1Binding: Fragment1Binding
	
	override fun onCreateView(
		inflater: LayoutInflater , container: ViewGroup? ,
		savedInstanceState: Bundle?
	): View {
		// Inflate the layout for this fragment
		fragment1Binding = Fragment1Binding.inflate(inflater, container, false)
		return fragment1Binding.root
	}
	
	companion object {
		const val PAGE_TITLE = "Tab 1"
		/**
		 * Use this factory method to create a new instance of
		 * this fragment using the provided parameters.
		 * @return A new instance of fragment Fragment1.
		 */
		// TODO: Rename and change types and number of parameters
		@JvmStatic
		fun newInstance() =	Fragment1()
	}
}