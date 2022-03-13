package com.camihruiz.tabbedfragmentintobottomactivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.camihruiz.tabbedfragmentintobottomactivity.databinding.FragmentViewPagerBinding


class ViewPagerFragment : Fragment() {
	private lateinit var viewPagerBinding: FragmentViewPagerBinding
	
	override fun onCreateView(
		inflater: LayoutInflater , container: ViewGroup? ,
		savedInstanceState: Bundle?
	): View {
		// Inflate the layout for this fragment
		viewPagerBinding = FragmentViewPagerBinding.inflate(inflater , container , false)
		// Call the view pager component from the layout and assign a childFragmentManager to its adapter property
		viewPagerBinding.innerViewPager.adapter = ViewPagerAdapter(childFragmentManager)
		return viewPagerBinding.root
	}
	
	companion object {
		fun newInstance(): ViewPagerFragment {
			return ViewPagerFragment()
		}
	}
	
	class ViewPagerAdapter(fm: FragmentManager?) :
		FragmentStatePagerAdapter(fm!!) {
		override fun getCount(): Int {
			// Number of fragments
			return 2
		}
		
		override fun getItem(position: Int): Fragment {
			return when (position) {
				0 -> Fragment1.newInstance()
				else -> Fragment2.newInstance()
			}
		}
		
		override fun getPageTitle(position: Int): CharSequence {
			return when (position) {
				0 -> Fragment1.PAGE_TITLE
				else -> Fragment2.PAGE_TITLE
			}
		}
	}
	
}