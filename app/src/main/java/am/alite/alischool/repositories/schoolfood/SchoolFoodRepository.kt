package am.alite.alischool.repositories.schoolfood

import am.alite.alischool.api.SchoolFoodAPI
import am.alite.alischool.vo.schoolfood.FoodWeek
import am.alite.alischool.vo.schoolfood.SchoolFoodResponse
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by axm on 22/08/17.
 */
class SchoolFoodRepository {
    private val api: SchoolFoodAPI;
    private val url = "https://skolmaten.se"

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        api = retrofit.create(SchoolFoodAPI::class.java)
    }

    fun schoolfood(school: String, offset: Int, limit: Int): LiveData<List<FoodWeek>> {
        val data: MutableLiveData<List<FoodWeek>> = MutableLiveData()
        api.listSchoolFood(school, offset, limit).enqueue(object: Callback<SchoolFoodResponse> {
            override fun onResponse(call: Call<SchoolFoodResponse>?, response: Response<SchoolFoodResponse>?) {
                response?.body()?.parseAlternatives()
                data.value = response?.body()?.weeks
            }

            override fun onFailure(call: Call<SchoolFoodResponse>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })

        return data
    }
}