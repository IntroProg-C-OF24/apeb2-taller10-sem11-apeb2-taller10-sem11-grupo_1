import java.util.Random;
public class Ejercicio1 {
    public static void main(String[] args) {
        String estudiantes[] = {"Alberto", "Andrés", "Antonio", "Armando", "Arturo","Benjamín", "Bernardo", "Carlos", "César", "Cristián","Daniel", "David", "Diego", "Eduardo", "Emilio","Enrique", "Ernesto", "Esteban", "Felipe", "Fernando","Francisco", "Gabriel", "Germán", "Gilberto", "Guillermo","Hernán", "Homero", "Horacio", "Ignacio", "Isaac","Jaime", "Javier", "Jerónimo", "Jesús", "Joaquín","Jorge", "José", "Juan", "Lorenzo", "Luis", "Manuel","Marcelo", "Marco", "Mariano", "Mario", "Mauricio","Miguel", "Nicolás", "Octavio", "Óscar", "Pablo","Patricio", "Pedro", "Rafael", "Ramiro", "Ramón","Ricardo", "Roberto", "Rodrigo", "Rubén", "Salvador","Samuel", "Sancho", "Santiago", "Sergio", "Tomas","Valentín", "Vicente", "Víctor", "Víctor Hugo", "Víctor Manuel","Víctor Hugo de Andrade y Victorino"}, mejorEst = " ", peorEst = " ";
        int limNotas = 3;
        double notasBimestre[][] = new double[estudiantes.length][limNotas], promeCurso = 0, mejorCal = 0, peorCal=10, total[] = new double[estudiantes.length];
        Random rand = new Random();
        for(int i = 0; i < notasBimestre.length ; i++){
            for(int j = 0 ; j < notasBimestre[i].length ; j++){
                notasBimestre[i][j] = rand.nextDouble() * 10;
                if (j<2) {
                    notasBimestre[i][j] *= 0.35;
                }else{
                    notasBimestre[i][j] *= 0.3;
                }
            }
            total[i]= notasBimestre[i][0] + notasBimestre[i][1] + notasBimestre[i][2];
            promeCurso += total[i];
        }
        promeCurso= promeCurso / estudiantes.length;
        System.out.println("=======INFORME DE ESTUDIANTES DEL PARALELO C=======");
        System.out.println("==============================");
        System.out.println("Promedio del paralelo C: " + promeCurso);
        System.out.println("========================================================================");
        System.out.println("==Listado de estudiantes con su nota por encima del promedio del curso==");
        System.out.println("ESTUDIANTE  |    ACD      |    APE      |   AA     |   total");
        for(int i = 0 ; i < total.length ; i++){
                if (total[i] >= promeCurso) {
                    System.out.println(estudiantes[i] + " | " + notasBimestre[i][0]  + " | " + notasBimestre[i][1] + " | " + notasBimestre[i][2] + " | " + total[i]);
                    if (total[i] > mejorCal) {
                        mejorEst = estudiantes[i];
                        mejorCal = total[i];
                    }
                }
        }
        System.out.println("==============================================================");
        System.out.println("==Listado de estudiantes con su nota por debajo del promedio==");
        System.out.println("ESTUDIANTE  |    ACD      |    APE      |   AA     |   total");
        for(int i = 0 ; i < total.length ; i++){
            if (total[i] < promeCurso) {
                System.out.println(estudiantes[i] + " | " + notasBimestre[i][0]  + " | " + notasBimestre[i][1] + " | " + notasBimestre[i][2] + " | " + total[i]);
                if (total[i] < peorCal) {
                    peorEst = estudiantes[i];
                    peorCal = total[i];
                }
            }
        }
        System.out.println("========================================");
        System.out.println("==Estudiante con la mejor calificación==");
        System.out.println("Estudiante      |         Nota");
        System.out.println(mejorEst + "  " + mejorCal);
        System.out.println("===========================================");
        System.out.println("==Estudiante con la calificación mas baja==");
        System.out.println("Estudiante      |         Nota");
        System.out.println(peorEst + "  " + peorCal);
    }
}