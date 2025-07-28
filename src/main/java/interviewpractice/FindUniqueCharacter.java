package interviewpractice;

import java.util.*;

public class FindUniqueCharacter {

    private static int findUnique(String str) {

        char[] charArray = str.toCharArray();
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for(int i = 0; i<charArray.length; i++) {
            characterIntegerMap.put(charArray[i], characterIntegerMap.getOrDefault(charArray[i], 0) + 1);
        }
        for(Map.Entry<Character, Integer> characterIntegerEntry : characterIntegerMap.entrySet()) {
            if(characterIntegerMap.get(characterIntegerEntry.getKey()) == 1)
                for(int i = 0; i<charArray.length; i++) {
                    if(charArray[i] == characterIntegerEntry.getKey())
                        return i;
                }
        }

        return -1;
    }

    private static int findUniqueChar(String str) {
        char[] charArray = str.toCharArray();
        Set<Character> characterSet = new LinkedHashSet<>();
        for(int i = 0; i<charArray.length; i++) {
            if(!characterSet.contains(charArray[i])) {
                characterSet.add(charArray[i]);
            } else {
                characterSet.remove(charArray[i]);
            }
        }
        if(!characterSet.isEmpty()) {
            Character next = characterSet.iterator().next();
            for(int i = 0; i<charArray.length; i++) {
                if(charArray[i] == next)
                    return i;
            }
        }
        return - 1;
    }

    private static void findUniqueCharacter(String str) {
        char[] charArray = str.toCharArray();
        PriorityQueue<Integer> characterQueue = new PriorityQueue<>();
        characterQueue.add(1);
        for (int i = 0; i < charArray.length; i++) {
        }
    }

    public static void main (String[] args) {
        System.out.println("Find Unique Character");
        String str = "abcabcx";
//        int index =  findUnique(str);
        int index = findUniqueChar(str);
        System.out.println(index);

    }
}
