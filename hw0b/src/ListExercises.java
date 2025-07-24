import java.util.List;
import java.util.ArrayList;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        if(L.isEmpty()){
            return 0;
        }
        else{
            int total = 0;
            for(int i : L){
                total += i;
            }
            return total;
        }
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> even = new ArrayList<>();
        for(int i : L){
            if(i % 2 == 0){
                even.add(i);
            }
        }
        return even;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill i{n this function.
        List<Integer> L3 = new ArrayList<>();
        for (int i : L1){
            for (int j : L2){
                if(i == j) {
                    L3.add(i);
                }
            }
    }
        return L3;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(c == word.charAt(i)){
                    count++;
                }
            }
        }
        return count;
    }
}
