package calculadora;
import java.util.Scanner;

public class MenuCalculadora {

    private Operaciones operaciones;

    public MenuCalculadora() {
        this.operaciones = new Operaciones();
    }

    public void iniciarCalculadora() {
        Scanner scanner = new Scanner(System.in);
        boolean continuarPrincipal = true;

        while (continuarPrincipal) {
            System.out.println("+=============================+");
            System.out.println("|        CALCULADORA          |");
            System.out.println("+=============================+");
            System.out.println("| ¿Con cuántos números desea  |");
            System.out.println("| realizar la operación?      |");
            System.out.println("|                             |");
            System.out.println("| 1. Operación con una cifra  |");
            System.out.println("|    (Ej. 1 + 1)              |");
            System.out.println("|                             |");
            System.out.println("| 2. Operación con dos cifras |");
            System.out.println("|    (Ej. 10 + 10)            |");
            System.out.println("|                             |");
            System.out.println("| 3. Volver al Menú Principal |");
            System.out.println("+=============================+");

            int tipoOperacion = scanner.nextInt();

            if (tipoOperacion == 3) {
                System.out.println("Volviendo al Menú Principal...");
                return; // Sale al menú principal
            }

            boolean continuarSubmenu = true;
            while (continuarSubmenu) {
                System.out.println("Seleccione una operación: ");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Volver a la selección de cifras");
                System.out.println("6. Volver al menú principal");


                int opcion = scanner.nextInt();


                if (opcion == 5) {
                    System.out.println("Volviendo al submenu de seleccion de cifras...");
                    continuarSubmenu = false;
                    continue; // Regresa al submenú sin finalizar la calculadora
                }
                else if (opcion == 6) {
                    System.out.println("Volviendo al menú principal...");
                    return; // Sale al menu principal
                }

                // Determina el rango de los números según la opción seleccionada
                int rango = (tipoOperacion == 1) ? 9 : 99;

                System.out.print("Ingrese el primer número (0-" + rango + "): ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número (0-" + rango + "): ");
                double num2 = scanner.nextDouble();

                double resultado = 0;


                /*int opcion = scanner.nextInt();*/

/*            if (opcion == 5) {
                System.out.println("Volviendo al menú principal...");
                return;
            }

            System.out.println("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;*/

                switch (opcion) {
                    case 1:
                        resultado = operaciones.sumar(num1, num2);
                        System.out.println("El resultado la suma es: " + resultado);
                        break;
                    case 2:
                        resultado = operaciones.restar(num1, num2);
                        System.out.println("El resultado de la resta es: " + resultado);
                        break;
                    case 3:
                        resultado = operaciones.multiplicar(num1, num2);
                        System.out.println("El resultado la multiplicación es: " + resultado);
                        break;
                    case 4:
                        resultado = operaciones.dividir(num1, num2);
                        System.out.println("El resultado de la división es: " + resultado);
                        break;
                    default:
                        System.out.println("Opcion no válida!!!");
                }
            }
        }
    }
}