package com.example.myapplication.Models

class PopularModel {

    private var foodImage : Int? = null
    private var foodName : String = ""
    private var foodPrice : String = ""

    constructor()
    constructor(foodImage: Int?, foodnName: String, foodnPrice: String) {
        this.foodImage = foodImage
        this.foodName = foodnName
        this.foodPrice = foodnPrice
    }

     fun getFoodImage() : Int? {
        return foodImage
    }

     fun getFoodName() : String {
        return foodName
    }

     fun getFoodPrice() : String {
        return foodPrice
    }

     fun setFoodImage(foodImage: Int?){
        this.foodImage = foodImage
    }

     fun setFoodName(foodName: String){
        this.foodName = foodName
    }

     fun setFoodPrice(foodImage: Int?){
        this.foodPrice = foodPrice
    }

}