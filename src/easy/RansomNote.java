package easy;

// 383. Ransom Note
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i); // character at ransomNote[i]

            int matchingIndex = magazine.indexOf(r); // first position of letter r in magazine
            if (matchingIndex == -1) { // can't find r in magazine
                return false;
            }

            magazine = magazine.substring(0, matchingIndex) // remove the first letter in magazine if
                    + magazine.substring(matchingIndex + 1); // matchingIndex equals to 0
        }

        return true;
    }
}

//class Solution {
//    public boolean canConstruct(String ransomNote, String magazine) {
//        HashMap<Character, Integer> magazineLetters = new HashMap<>();
//
//        for (char m : magazine.toCharArray()) {
//            // if HashMap magazineLetters has m then return  value of m, otherwise return 0
//            int currentCount = magazineLetters.getOrDefault(m, 0);
//            magazineLetters.put(m, currentCount + 1);
//        }
//
//        for (char r : ransomNote.toCharArray()) {
//            // if HashMap magazineLetters has r then return  value of m, otherwise return 0
//            int currentCount = magazineLetters.getOrDefault(r, 0);
//
//            // magazine doesn't have specific letter to create ransomNote
//            if (currentCount == 0) {
//                return false;
//            }
//
//            magazineLetters.put(r, currentCount - 1);
//        }
//
//        return true;
//    }
//}
