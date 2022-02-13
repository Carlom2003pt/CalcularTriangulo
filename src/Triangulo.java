import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalcularTriangulo t1, t2, t3;
        t1 = new CalcularTriangulo();
        t2 = new CalcularTriangulo();
        t3 = new CalcularTriangulo();

        System.out.println("1º Triângulo: ");
        System.out.println("Lado A: ");
        t1.lA=sc.nextDouble();
        System.out.println("Lado B: ");
        t1.lB=sc.nextDouble();
        System.out.println("Lado C: ");
        t1.lC=sc.nextDouble();

        System.out.printf("Area do 1ºtriangulo: %.2f%n",t1.Area());
        System.out.printf("Perimetro do 1ºtriangulo: %.2f%n",t1.Perimetro());

        System.out.println("2º Triângulo: ");
        System.out.println("Lado A: ");
        t2.lA=sc.nextDouble();
        System.out.println("Lado B: ");
        t2.lB=sc.nextDouble();
        System.out.println("Lado C: ");
        t2.lC=sc.nextDouble();

        System.out.printf("Area do 2ºtriangulo: %.2f%n",t2.Area());
        System.out.printf("Perimetro do 2ºtriangulo: %.2f%n",t2.Perimetro());

        System.out.println("3º Triângulo: ");
        System.out.println("Lado A: ");
        t3.lA=sc.nextDouble();
        System.out.println("Lado B: ");
        t3.lB=sc.nextDouble();
        System.out.println("Lado C: ");
        t3.lC=sc.nextDouble();

        System.out.printf("Area do 3ºtriangulo: %.2f%n",t3.Area());
        System.out.printf("Perimetro do 3ºtriangulo: %.2f%n",t3.Perimetro());
    }
}
