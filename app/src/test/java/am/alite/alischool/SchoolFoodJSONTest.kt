package am.alite.alischool

import am.alite.alischool.vo.schoolfood.SchoolFoodResponse
import org.junit.Test

/**
 * Created by sekten on 2017-08-23.
 */
class SchoolFoodJSONTest {
    @Test
    fun testSchoolFoodJSON() {
        val json = "{\n" +
                "\t\"school\": {\n" +
                "\t\t\"url\": \"/berzeliusskolan/\",\n" +
                "\t\t\"district\": {\n" +
                "\t\t\t\"province\": \"Östergötlands län\",\n" +
                "\t\t\t\"name\": \"Linköpings kommun\",\n" +
                "\t\t\t\"key\": \"70014\"\n" +
                "\t\t},\n" +
                "\t\t\"logo_url\": \"https://lh3.googleusercontent.com/IrA9qAdeA94c1eEwOO45vBe5sO2bqZGsYULt1snMhou3zWQ4HtYTexR5oB0hQI_nmqeAnnQWMuFfM17fIg\",\n" +
                "\t\t\"name\": \"Berzeliusskolan\",\n" +
                "\t\t\"key\": \"5363732662190080\"\n" +
                "\t},\n" +
                "\t\"weeks\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"week\": 34,\n" +
                "\t\t\t\"url\": \"/berzeliusskolan/\",\n" +
                "\t\t\t\"days\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"date\": \"2017-08-21\",\n" +
                "\t\t\t\t\t\"items\": [\n" +
                "\t\t\t\t\t\t\"Pytt i panna, rödbetor (Ko)\",\n" +
                "\t\t\t\t\t\t\"Kalops, potatis (Ko)\",\n" +
                "\t\t\t\t\t\t\"Couscouspytt, vitlöksdressing (Vegetariskt)\"\n" +
                "\t\t\t\t\t],\n" +
                "\t\t\t\t\t\"week_day\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"date\": \"2017-08-22\",\n" +
                "\t\t\t\t\t\"items\": [\n" +
                "\t\t\t\t\t\t\"Grillkorv, potatismos (Lokalproducerat, Lagad från grunden)\",\n" +
                "\t\t\t\t\t\t\"Hot chicken soup med chilimarinerad majs, färskost (Fågel, Lagad från grunden)\",\n" +
                "\t\t\t\t\t\t\"Sojakorv, potatismos (Vegetariskt, Lagad från grunden)\"\n" +
                "\t\t\t\t\t],\n" +
                "\t\t\t\t\t\"week_day\": 1\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"date\": \"2017-08-23\",\n" +
                "\t\t\t\t\t\"items\": [\n" +
                "\t\t\t\t\t\t\"Ugnsfärs, gräddsås, potatis (Ko, Lagad från grunden)\",\n" +
                "\t\t\t\t\t\t\"Kycklinglevergryta med bacon, potatis (Fågel, Lagad från grunden)\",\n" +
                "\t\t\t\t\t\t\"Sojafärsrutor, gräddsås, potatis (Vegetariskt, Lagad från grunden)\"\n" +
                "\t\t\t\t\t],\n" +
                "\t\t\t\t\t\"week_day\": 2\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"date\": \"2017-08-24\",\n" +
                "\t\t\t\t\t\"items\": [\n" +
                "\t\t\t\t\t\t\"Krämig pastasås med lax, pasta (Fisk, Lagad från grunden)\",\n" +
                "\t\t\t\t\t\t\"Chilisoppa, ost (Ko, Lagad från grunden)\",\n" +
                "\t\t\t\t\t\t\"Jasminkas krämiga grönsakssås, pasta (Vegetariskt, Lagad från grunden)\"\n" +
                "\t\t\t\t\t],\n" +
                "\t\t\t\t\t\"week_day\": 3\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"date\": \"2017-08-25\",\n" +
                "\t\t\t\t\t\"items\": [\n" +
                "\t\t\t\t\t\t\"Kycklingkylett, gräddsås, ris (Svenskproducerat, Fågel)\",\n" +
                "\t\t\t\t\t\t\"Vårrullar med grönsaker, sweet chilisås, ris (Vegetariskt, Lokalproducerat)\",\n" +
                "\t\t\t\t\t\t\"Broccolibiff, gräddsås, ris (Vegetariskt)\"\n" +
                "\t\t\t\t\t],\n" +
                "\t\t\t\t\t\"week_day\": 4\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"year\": 2017\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"bulletins\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"href\": \"https://www.facebook.com/kostochrestauranglinkoping/\",\n" +
                "\t\t\t\"text\": \"Följ oss gärna på Facebook (här)\",\n" +
                "\t\t\t\"image\": \"https://lh3.googleusercontent.com/beH4ek293EnUogm8bI9MyOCUfNVnOOqTuJ6X2ztuefKJGLs7txns4WyiUavOGhyL4MJ6UrF41VxFIfORugM\",\n" +
                "\t\t\t\"html\": \"F&#246;lj oss g&#228;rna p&#229; Facebook (h&#228;r)\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}"
        val sfr = SchoolFoodResponse.fromJSON(json)
        sfr.parseAlternatives()
        println(sfr)
    }
}