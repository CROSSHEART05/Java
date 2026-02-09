class DeciOct {
    public int n;
    public int Oct;

    DeciOct() {
        n = 0;
        Oct = 0;
    }

    void getnum(int nn) {
        n = nn;
    }

    void deci_oct() {
        int t = n;
        int r = 0;
        int s;
        while (t != 0) {
            s = t % 8;
            r = 10 * r + s;
        }
        Oct = 0;
        while (r != 0) {
            int p = r % 10;
            Oct = 10 * Oct + p;
            r = r / 10;
        }
    }

    void show() {
        System.out.println(" The decimal number is " + n);
        System.out.println("The octal of " + n + " is" + Oct);
    }
}