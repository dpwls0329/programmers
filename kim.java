//import java.util.Scanner;
import java.util.ArrayList;
public class kim {
    public static void main(String args[]){
        //String answer = "";

        //String[] inputText = {"Jane","Kim"};
        ArrayList<String> inputArray = new ArrayList<String>();
        inputArray.add("Jane");
        inputArray.add("kim");
        // System.out.println(inputArray);
        // inputArray.set(0,"June");
        // System.out.println(inputArray);
        System.out.println(solution(inputArray));
    }
    public static String solution(ArrayList<String> inputArray){
        System.out.println(inputArray.size());
        String answer = "";

        String[] name = new String[3];
        name[0] = "kim";
        name[1] = "park";
        name[2] = "lee";

        for(int i=0; i<inputArray.size(); i++){
            if(name[i].equals("kim")){
                System.out.println("ok");
            }
        }
        return answer;
    }
}
