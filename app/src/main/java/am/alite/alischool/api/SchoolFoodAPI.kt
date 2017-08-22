package am.alite.alischool.api

import am.alite.alischool.vo.schoolfood.FoodWeek
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by axm on 22/08/17.
 */
interface SchoolFoodAPI {
    @GET("{school}/?fmt=json")
    fun listSchoolFood(@Query("offset") offset: Int, @Query("limit") limit: Int): Call<List<FoodWeek>>
}