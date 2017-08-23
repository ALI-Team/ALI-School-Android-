package am.alite.alischool.ui.schoolfood


import am.alite.alischool.R
import am.alite.alischool.vo.schoolfood.FoodWeek
import android.arch.lifecycle.LifecycleFragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_school_food.*


class SchoolFoodFragment : LifecycleFragment() {
    private lateinit var viewModel: SchoolFoodViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SchoolFoodViewModel::class.java)
        viewModel.init("berzeliusskolan", 0)

        viewModel.foodWeek.observe(this, object: Observer<List<FoodWeek>> {
            override fun onChanged(t: List<FoodWeek>?) {
                Log.d("SchoolFoodFragment", t.toString())
            }
        })
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_school_food, container, false)
    }

}
