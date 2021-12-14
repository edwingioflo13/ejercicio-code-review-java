public class Utilitarios {
    
    //Se esta usando español
    public int calcularPromedio(int params[]) {
        int avg = 0;
        for (int i = 0; i < params.length; i++) {
            avg = avg + params[i];
        }
        return avg / params.length;
    }

    //Renombrar el metodo
    public double calcularFactorial(int numero) {
        double resultado = 1;
        if (numero == 1 || numero == 0) {
            return resultado;
        }
        for (int i = 2; i <= numero; i++) {
            resultado = resultado * i;

        }
        return resultado;
    }

    //Renombrar el metodo
    public double calcularAreaCirculo(double r) {
        final double PI = 22 / 7;
        return PI * (r * r);
    }

    //b = base ; h= altura
    //Renombrar el metodo
    public double calcularAreaTriangulo(double b, double h) {
        double resultado = 0d;
        resultado = (b * h) / 2;
        return resultado;
    }

    //Renombrar el metodo
    public double calcularIva(double valor) {
        final int IVA = 12;
        return (valor * IVA) / 100;
    }


}
