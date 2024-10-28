public class Recursividad {
    public int factorial(int n) {
        System.out.println("Calculando el factorial de " + n);
        //caso base: 0! y 1! 
        if (n == 0 || n == 1) {
            System.out.println("Caso base alcanzado el factorial de " + n + " es 1");
            return 1;
        } 
        int resultado= n * factorial(n - 1);
        System.out.println("Resultado parcial para"+ n +" * factorial("+ (n-1) +") = " + resultado);
        return resultado;
    }
    //Calcular la suma de los numeros consecutivos 
    //n = 5 resultado = 5+4+3+2+1 = 15
    public int sumaConsecutivos(int n) {
        System.out.println("Calculando la suma de los numeros consecutivos hasta " + n);
        if (n == 1) {
            System.out.println("Caso base alcanzado la suma de los numeros consecutivos hasta " + n + " es 1");
            return 1;
        }
        return n + sumaConsecutivos(n - 1);
    }
    //Calcula la potencia de un numero 
    public int potencia(int base, int exponente) {
        System.out.println("Calculando la potencia de " + base + " elevado a " + exponente);
        if (exponente == 0) {
            System.out.println("Caso base alcanzado la potencia de " + base + " elevado a " + exponente + " es 1");
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }
    //Crear un metodo que sume los digitos de un numero
    //si mando 456 sea igual a 15
    //4 + 5 + 6 = 15
    public int sumaDigitos(int numero) {
        System.out.println("Calculando la suma de los digitos de " + numero);
        if (numero == 0) {
            System.out.println("Caso base alcanzado la suma de los digitos de " + numero + " es 0");
            return 0;
        }
        return numero % 10 + sumaDigitos(numero / 10);
    }
}
