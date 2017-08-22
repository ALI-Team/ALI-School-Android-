package am.alite.alischool

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav.setOnNavigationItemSelectedListener { item: MenuItem ->
            val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            when (item.itemId) {
                R.id.menu_schedule -> {
                    val scheduleFragment = ScheduleFragment()
                    transaction.replace(R.id.fragment_container, scheduleFragment)
                    transaction.commit()
                    true
                }
                R.id.menu_schoolfood -> {
                    val schoolFoodFragment = SchoolFoodFragment()
                    transaction.replace(R.id.fragment_container, schoolFoodFragment)
                    transaction.commit()
                    true
                }
                R.id.menu_settings -> {
                    val settingsFragment = SettingsFragment()
                    transaction.replace(R.id.fragment_container, settingsFragment)
                    transaction.commit()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}
