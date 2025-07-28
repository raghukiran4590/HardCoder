package interviewpractice;

public class ReverseNumber {
    private static int reverseNum(int n) {
        String str = "";
        while(n/10 > 0) {
            int rev = n%10;
            str+=rev;
            n = n/10;
        }
        str+=n;
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        int num = 12345;
        int result = reverseNum(num);
        System.out.println(result);

    }
}

