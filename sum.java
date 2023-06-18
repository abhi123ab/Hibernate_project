import java.util.Scanner;

class sum {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int n, i, sum = 0;
        System.out.println("Enter elements ");
        n = sc.nextInt();
        i = sc.nextInt();
        sum = n + i;
        System.out.println("Sum of n " + n + " And i " + i + " is:-" + sum);

    }
}
