package projeto1;

/**
 *
 * @author PET.Com
 */
public class Patterns {
    public boolean carPlate(String plate){
        if(plate.matches("[A-Z]{3}" + "-" + "[\\d]{4}"))
            return true;
        else
            return false;
    }
    public boolean phoneNumber(String number){
        if(number.matches("[\\d]?[\\d]{4}" + "-" + "[\\d]{4}"))
            return true;
        else
            return false;
    }
    public boolean cpf(String number){
        if(number.matches("[\\d]{3}" + "." + "[\\d]{3}" + "." + "[\\d]{3}" + "-" + "[\\d]{2}"))
            return true;
        else
            return false;
    }
}
