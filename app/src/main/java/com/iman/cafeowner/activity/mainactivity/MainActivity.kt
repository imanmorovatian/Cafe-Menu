package com.iman.cafeowner.activity.mainactivity

import android.os.Bundle
import android.widget.Toast
import com.iman.cafeowner.R
import com.iman.cafeowner.data.model.MainMenuItem
import com.iman.cafeowner.utils.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainContract.View {

    private val mPresenter = MainPresenter(this)
    private lateinit var mMainMenuItems: List<MainMenuItem>
    private lateinit var mMainMenuAdapter: MainMenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        setupMainMenu()
    }

    private fun generateMainMenuItem() {
        mMainMenuItems = listOf(
            MainMenuItem(
                getString(R.string.order),
            R.drawable.baseline_emoji_food_beverage_24,
                Runnable { Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show() }
            ),
            MainMenuItem(
                getString(R.string.order),
                R.drawable.baseline_emoji_food_beverage_24,
                Runnable { Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show() }
            ),
            MainMenuItem(
                getString(R.string.order),
                R.drawable.baseline_emoji_food_beverage_24,
                Runnable { Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show() }
            ),
            MainMenuItem(
                getString(R.string.order),
                R.drawable.baseline_emoji_food_beverage_24,
                Runnable { Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show() }
            )
        )

    }

    private fun setupMainMenu() {
        generateMainMenuItem()
        mMainMenuAdapter = MainMenuAdapter(mMainMenuItems)
        recycler_view_menu.apply {
            adapter = mMainMenuAdapter
            addItemDecoration(GridDecorator(25))
        }
    }

}
