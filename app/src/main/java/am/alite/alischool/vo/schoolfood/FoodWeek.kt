package am.alite.alischool.vo.schoolfood

import com.google.gson.annotations.SerializedName

/**
 * Created by axm on 22/08/17.
 */
data class FoodWeek(val days: List<FoodDay>, @SerializedName("week") val weeknr: Int) {
    fun parseAlternatives() = days.forEach {day -> day.parseAlternatives()}
}