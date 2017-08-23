package am.alite.alischool.vo.schoolfood

/**
 * Created by axm on 22/08/17.
 */
data class FoodItem(private val info: String) {
    val name: String
    val tags: List<String>

    init {
        val split: List<String> = info.split(Regex("\\("))
        name = split[0].trim()
        tags = if (split.size == 2) split[1].dropLast(1).split(Regex(", ")) else listOf()
    }

    override fun toString(): String {
        return "FoodItem(name=\"$name\", tags=$tags)"
    }
}