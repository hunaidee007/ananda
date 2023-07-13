package singleton;

public class StringUtil {

    private static StringUtil instance;

    private StringUtil (){

    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public  static StringUtil getInstance() {
        if(instance == null) {
            instance =  new StringUtil();
        }

        return instance;

    }
}
