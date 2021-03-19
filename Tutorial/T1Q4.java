/*
Write a class definition for an abstract class, Vehicle, that contains:
• a double instance variable, maxSpeed
• a protected double instance variable, currentSpeed
• a constructor accepting a double used to initialize the maxSpeed instance variable
• an abstract method, accelerate, that accepts no parameters and returns nothing.
• a method getCurrentSpeed that returns the value of currentSpeed
• a method getMaxSpeed that returns the value of maxSpeed
• a method pedalToTheMetal, that repeatedly calls accelerate until the speed of the vehicle is equal to maxSpeed. pedalToTheMetal returns nothing.
Can you create an instance of Vehicle?
*/

public abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed;
    
    public Vehicle(double y){
        maxSpeed = y;
    }
    
    public abstract void accelerate();
    
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    
    public double getMaxSpeed() {
        return maxSpeed;
    }
    
    public void pedalToTheMetal(){
        while (currentSpeed < maxSpeed) { 
            accelerate(); 
        }
    }
}

/*  No, we cannot create an instance of an abstract class because 
    it does not have a complete implementation. 
    The purpose of an abstract class is to function as a base for subclasses. 
*/
