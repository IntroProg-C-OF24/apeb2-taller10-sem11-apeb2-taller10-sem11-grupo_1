import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomProd = new ArrayList<>();
        ArrayList<ArrayList<Double>> producto = new ArrayList<>();
        ArrayList<Double> carac = new ArrayList<>();
        int op = 0, posicion=0, fila = 1, colum = 2;
        boolean condicion = false;
        do {
            System.out.println("Seleccione opcion | 1. Agregar | 2. Actualizar existencias | 3. Buscar producto | 4. Eliminar producto | 5. Mostrar productos | 6. Salir");
            op= sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("====== Agregar ======");
                    System.out.println("Igrese el nombre del producto");
                    String nombre = sc.next();
                    nomProd.add(nombre);
                    for (int i = 0; i < fila; i++) {
                        carac = new ArrayList<>();
                        for (int j = 0; j < colum; j++) {
                            System.out.println("Ingrese el precio y Cantidad");
                            double dato = sc.nextDouble();
                            carac.add(dato); 
                        }
                        producto.add(carac);
                    }
                break;
                case 2:
                    if (nomProd.isEmpty()) {
                        System.out.println("Aun no existen existencias");
                    }else{
                        System.out.println("====== Acutualizar Existencias ======");
                        System.out.println("//-Lista de Productos-//");
                        for(int i = 0 ; i < nomProd.size() ; i++ ){
                            System.out.println((i + 1) + ". Nombre: " + nomProd.get(i) + " $" + producto.get(i).get(0) + " Cantidad:" + producto.get(i).get(1));
                        }
                        do {
                            System.out.println("Seleccione La posicion del producto");
                            posicion = sc.nextInt();
                            if ((posicion-1)>= nomProd.size()) {
                                System.out.println("Posicion incorrecta, vuelva a introducir");
                                condicion = true;
                            }else{
                                System.out.println("Ingrese el Nombre de la nueva existencia");
                                nomProd.set(posicion-1, sc.next());
                                System.out.println("Ingrese el Precio de la nueva existencia");
                                double dato = sc.nextDouble();
                                producto.get(posicion-1).set(0, dato);
                                System.out.println("Ingrese el Cantidad de la nueva existencia");
                                dato = sc.nextDouble();
                                producto.get(posicion-1).set(1, dato);
                                condicion = false;
                            }
                        } while (condicion);
                    }
                break;
                case 3:
                    if (nomProd.isEmpty()) {
                        System.out.println("Aun no existen existencias");
                    }else{
                        System.out.println("====== Buscar Producto ======");
                        do {
                            System.out.println("Ingrese la posicion del producto");
                            posicion = sc.nextInt();
                         if ((posicion-1)>= nomProd.size()) {
                                System.out.println("Posicion incorrecta, vuelva a introducir");
                                condicion = true;
                            }else{
                                System.out.println(posicion + ". Nombre: " + nomProd.get(posicion-1) + " $" + producto.get(posicion-1).get(0) + " Cantidad: " + producto.get(posicion-1).get(1));
                                break;
                            }
                        } while (condicion);
                    }
                break;
                case 4:
                    if (nomProd.isEmpty()) {
                        System.out.println("Aun no existen existencias");
                    }else{
                        System.out.println("====== Eliminar Producto ======");
                        System.out.println("//-Lista de Productos-//");
                        for(int i = 0 ; i < nomProd.size() ; i++ ){
                            System.out.println((i + 1) + ". Nombre: " + nomProd.get(i) + " $" + producto.get(i).get(0) + " Cantidad:" + producto.get(i).get(1));
                        }
                        do {
                            System.out.println("Ingrese la posicion del producto a eliminar");
                            posicion = sc.nextInt();
                            if ((posicion-1)>= nomProd.size()) {
                                System.out.println("Posicion incorrecta, vuelva a introducir");
                                condicion = true;
                            }else{
                                do {
                                    System.out.println("Seguro que quieres eliminar el produto: " + nomProd.get(posicion-1) + " 1. Si  | 2. No");
                                    int eliminar = sc.nextInt();
                                    if (eliminar==1) {
                                        nomProd.remove(posicion-1);
                                        producto.remove(posicion-1);
                                        break;
                                    }else if (eliminar==2) {
                                        System.out.println("No se borrara el producto");
                                        break;
                                    }else{
                                        System.out.println("Seleccion Incorrecta, Seleccione nuevamente");
                                        condicion = true;
                                    }
                                } while (condicion);
                                condicion = false;
                            }
                        } while (condicion);
                    }
                break;
                case 5:
                    if (nomProd.isEmpty()) {
                        System.out.println("Aun no existen existencias");
                    }else{
                        System.out.println("//-Lista de Productos-//");
                        for(int i = 0 ; i < nomProd.size() ; i++ ){
                            System.out.println((i + 1) + ". Nombre: " + nomProd.get(i) + " $" + producto.get(i).get(0) + " Cantidad:" + producto.get(i).get(1));
                        }
                            
                    }
                break;
            }
        } while (op!=6);
        sc.close();
    } 
}
