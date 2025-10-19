package easy;

import java.util.ArrayList;
import java.util.List;

//412. Fizz Buzz
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> resultStrArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) { // if i is divisible by 3 and 5
                resultStrArray.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) { // if i is divisible by 3
                resultStrArray.add("Fizz");
            } else if ((i + 1) % 5 == 0) { // if i is divisible by 5
                resultStrArray.add("Buzz");
            } else { // none of the above conditions are true
                resultStrArray.add(String.valueOf((i + 1)));
            }
        }

        return resultStrArray;
    }
}
