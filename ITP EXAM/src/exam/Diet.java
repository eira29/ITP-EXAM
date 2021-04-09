package exam;

import java.util.ArrayList;

public class Diet {
    int daysDuration;
    String purpose;
    ArrayList allowedFood;
    Boolean isVegan;

    public Diet(int daysDuration, String purpose, ArrayList allowedFood, Boolean isVegan) {
        this.daysDuration = daysDuration;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
    }

    public int getDaysDuration() {
        return daysDuration;
    }

    public String getPurpose() {
        return purpose;
    }

    public ArrayList getAllowedFood() {
        return allowedFood;
    }

    public Boolean getVegan() {
        return isVegan;
    }

    public void setDaysDuration(int daysDuration) {
        this.daysDuration = daysDuration;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setAllowedFood(ArrayList allowedFood) {
        this.allowedFood = allowedFood;
    }

    public void setVegan(Boolean vegan) {
        isVegan = vegan;
    }
}

