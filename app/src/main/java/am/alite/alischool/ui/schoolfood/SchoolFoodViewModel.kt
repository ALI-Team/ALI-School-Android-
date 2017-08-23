package am.alite.alischool.ui.schoolfood

import am.alite.alischool.repositories.schoolfood.SchoolFoodRepository
import am.alite.alischool.vo.schoolfood.FoodWeek
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by axm on 22/08/17.
 */
class SchoolFoodViewModel : ViewModel() {
    private var foodWeek_: LiveData<List<FoodWeek>>? = null
    private val repo: SchoolFoodRepository = SchoolFoodRepository()

    fun init(school: String, offset: Int) {
        foodWeek_ = repo.schoolfood(school, offset, 1)
    }

    val foodWeek
        get() = foodWeek_!!
}