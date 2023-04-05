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
}