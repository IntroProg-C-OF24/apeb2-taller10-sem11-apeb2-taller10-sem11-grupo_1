import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0, codigo;
        ArrayList<String> carrito = new ArrayList<>();
        ArrayList<Double> aux;
        ArrayList<ArrayList<Double>> precios = new ArrayList<>();
        String nomprod[] = { "Carro de Juguete", "Muñeco de Tela", "Conjunto de Construcción", "Figuras de Acción","Rompecabezas", "Bicicleta de Juego" };
        double producto[][] = { { 20, 100 }, { 15, 150 }, { 12, 80 }, { 10, 120 }, { 8, 70 }, { 30, 50 } },subTotal = 0, iva = 0.12, descuento = 0.2, total = 0, subIVA = 0,cantidad;
        System.out.println("TIENDA DE JUGUETES ");
        do {
            System.out.println("===PRODUCTOS===");
            for (int i = 0; i < nomprod.length; i++) {
                System.out.println((i + 1) + " " + nomprod[i] + "  $" + producto[i][0] + " - " + producto[i][1]);
            }
            System.out.println("Insete el codigo del producto");
            codigo = sc.nextInt();
            if (codigo > 0 & codigo <= nomprod.length) {
                codigo--;
                if (producto[codigo][1] > 0) {
                    System.out.println("Cuantos " + nomprod[codigo] + " desea llevar");
                    cantidad = sc.nextDouble();
                    if ((producto[codigo][1]-cantidad)>= 0) {
                        aux = new ArrayList<>();
                        aux.add(producto[codigo][0]);
                        aux.add(cantidad);
                        precios.add(aux);
                        carrito.add(nomprod[codigo]);
                        producto[codigo][1] -= cantidad;
                        subTotal += (cantidad * producto[codigo][0]);
                    } else {
                        aux = new ArrayList<>();
                        aux.add(producto[codigo][0]);
                        aux.add(producto[codigo][1]);
                        carrito.add(nomprod[codigo]);
                        precios.add(aux);
                        subTotal +=(producto[codigo][0] * producto[codigo][1]);
                        producto[codigo][1] = 0;
                    }
                } else {
                    System.out.println("NO HAY EN STOCK");
                }
            } else {
                System.out.println("Codigo incorrecto, vuelva a intentarlo");
            }
            System.out.println("¿Desea ingresar mas? | 1. Si | 2. No");
            op = sc.nextInt();
        } while (op != 2);
        System.out.println("====FACTURA====");
        System.out.println("Nombre\tPrecio\tUnidades");
        for (int i = 0; i < carrito.size(); i++) {
            System.out.println((i + 1) + ".-" + carrito.get(i) + " " + precios.get(i).get(0) + " " + precios.get(i).get(1));
        }
        if (subTotal>100) {
            System.out.println("SUBTOTAL: " + subTotal);
            System.out.println("IVA: " + iva);
            subIVA = subTotal * iva + subTotal;
            System.out.println("SUBTOTAL IVA: " + subIVA);
            descuento *= subIVA;
            System.out.println("DESCUENTO 20%: " + descuento );
            total = subIVA - descuento;
            System.out.println("TOTAL: " + total);
        }else{
            descuento=0;
            System.out.println("SUBTOTAL: " + subTotal);
            System.out.println("IVA: " + iva);
            subIVA = subTotal * iva + subTotal;
            System.out.println("SUBTOTAL IVA: " + subIVA);
            descuento *= subIVA;
            System.out.println("DESCUENTO 20%: " + descuento );
            total += subIVA;
            System.out.println("TOTAL: " + total);
        }
        sc.close();
    }
}
