
package main;

public class Food {
    private int foodID;
    private String nameOfFood;
    private int calorieCount;//kalori sayısı

    public Food(int foodID, String nameOfFood, int calorieCount) {
        this.foodID = foodID;
        this.nameOfFood = nameOfFood;
        this.calorieCount = calorieCount;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }

    public int getCalorieCount() {
        return calorieCount;
    }

    public void setCalorieCount(int calorieCount) {
        this.calorieCount = calorieCount;
    }
    
    
}
