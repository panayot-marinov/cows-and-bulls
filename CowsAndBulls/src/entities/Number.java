package entities;

import animals.Bull;
import animals.Cow;
import contracts.IAnimal;

import java.util.ArrayList;

public class Number {
    private int firstDigit;
    private int secondDigit;
    private int thirdDigit;
    private int fourthDigit;

    public Number(int number){
        int firstDigit = number / 1000;
        int secondDigit = number / 100 % 10;
        int thirdDigit = number / 10 % 10;
        int fourthDigit = number % 10;

        this.firstDigit = firstDigit;
        this.secondDigit = secondDigit;
        this.thirdDigit = thirdDigit;
        this.fourthDigit = fourthDigit;
    }

    public int getFirstDigit(){
        return this.firstDigit;
    }
    public void setFirstDigit(int value){
        this.firstDigit = value;
    }
    public int getSecondDigit(){
        return this.secondDigit;
    }
    public void setSecondDigit(int value){
        this.secondDigit = value;
    }
    public int getThirdDigit(){
        return this.thirdDigit;
    }
    public void setThirdFigit(int value){
        this.thirdDigit = value;
    }
    public int getFourthDigit(){
        return this.fourthDigit;
    }
    public void setFourthDigit(int value){
        this.fourthDigit = value;
    }

    private boolean containsDigit(int digit){
        boolean containsDigit =
                digit == this.firstDigit ||
                        digit == this.secondDigit ||
                        digit == this.thirdDigit ||
                        digit == this.fourthDigit;

        return containsDigit;
    }

    public ArrayList<IAnimal> compareWith(Number numberToCompare){
        ArrayList<IAnimal> animals = new ArrayList<>();
        
        if(numberToCompare.firstDigit == this.firstDigit){
            animals.add(new Bull());
        }
        else if(this.containsDigit(numberToCompare.firstDigit)){
            animals.add(new Cow());
        }

        if(numberToCompare.secondDigit == this.secondDigit){
            animals.add(new Bull());
        }
        else if(this.containsDigit(numberToCompare.secondDigit)){
            animals.add(new Cow());
        }

        if(numberToCompare.thirdDigit == this.thirdDigit){
            animals.add(new Bull());
        }
        else if(this.containsDigit(numberToCompare.thirdDigit)){
            animals.add(new Cow());
        }

        if(numberToCompare.fourthDigit == this.fourthDigit){
            animals.add(new Bull());
        }
        else if(this.containsDigit(numberToCompare.fourthDigit)){
            animals.add(new Cow());
        }

        return animals;
    }

    @Override
    public String toString() {
        String stringToReturn =
                "" + firstDigit + secondDigit + thirdDigit + fourthDigit;

        return stringToReturn;
    }
}
