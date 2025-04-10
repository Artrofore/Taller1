import java.util.Scanner;

void menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        System.out.println("----Bienvenido al menú de operaciones de matrices, existen las siguientes opciones----");

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear una matriz.");
            System.out.println("2. Llamar matriz.");
            System.out.println("3. Buscar/mostrar fila.");
            System.out.println("4. Verificar si la matriz es 0.");
            System.out.println("5. Salir.");

            int opcion = leerOpcionMenu();

            switch (opcion) {
                case 1:
                    System.out.println(">> Opción: Crear una matriz.");
                    // Lógica para crear matriz
                    ;
                    boolean validarDimensiones(int filas, int cols);
                    int [ ][ ] crearMatriz(int filas, in cols);
                    main(int matriz [ ][ ]) {
                }
                    break;
                case 2:
                    System.out.println("Opción: Llamar matriz.");
                    // Lógica para llamar matriz

                    ;
                    break;
                case 3:
                    System.out.println("Opción: Buscar o mostrar fila.");
                    // Lógica para mostrar fila

                    break;
                case 4:
                    System.out.println("Opción: Verificar si la matriz es 0.");
                    // Lógica para verificar matriz nula

                    break;
                case 5:
                    System.out.println("Hasta luego!!");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private static int leerOpcionMenu() {
        while (true) {
            System.out.print("Seleccione una opción: ");
            String input = scanner.nextLine();

            if (input.matches("[1-5]")) {
                return Integer.parseInt(input);
            } else {
                System.out.println("Opción no válida, por favor seleccione una opción del menú.");
            }
        }
    }
}

<tipo> llenarMatriz(int matriz [ ][ ] ) {

}
void mostrarFila(int matriz[ ][ ], int fila) {

}
int [ ][ ] crearMatriz(int filas, in cols) {

}
boolean validarDimensiones(int filas, int cols) {

}
boolean matrizCero(int matriz[ ][ ] ) {
    
}