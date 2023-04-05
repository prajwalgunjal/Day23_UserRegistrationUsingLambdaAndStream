package bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUsingLambda {
    public boolean validate(String Firstname){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(Firstname);
        if (matcher.matches())
            return true;
        else {
            return false;
        }
    }
    public boolean validateLastName(String LastName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(LastName);
        if(matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validateEmail(String Email){
        Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+([+.-]([a-z0-9A-Z]+))*[@][a-zA-Z0-9]+[.][a-z]{2,4}[,]?([.][a-z]{2,4})?$");
        Matcher matcher = pattern.matcher(Email);
        if(matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validatePhoneNumber(String Phone){
        Pattern pattern = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
        Matcher matcher = pattern.matcher(Phone);
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public boolean ValidatePassword(String password){
        Pattern pattern = Pattern.compile("^[A-Za-z]{8,}$");
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches())
            return true;
        else
            return false;
    }
}