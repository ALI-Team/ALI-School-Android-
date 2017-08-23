package am.alite.alischool.api

import am.alite.alischool.vo.schoolfood.FoodWeek
import am.alite.alischool.vo.schoolfood.SchoolFoodResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by axm on 22/08/17.
 */
interface SchoolFoodAPI {
    @GET("{school}/?fmt=json")
    fun listSchoolFood(@Path("school") school: String, @Query("offset") offset: Int, @Query("limit") limit: Int): Call<SchoolFoodResponse>
}