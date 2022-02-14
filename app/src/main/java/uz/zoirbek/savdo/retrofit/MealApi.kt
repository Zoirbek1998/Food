package uz.zoirbek.savdo.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import uz.zoirbek.savdo.pojo.CategoryList
import uz.zoirbek.savdo.pojo.MealsByCategoryList
import uz.zoirbek.savdo.pojo.MealList

interface MealApi {

    @GET("random.php")
    fun getRandomMeal():Call<MealList>

    @GET("lookup.php?")
    fun getMealDetails(@Query("i")id : String) : Call<MealList>

    @GET("filter.php?")
    fun getPopularItems(@Query("c") categoryName : String) : Call<MealsByCategoryList>

    @GET("categories.php")
    fun getCategory() : Call<CategoryList>

    @GET("filter.php")
    fun getMealsByCategory(@Query("c") categoryName : String) : Call<MealsByCategoryList>


}