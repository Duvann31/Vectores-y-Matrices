import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantest=0, cantmat=0;
        double suma=0, sumaest=0, sumamat=0, prom=0,promest=0, prommat=0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes y que desea ingresar");
        cantest= lector.nextInt();
        System.out.println("Ingrese la cantidad de materias y que desea ingresar");
        cantmat= lector.nextInt();
        double[][] notas = new double[cantest][cantmat];
        for(int i=0; i<cantest; i++){
            for(int j=0;j<cantmat;j++){
                System.out.println("Ingrese las notas del estudiante: "+(i+1)+"de la materia: "+(j+1));
                double nota=lector.nextDouble();
                if(nota<0||nota>5){
                    System.out.println("Las notas no son validas");
                    break;
                }
                notas[i][j]=nota;
            }
        }
        for(int i=0;i<cantest;i++){
            for(int j=0;j<cantmat;j++){
                System.out.println("Las notas fueron: "+" estduiante: " +i+ "\t"+" nota: "+j );
            }
        }
        System.out.println("El promedio por estudiante es: ");
        for(int i=0;i<cantest;i++){
            for(int j=0;j<cantmat;j++){
                sumaest=+notas[i][j];
            }
        promest=sumaest/cantmat;
        suma=+sumaest;
        System.out.println("Estudiante: " + (i+1)+" es : " + promest);
        }
        System.out.println("El promedio por materia es: ");
        for(int j=0;j<cantmat;j++){
            for(int i=0;i<cantest;i++){
                sumamat=+notas[i][j];
            }
            prommat=sumamat/cantest;
            suma+=sumamat;
            System.out.println("Materia: " + (j+1)+" es : " + prommat);
        }
        prom=suma/(sumaest*sumamat);
        System.out.println("El promedio general es: "+prom);
    }
}