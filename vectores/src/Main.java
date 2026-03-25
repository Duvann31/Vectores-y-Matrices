import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantest, aprob = 0, rep = 0;
        double suma = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes");
        cantest = lector.nextInt();
        double[] notas = new double[cantest];
        double may = 0, men=5;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota del estudiante " + (i + 1));
            double nota = lector.nextDouble();
            if (nota < 0 || nota > 5) {
                System.out.println("Nota inválida");
            }
            notas[i] = nota;
            suma += nota;
            if (nota > may) {
                may = nota;
            }
            if (nota < men) {
                men = nota;
            }
            if (nota >= 3.0) {
                aprob++;
            }
            if (nota < 3.0) {
                rep++;
            }
        }
        double promedio = suma / cantest;
        System.out.println("Resultados:");
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mayor: " + may);
        System.out.println("Nota menor: " + men);
        System.out.println("Aprobados: " + aprob);
        System.out.println("Reprobados: " + rep);
    }
}
