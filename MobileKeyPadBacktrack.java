
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Atul Kumar , Date : 12/02/21
 */
public class MobileKeyPadBacktrack {

    static List<String> response = new ArrayList<>();
    static String digits = "23";
    static Map<String, String> digitToChar = new HashMap<String, String>(){
        {
            put("2","abc");
            put("3","def");
            put("4","ghi");
            put("5","jkl");
            put("6","mno");
            put("7","pqrs");
            put("8","tuv");
            put("9","wxyz");
        }
    };

    public static void backtrack(int i, String curStr){
        if(digits.length() == curStr.length()){
            response.add(curStr);
            return;
        }
        for(char c : digitToChar.get(digits.charAt(i)+"").toCharArray()){
            backtrack(i+1, curStr + c);
        }
    }

    private static List<String> letterCombination(){
        backtrack(0,"");
        return response;
    }

    public static void main(String[] args) {
        System.out.println(letterCombination());
    }
}
