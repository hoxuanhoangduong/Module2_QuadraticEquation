import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter b : ");
        double b = scanner.nextDouble();
        System.out.println("Enter C : ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        System.out.println("Your Quadratic Equation : " + quadraticEquation.display());
        System.out.println("Delta is : "+ quadraticEquation.getDiscriminant());
        System.out.println(quadraticEquation.result());
    }
}
