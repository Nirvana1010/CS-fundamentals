// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static int isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return i;
        }
        return -1;
    }

    public static boolean isPerfect(int n) {
        int[] factors = new int[(int)Math.sqrt(n) + 1];
        int cnt = 0;
        for (int i = 1; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                factors[cnt] = i;
                cnt++;
            }
        }
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += factors[i];
        }
        return sum == n;
    }

    public static void main(String[] args) {
//        // Week 1
//        double f;
//        double c;
//        Scanner in = new Scanner(System.in);
//        f = in.nextInt();
//        c = (f - 32) * 5 / 9;
//        System.out.println((int)c);

//        // Week 2 - 1
//        Scanner in = new Scanner(System.in);
//        int BJT = in.nextInt();
//        String BJT_str = String.format("%04d", BJT);
//        int hour = Integer.parseInt(BJT_str.substring(0, 2));
//        int min = Integer.parseInt(BJT_str.substring(2, 4));
//        if (hour >= 8) {
//            hour -= 8;
//        } else {
//            hour = hour + 24 - 8;
//        }
//        String UTC_hour_str = String.format("%02d", hour);
//        String UTC_min_str = String.format("%02d", min);
//        System.out.println(Integer.parseInt(UTC_hour_str + UTC_min_str));

//        // Week 2 - 2
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int readability = num / 10;
//        String readability_str = "";
//
//        num %= 10;
//        int strength = num;
//        String strength_str = "";
//
//        switch (readability) {
//            case 1:
//                readability_str = "Unreadable";
//                break;
//            case 2:
//                readability_str = "Barely readable, occasional words distinguishable";
//                break;
//            case 3:
//                readability_str = "Readable with considerable difficulty";
//                break;
//            case 4:
//                readability_str = "Readable with practically no difficulty";
//                break;
//            case 5:
//                readability_str = "Perfectly readable";
//                break;
//        }
//
//        switch (strength) {
//            case 1:
//                strength_str = "Faint signals, barely perceptible";
//                break;
//            case 2:
//                strength_str = "Very weak signals";
//                break;
//            case 3:
//                strength_str = "Weak signals";
//                break;
//            case 4:
//                strength_str = "Fair signals";
//                break;
//            case 5:
//                strength_str = "Fairly good signals";
//                break;
//            case 6:
//                strength_str = "Good signals";
//                break;
//            case 7:
//                strength_str = "Moderately strong signals";
//                break;
//            case 8:
//                strength_str = "Strong signals";
//                break;
//            case 9:
//                strength_str = "Extremely strong signals";
//                break;
//        }
//        System.out.println(strength_str + ", " + readability_str.toLowerCase() + ".");

//        // Week 3 - 1
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int even = 0;
//        int odd = 0;
//        while (num != -1) {
//            if (num % 2 == 0) {
//                even += 1;
//            } else {
//                odd += 1;
//            }
//            num = in.nextInt();
//        }
//        System.out.println(odd + " " + even);

//        // Week 3 - 2
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        int count = 1;
//        int digit;
//        String bin = "";
//
//        String num_str = String.valueOf(num);
//
//        for (int i = num_str.length(); i > 0; i--) {
//            digit = Integer.parseInt(num_str.substring(i-1, i));
//            if (digit % 2 == 0 && count % 2 == 0 || digit % 2 != 0 && count % 2 != 0) {
//                bin += "1";
//            } else {
//                bin += "0";
//            }
//            count += 1;
//        }
//        System.out.println(bin);
//        int result = 0;
//        int factor = 1;
//        for (int i = 0; i < bin.length(); i++) {
//            char bin_digit = bin.charAt(i);
//            result += Integer.parseInt(String.valueOf(bin_digit)) * factor;
//            factor *= 2;
//        }
//        System.out.println(result);

//        // Week 4 - 1
//        Scanner in = new Scanner(System.in);
//        int left = in.nextInt();
//        int right = in.nextInt();
//        // Get primes numbers < 200
//        int[] numbers = new int[200];
//        int[] primes = new int[200];
//        int cnt = 0;
//        for(int i = 2; i < numbers.length; i++) {
//            for(int j = 2; j <= i; j++) {
//                if(i % j == 0 && i != j) {
//                    break;
//                }
//                if(i == j) {
//                    primes[cnt] = j;
//                    cnt += 1;
//                }
//            }
//        }
////        System.out.println(Arrays.toString(primes));
//        int result = 0;
//        for(int i = left-1; i < right; i++) {
//            result += primes[i];
//        }
//        System.out.println(result);

//        // Week 4 - 2
//        Scanner in = new Scanner(System.in);
//        int input = in.nextInt();
//        String input_str = String.valueOf(input);
//        for(int i = 0; i < input_str.length(); i++) {
//            switch (input_str.charAt(i)) {
//                case '-' -> System.out.print("fu ");
//                case '0' -> System.out.print("ling ");
//                case '1' -> System.out.print("yi ");
//                case '2' -> System.out.print("er ");
//                case '3' -> System.out.print("san ");
//                case '4' -> System.out.print("si ");
//                case '5' -> System.out.print("wu ");
//                case '6' -> System.out.print("liu ");
//                case '7' -> System.out.print("qi ");
//                case '8' -> System.out.print("ba ");
//                case '9' -> System.out.print("jiu ");
//            }
//        }

//        //Week 5
//        Scanner in = new Scanner(System.in);
//        int[] exponents = new int[100];
//        int[] factors = new int[100];
//        int i = 0;
//        int max_exp = 0;
//        while(true) {
//            int exponent = in.nextInt();
//            int factor = in.nextInt();
//            exponents[i] = exponent;
//            factors[i] = factor;
//            max_exp = Math.max(exponent, max_exp);
//            i++;
//            if (exponent == 0) {
//                break;
//            }
//        }
//        while(true) {
//            int exponent = in.nextInt();
//            int factor = in.nextInt();
//            exponents[i] = exponent;
//            factors[i] = factor;
//            max_exp = Math.max(exponent, max_exp);
//            i++;
//            if(exponent == 0) {
//                break;
//            }
//        }
//        int[] result = new int[max_exp + 1];
//        for(int j = 0; j < exponents.length; j++) {
//            result[exponents[j]] += factors[j];
//        }
//        for(int j = result.length - 1; j > 0; j--) {
//            if(result[j] == 0)
//                continue;
//            if(j == 1) {
//                System.out.print(String.valueOf(result[j]) + 'x' + '+');
//            } else {
//                System.out.print(String.valueOf(result[j]) + 'x' + j + '+');
//            }
//        }
//        System.out.print(result[0]);

//        // Week 6 - 1
//        Scanner in = new Scanner(System.in);
//        String sentence = in.nextLine();
//        String[] words = sentence.split(" ");
//        for(int i = 0; i < words.length - 1; i++) {
//            System.out.print(words[i].length());
//            System.out.print(' ');
//        }
//        System.out.print(words[words.length - 1].length() - 1);

//        // Week 6 - 2
//        Scanner in = new Scanner(System.in);
//        String result = "";
//        while (true) {
//            String sentence = in.nextLine();
//            if (sentence.equals("END"))
//                break;
//            String[] words = sentence.split(",");
//            if (!words[0].equals("$GPRMC"))
//                continue;
//            if (words[2].equals("V"))
//                continue;
//            int idx1 = sentence.indexOf('$');
//            int idx2 = sentence.indexOf('*');
//            int check = sentence.charAt(idx1 + 1);
//            for (int i = idx1 + 2; i < idx2; i++) {
//                check ^= sentence.charAt(i);
//            }
//            check %= 65535;
//            if(!Integer.toHexString(check).equals(sentence.substring(idx2 + 1)))
//                continue;
//            int hour = Integer.parseInt(words[1].substring(0, 2)) + 8;
//            String min = words[1].substring(2, 4);
//            String sec = words[1].substring(4, 6);
//            result = String.format("%02d", hour) + ':' + min + ':' + sec;
//        }
//        System.out.println(result);

//        // Week 7 - 1
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        System.out.print(String.valueOf(num) + '=');
//        while(true) {
//            int factor = isPrime(num);
//            if (factor != -1) {
//                System.out.print(String.valueOf(factor) + 'x');
//                num /= factor;
//            } else {
//                System.out.print(num);
//                break;
//            }
//        }

        // Week 7 -2
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int cnt = 0;
        for (int i = n; i < m + 1; i++) {
            if (isPerfect(i)) {
                if (cnt == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
                cnt += 1;
            }
        }
    }

}
