public class CalcularTriangulo {
    public double lA;
    public double lB;
    public double lC;

    public double Area()
    {
        double valor = (lA+lB+lC)/2;
        double area= Math.sqrt(valor*(valor-lA)* (valor-lB)*(valor-lC));
        return area;
    }
    public double Perimetro()
    {
        return (lA + lB+lC);
    }
}
