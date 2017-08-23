package am.alite.alischool.vo.schoolfood

import com.google.gson.Gson
import com.google.gson.GsonBuilder

/**
 * Created by axm on 22/08/17.
 */
data class SchoolFoodResponse(val weeks: List<FoodWeek>) {

    fun parseAlternatives() = weeks.forEach { week -> week.parseAlternatives()}

    companion object {
        fun fromJSON(json: String): SchoolFoodResponse {
            val gson: Gson = GsonBuilder().create()
            val schoolFoodResponse: SchoolFoodResponse = gson.fromJson(json, SchoolFoodResponse::class.java)
            return schoolFoodResponse
        }
    }
}