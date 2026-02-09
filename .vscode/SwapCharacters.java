public class SwapCharacters {
    public static void main(String[] args) {
        // Part (a)
        char[] chArray = { 'P', 'L', 'A', 'Y' };
        Try(chArray, 1);

        // Part (b)
        Try1("SKY");
    }

    // Part (a)
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

    // Part (b)
    static void Try1(String n) {
        char c[] = new char[n.length()];
        for (int i = 0; i < c.length; i++)
            c[i] = n.charAt(i);

        Try(c, 0);
    }
}
// SwapCharacters