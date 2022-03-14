package com.camihruiz.tabbedfragmentintobottomactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.camihruiz.tabbedfragmentintobottomactivity.databinding.Fragment2Binding

class Fragment2 : Fragment() {
	
	private lateinit var fragment2Binding: Fragment2Binding
	
	override fun onCreateView(
		inflater: LayoutInflater , container: ViewGroup? ,
		savedInstanceState: Bundle?
	): View {
		// Inflate the layout for this fragment
		fragment2Binding = Fragment2Binding.inflate(inflater, container, false)
		return fragment2Binding.root
	}
	
	companion object {
		const val PAGE_TITLE = "Tab 2"
		/**
		 * Use this factory method to create a new instance of
		 * this fragment using the provided parameters.
		 * @return A new instance of fragment Fragment2.
		 */
		@JvmStatic
		fun newInstance() =	Fragment2()
	}
}