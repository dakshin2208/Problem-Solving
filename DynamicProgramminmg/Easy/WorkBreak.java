package DynamicProgramminmg.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class WorkBreak {
    private static boolean ExtremeNaive(String word , String[] dic){

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(dic));

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                if(check(dic , word.substring(i,j))){
                    hashSet.remove(word.substring(i,j));
                }
            }
        }

        return hashSet.isEmpty();
    }
    private static boolean check(String[] dic , String ch){

        for(String s : dic){
            if(s.equals(ch)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String word = "ilike";
        String[] dic = {"i" , "like" , "gfg"};

        System.out.println(ExtremeNaive(word , dic));
    }
}
