package am.alite.alischool.vo.schoolfood

import com.google.gson.annotations.SerializedName

/**
 * Created by axm on 22/08/17.
 */
data class FoodDay(@SerializedName("items") val alternatives: List<FoodItem>, @SerializedName("week_day") val daynr: Int)