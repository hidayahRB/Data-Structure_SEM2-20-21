/*
Assume the existence of an interface, Account, with the following methods:
• deposit: accepts an integer parameter and returns an integer
• withdraw: accepts an integer parameter and return a Boolean
Define a class, BankAccount, that implements the above interface and has the following members:
• an instance variable named balance
• a constructor that accepts an integer that is used to initialize the instance variable
• an implementation of the deposit method that adds its parameter to the balance variable. The new balance is returned as the value of the method.
• an implementation of the withdraw method that checks whether its parameter is less than or equal to the balance and if so, 
  decreases the balance by the value of the parameter and returns true; 
  otherwise, it leaves the balance unchanged and returns false.
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
