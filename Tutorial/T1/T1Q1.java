/*
Write the definition of a class Telephone that contains:
• An instance variable areaCode
• An instance variable number
• A static variable numberOfTelephoneObject that keeps track of the number of Telephone objects created
• A constructor that accepts two arguments used to initialize the two instance variables
• The accessor and mutator methods for areaCode and number
• A method makeFullNumber that does not accept any argument, concatenates areaCode and number with a dash in between, and returns the resultant String.
*/


class Tester{
  public static void main(String[] args) {
        Telephone[] obj = new Telephone[5] ;
        int number = 79676300;
        for (int i = 0; i < 5; i++) {
            obj[i] = new Telephone("03",number++);
        }
        
        for (int i = 0; i < numberOfTelephoneObject; i++) {
            System.out.println(obj[i].makeFullNumber());
        }
        
    }
}

public class Telephone {
    String number;
    String areaCode;
    static int numberOfTelephoneObject;

    public Telephone(String areaCode, String number) {
        this.number = number;
        this.areaCode = areaCode;
        numberOfTelephoneObject++;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public String makeFullNumber(){
        String FullNo = areaCode+"-"+number;
        return FullNo;
    }
    
}
