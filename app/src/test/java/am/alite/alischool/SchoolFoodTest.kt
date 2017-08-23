package am.alite.alischool

import am.alite.alischool.vo.schoolfood.FoodItem
import org.junit.Test
import org.junit.Assert.*

/**
 * Created by axm on 22/08/17.
 */
class SchoolFoodTest {
    @Test
    fun testFoodItemParsingName() {
        val item = FoodItem("Chicken Madras, rice (Organic, Healthy)")
        assertEquals("Chicken Madras, rice", item.name)
    }

    @Test
    fun testFoodItemParsingTags() {
        val item = FoodItem("Chicken Madras, rice (Organic, Healthy)")
        assertEquals(listOf("Organic", "Healthy"), item.tags)
    }

    @Test
    fun testFoodItemParsingNoTags() {
        val item = FoodItem("Chicken Madras, rice")
        assertEquals(listOf<String>(), item.tags)
    }

    @Test
    fun testFoodItemParsingOneTag() {
        val item = FoodItem("Chicken Madras, rice (Organic)")
        assertEquals(listOf("Organic"), item.tags)
    }
}