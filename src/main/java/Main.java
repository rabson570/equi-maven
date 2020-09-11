import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the hight of triangle: ");
        int a = input.nextInt();
        for (int i=1;i<=a;i++){
            for (int j=1;j<=(a-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(i*2-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

