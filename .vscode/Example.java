public class Example {
    public static void main(String[] args) {
        // Example character array
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

        // Call the Try method with the initial values
        Try(charArray, 0);

        // Print the final result
        System.out.println("After swapping: " + new String(charArray));
    }

    // Recursive method
    static void Try(char ch[], int x) {
        System.out.println(ch);

        if (x < ch.length / 2) {
            char temp = ch[x];
            ch[x] = ch[ch.length - x - 1];
            ch[ch.length - x - 1] = temp;

            // Recursive call with incremented x
            Try(ch, x + 1);
        }
    }
}
