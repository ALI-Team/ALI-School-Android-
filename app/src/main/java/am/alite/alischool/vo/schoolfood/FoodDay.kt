package am.alite.alischool.vo.schoolfood

import com.google.gson.annotations.SerializedName

/**
 * Created by axm on 22/08/17.
 */
data class FoodDay(@SerializedName("items") val rawAlternatives: List<String>,
                   @SerializedName("week_day") val daynr: Int) {
    @Transient var alternatives: MutableList<FoodItem>? = mutableListOf()

    fun parseAlternatives() {
        alternatives = mutableListOf()
        rawAlternatives.mapTo(alternatives!!) { str -> FoodItem(str) }
    }

    override fun toString(): String = "FoodDay(alternatives=$alternatives, daynr=$daynr)"
}