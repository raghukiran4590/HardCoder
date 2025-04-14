package dsa;

import java.util.*;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] intArr = new int[]{2,1,1,2,3,3};
        List<Integer> integerList = new ArrayList<>();
        String resultString = "";
        for(int n: intArr) {
            integerList.add(n);
        }
        if(intArr.length < 4) {
            System.out.println(integerList);
        } else {
             integerList.removeAll(findPairs(intArr));
            for (int i :integerList) {
                resultString = resultString + i + ",";
            }
        }
        System.out.println(resultString.substring(0,resultString.length()-1));
    }

    private static Set<Integer> findPairs(int[] intArr) {
//        int[] intArr = new int[]{2,1,1,2,3,3};
        int i = 0;
        int j = 2;
        int k = 3;
        int counter = 0;
        boolean foundPair = false;
        Set<Integer> matchingPairSet = new HashSet<>();

        while(i <= intArr.length -4) {
            while ((k < intArr.length) && (i <= k - 3)) {
                if (intArr[i] == intArr[k] && intArr[i + 1] == intArr[j]) {
                    foundPair = true;
                    matchingPairSet.add(intArr[k]);
                    matchingPairSet.add(intArr[j]);
                } else {
                    foundPair = false;
                }
                if(foundPair) {
                    counter++;
                    i = k + 1;
                    k = k + 2;
                    j = k - 1;
                    break;
                } else {
                    k = k + 2;
                    j = k - 1;
                }
            }
        }
        return matchingPairSet;
    }
}
