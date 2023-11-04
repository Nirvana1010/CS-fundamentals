import java.util.Scanner;

class Fraction {
    int numerator;
    int denominator;
    Fraction(int a, int b) {
        numerator = a;
        denominator = b;
    }

    int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }

    double toDouble() {
        return (double) numerator / denominator;
    }

    Fraction plus(Fraction r) {
        int new_denom = denominator * r.getDenominator();
        int new_num = numerator * r.getDenominator() + r.getNumerator() * denominator;
        Fraction newF = simplify(new_num, new_denom);
        return newF;
    }

    Fraction multiply(Fraction r) {
        int new_denom = denominator * r.getDenominator();
        int new_num = numerator * r.getNumerator();
        Fraction newF = simplify(new_num, new_denom);
        return newF;
    }

    void print() {
        if (numerator == denominator) {
            System.out.println('1');
        } else {
            Fraction newF = simplify(numerator, denominator);
            System.out.println(newF.numerator + "/" + newF.denominator);
        }
    }

    Fraction simplify(int num, int denom) {
        int gcd = getGCD(num, denom);
        num /= gcd;
        denom /= gcd;
        return new Fraction(num, denom);
    }

    private int getGCD(int m, int n) {
        for (int x = m; x >= 1; x--) {
            if (m % x == 0 && n % x == 0) {
                return x;
            }
        }
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }
}