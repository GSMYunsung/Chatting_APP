package com.example.chatting_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.chatting_app.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(binding.toolbarMain)

        //toolbar 이름 지어주기!
        val toolbar : androidx.appcompat.widget.Toolbar = binding.toolbarMain
        setSupportActionBar(toolbar)
        supportActionBar!!.title = ""

        val tableLayout : TabLayout = binding.tabLayout
        val viewPager : ViewPager = binding.ViewPager
    }

    //자바에서 제한하는 패키지 단위와는 달리 동일한 모듈 내에 있는 클래스들의 접근을 제한하는 접근제한자
    //private와 비
    internal class ViewPagerAdap슷ter(
            val tabcount : Int,
            fragmentManager: FragmentManager,
            //프래그먼트 갯수가 정해졌을때 사용
    ):FragmentPagerAdapter(fragmentManager){
        override fun getCount(): Int {
            // 페이지의 전체 크기를 리턴해준다.
            return tabcount
        }

        override fun getItem(position: Int): Fragment {

        }
    }
}