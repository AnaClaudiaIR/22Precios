import java.util.Scanner;

public class CalculadoraPrecios {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Ingresa el precio base: ");
        double precioBase = scanner.nextDouble();

        double precioIVA = precioBase * 1.21;
        System.out.println("Precio Base: " + precioBase);
        System.out.printf("Precio IVA: %.2f\n", precioIVA);
        System.out.println("----------------");
        int menu;

            System.out.println("Tipo de cliente: ");
            System.out.println("1. Estudiante");
            System.out.println("2. Adulto");
            System.out.println("3. VIP");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    double precioEstudiante = precioIVA * ConstanteDescuento.estudiante; //Al ser estático se debe poner la clase a la que pertenece --> Es igual para todos
                    System.out.printf("Precio Estudiante: %.2f", precioEstudiante);
                    break;
                case 2:
                    double precioAdulto = precioIVA * ConstanteDescuento.adulto;
                    System.out.printf("Precio Adulto: %.2f", precioAdulto);
                    break;
                case 3:
                    double precioVip = precioIVA * ConstanteDescuento.VIP;
                    System.out.printf("Precio VIP: %.2f", precioVip);
                    break;

                default:
                    System.out.println("Opción no valida.");
                    break;
            }
    }
}