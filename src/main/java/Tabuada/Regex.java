package Tabuada;
import java.util.regex.*;

public class Regex {

    public boolean checkValor(String name)
    {
        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(name);
        
        if(m.find())
        {
            return true;
        }else {
            return false;
        }
    }
}
