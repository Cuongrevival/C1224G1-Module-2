package Randomnumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int size = sc.nextInt();
        System.out.println("Enter the maximum number of items in the list");
        int max = sc.nextInt();
        System.out.println("Enter the minimum number of items in the list");
        int min = sc.nextInt();
        Client client = new Client();
        client.printList(min, max, size);
    }
}
