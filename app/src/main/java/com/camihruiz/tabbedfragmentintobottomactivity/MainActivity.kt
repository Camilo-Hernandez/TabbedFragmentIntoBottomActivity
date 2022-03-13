package com.camihruiz.tabbedfragmentintobottomactivity

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
	private val mOnNavigationItemSelectedListener =
		BottomNavigationView.OnNavigationItemSelectedListener { item: MenuItem ->
			when (item.itemId) {
				R.id.navigation_home          -> {
					replaceFragment(FirstFragment.newInstance() , FRAGMENT_FIRST)
					return@OnNavigationItemSelectedListener true
				}
				R.id.navigation_dashboard     -> {
					replaceFragment(
						SecondFragment.newInstance() ,
						FRAGMENT_SECOND
					)
					return@OnNavigationItemSelectedListener true
				}
				R.id.navigation_notifications -> {
					replaceFragment(
						ViewPagerFragment.newInstance() ,
						FRAGMENT_VIEWPAGER
					)
					return@OnNavigationItemSelectedListener true
				}
			}
			false
		}
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val navigation = findViewById<View>(R.id.navigation) as BottomNavigationView
		navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
		val ft = supportFragmentManager.beginTransaction()
		ft.add(R.id.fragment_container , FirstFragment.newInstance() , FRAGMENT_FIRST)
			.commit()
	}
	
	private fun replaceFragment(newFragment: Fragment , tag: String) {
		val ft = supportFragmentManager.beginTransaction()
		ft.replace(R.id.fragment_container , newFragment , tag)
			.commit()
	}
	
	companion object {
		const val FRAGMENT_VIEWPAGER = "FRAGMENT_VIEWPAGER"
		const val FRAGMENT_FIRST = "FRAGMENT_FIRST"
		const val FRAGMENT_SECOND = "FRAGMENT_SECOND"
	}
}