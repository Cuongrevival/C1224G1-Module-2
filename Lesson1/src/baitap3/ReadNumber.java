package baitap3;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = num % 100 / 10;
        int c = num % 10;
        String read;
        String read2 = "";
        String read3;
        switch (c) {
            case 1:
                read = "one";
                break;
            case 2:
                read = "two";
                break;
            case 3:
                read = "three";
                break;
            case 4:
                read = "four";
                break;
            case 5:
                read = "five";
                break;
            case 6:
                read = "six";
                break;
            case 7:
                read = "seven";
                break;
            case 8:
                read = "eight";
                break;
            case 9:
                read = "nine";
                break;
            default:
                read = "";
                break;
        }
        switch (b) {
            case 1:
                switch (c) {
                    case 0:
                        read2 = "ten";
                        break;
                    case 1:
                        read2 = "eleven";
                        break;
                    case 2:
                        read2 = "twelve";
                        break;
                    case 3:
                        read2 = "thirteen";
                        break;
                    case 4:
                        read2 = "fourteen";
                        break;
                    case 5:
                        read2 = "fifteen";
                        break;
                    case 6:
                        read2 = "sixteen";
                        break;
                    case 7:
                        read2 = "seventeen";
                        break;
                    case 8:
                        read2 = "eighteen";
                        break;
                    case 9:
                        read2 = "nineteen";
                        break;
                }
                break;
            case 2:
                read2 = "twenty";
                break;
            case 3:
                read2 = "thirty";
                break;
            case 4:
                read2 = "forty";
                break;
            case 5:
                read2 = "fifty";
                break;
            case 6:
                read2 = "sixty";
                break;
            case 7:
                read2 = "seventy";
                break;
            case 8:
                read2 = "eighty";
                break;
            case 9:
                read2 = "ninety";
                break;
            default:
                read2 = "";
                break;
        }
        switch (a) {
            case 1:
                read3 = "one";
                break;
            case 2:
                read3 = "two";
                break;
            case 3:
                read3 = "three";
                break;
            case 4:
                read3 = "four";
                break;
            case 5:
                read3 = "five";
                break;
            case 6:
                read3 = "six";
                break;
            case 7:
                read3 = "seven";
                break;
            case 8:
                read3 = "eight";
                break;
            case 9:
                read3 = "nine";
                break;
            default:
                read3 = "";
                break;
        }
        if (a == 0) {
            if (b == 0) {
                System.out.println(read);
            } else if (b == 1) {
                System.out.println(read2);
            } else {
                System.out.println(read2 + " " + read);
            }
        } else if (b == 0 && c == 0) {
            System.out.println(read3 + " hundred");
        } else if (b == 0 && c != 0) {
            System.out.println(read3 + " hundred and " + read);
        } else if (b == 1) {
            System.out.println(read3 + " hundred and " + read2);
        } else {
            System.out.println(read3 + " hundred and " + read2 + " " + read);
        }
    }
}