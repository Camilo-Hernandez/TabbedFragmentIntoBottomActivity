package com.camihruiz.tabbedfragmentintobottomactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment1 : Fragment() {

	override fun onCreateView(
		inflater: LayoutInflater , container: ViewGroup? ,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_1 , container , false)
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