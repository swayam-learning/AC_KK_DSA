package DSA_Basics;

import java.util.Scanner;

public class Complexity {
    public static void main(String[] args) {
        // time complexity is the relation between input size and running time (operations)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println("Hello world");

        }// linear time complexity---->O(n)
        // space complexity---->constant O(1)
    }//best case---->omega(n)
    // average case---->theta(n)
    //worst case---->O(n)
}
