public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Recursividad rec = new Recursividad();
        int recursivoResult = rec.factorial(5);
        System.out.println("El resultado es: " + recursivoResult);
        System.out.println(" ");
        System.out.println("******************************************");
        System.out.println(" ");
        
        int sumaConsecutivosResult = rec.sumaConsecutivos(5);
        System.out.println("La suma de los números consecutivos es: " + sumaConsecutivosResult);
        System.out.println(" ");
        System.out.println("******************************************");
        System.out.println(" ");

        int potenciaResult = rec.potencia(5, 0);
        System.out.println("El resultado de la potencia es: " + potenciaResult);
        System.out.println(" ");
        System.out.println("******************************************");
        System.out.println(" ");

        int sumaDigitosResult = rec.sumaDigitos(456);
        System.out.println("La suma de los dígitos es: " + sumaDigitosResult);
        System.out.println(" ");
        System.out.println("******************************************");
        System.out.println(" ");
        
        int contarDigitosResult = rec.contarDigitos(1234);
        System.out.println("El número de dígitos es: " + contarDigitosResult);
        System.out.println(" ");
        System.out.println("******************************************");
        System.out.println(" ");
        
        int fibonacciResult = rec.fibonacci(9);
        System.out.println("El resultado de la serie de Fibonacci es: " + fibonacciResult);
        System.out.println(" ");
        System.out.println("******************************************");
        System.out.println(" ");

        RenombrarDirectorios rd = new RenombrarDirectorios();
        rd.RenombrarDirectorios("src/directorios/carpeta1");
    }
}
