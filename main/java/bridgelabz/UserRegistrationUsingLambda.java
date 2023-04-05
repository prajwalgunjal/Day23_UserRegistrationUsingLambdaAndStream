package bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUsingLambda {
    public boolean validate(String Firstname) throws InvalidFirstNameException{
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(Firstname);
        if (matcher.matches())
            return true;
        else {
            return false;
        }
    }
    public boolean validateLastName(String LastName)throws InvalidLastNameException{
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(LastName);
        if(matcher.matches())
            return true;
        else
            throw new InvalidLastNameException("Please Enter Your Valid phone number");
    }
    public boolean validateEmail(String Email)throws InvalidEmailIdException{
        Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+([+.-]([a-z0-9A-Z]+))*[@][a-zA-Z0-9]+[.][a-z]{2,4}[,]?([.][a-z]{2,4})?$");
        Matcher matcher = pattern.matcher(Email);
        if(matcher.matches())
            return true;
        else
            throw new InvalidEmailIdException("please Enter valid Email");
    }
    public boolean validatePhoneNumber(String Phone)throws InvalidPhoneNumberException{
        Pattern pattern = Pattern.compile("^[0-9]{2,}[0-9]{10,}$");
        Matcher matcher = pattern.matcher(Phone);
        if (matcher.matches())
            return true;
        else
            throw new InvalidPhoneNumberException("CHeck Phone number");
    }
    public boolean ValidatePassword(String password)throws InvalidPasswordException{
        Pattern pattern = Pattern.compile("\"^(?=.*[A-Z])(?=.*\\\\d)(?=.*[!@#$%^&*()_+])[A-Za-z\\\\d!@#$%^&*()_+]{8,}$\"");
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            return true;
        }
        else
            throw new InvalidPasswordException("Please check password");
    }
}