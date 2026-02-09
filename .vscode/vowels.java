import java.util.*;

class swap {
    public static boolean isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel." + ch);
        } else {
            System.out.println(ch + " is not a vowel." + ch);
        }
        sc.close();
    }
}