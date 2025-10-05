import java.util.Scanner;

public class Array {
    int[] A;
    int len;
    Array(int length) {
        len = length;  
        A = new int[len];
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in array:");
        for (int i = 0; i < len; i++) {
            A[i] = sc.nextInt();
        }
    }

    public void findEquilibrium() {
        int totalSum = 0;
        for (int i = 0; i < len; i++) {
            totalSum += A[i];
        }

        int leftSum = 0;
        boolean found = false;

        System.out.println("The equilibrium indices are:");
        for (int i = 0; i < len; i++) {
            int rightSum = totalSum - leftSum - A[i];
            if (leftSum == rightSum) {
                System.out.print(i + "\t");
                found = true;
            }
            leftSum += A[i];
        }

        if (!found) {
            System.out.print("NIL");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int len = sc.nextInt();
        if (len <= 0) {
            System.out.println("Invalid array length");
            System.exit(0);
        }
        Array a = new Array(len);
        a.input();
        a.findEquilibrium();

        sc.close();
    }
}
