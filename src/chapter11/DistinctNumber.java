package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0): ");
        int value;
        do {
            value = scanner.nextInt();
            if(!list.contains(value) && value!=0)
                list.add(value);
        }
        while (value!=0);
        for(int i= 0; i <list.size();i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }
}
