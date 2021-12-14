/**
 * Clase que representa una calculadora con las 4 operaciones básicas de dos números
 */
public class Calculadora {

    //colocar el nombre correcto del metodo
    public int sumar(int num1, int num2) {
        //metodo para crear una suma
        //Se puede retornar directamente el resultado
        return num1 + num2;
    }

    //colocar el nombre correcto del metodo
    public int restar(int num1, int num2) {
        //metodo para crear la resta
        //Se puede retornar directamente el resultado
        return num1 - num2;
    }

    //colocar el nombre correcto del metodo
    public int multiplicar(int num1, int num2) {
        //metodo para crear la multiplicacion
        //Se puede retornar directamente el resultado
        return num1 * num2;
    }
    //colocar el nombre correcto del metodo
    public double dividir(int num1, int num2) {
        //metodo para la division
        //double es para un valor con punto decimal
        //Se deberia validar el caso en que num2 sea cero, se pueda usar excepciones
        double resul = 0;
        resul = num1 / num2;
        return resul;
    }


}
