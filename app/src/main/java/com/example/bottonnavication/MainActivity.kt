package com.example.bottonnavication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment=findViewById<DrawerLayout>(R.id.drawerLayout)
        val toolbar=findViewById<androidx.appcompat.widget.Toolbar>(R.id.tolbar)
        val navigationView=findViewById<NavigationView>(R.id.navigationView)
        navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.setting->changeFragment(FirstFragment())
                R.id.home->changeFragment(SecondFragment())
                R.id.tolbar->changeFragment(ThirdFragment())
            }
            fragment.close()
            true
        }
        toolbar.setNavigationOnClickListener {
            fragment.open()
        }

        val nagigationbutton=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        nagigationbutton.setOnItemSelectedListener {
            when(it.itemId){

                R.id.home->changeFragment(FirstFragment())
                R.id.profile->changeFragment(SecondFragment())
                R.id.setting->changeFragment(ThirdFragment())
            }
            true
        }
    }
    fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit()
    }
}