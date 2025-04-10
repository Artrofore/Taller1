import java.util.Scanner;
import java.util.Random;

class void menu{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }
                //a
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
                    pedirDimensiones();
                    validarDimensiones();
                    crearMatriz();
                    llenarMatriz();
                    break;
                case 2:
                    System.out.println("Opción: Llamar matriz.");

                    ;
                    break;
                case 3:
                    System.out.println("Opción: Buscar o mostrar fila.");
                    // Lógica para mostrar fila

                    break;
                case 4:
                    System.out.println("Opción: Verificar si la matriz es 0.");

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
          //aaaaaaaaaaaaaaaaa
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

}
boolean matrizCero(int matriz[ ][ ] ) {
  for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
          totalElementos++;
          if (matriz[i][j] == 0) {
              contadorCeros++;
              {

              }

          }
      }
  }
public static void main(String[] args) {

    int[] dimensiones = pedirDimensiones();
    int filas = dimensiones[0];
    int columnas = dimensiones[1];


    if (validarDimensiones(filas, columnas)) {

        int[][] matriz = crearMatriz(filas, columnas);


        llenarMatriz(matriz);
        mostrarMatriz(matriz);
    } else {
        System.out.println("Las dimensiones no son válidas. Asegúrese de que filas y columnas sean mayores que 0.");
    }
}


public static int[] pedirDimensiones() {
    System.out.print("Ingrese el número de filas: ");
    int filas = scanner.nextInt();

    System.out.print("Ingrese el número de columnas: ");
    int columnas = scanner.nextInt();

    return new int[]{filas, columnas};
}


public static boolean validarDimensiones(int filas, int columnas) {
    if (filas > 0 && columnas > 0) {
        return true;
    } else {
        return false;
    }
}


public static int[][] crearMatriz(int filas, int columnas) {
    return new int[filas][columnas];
}

public static void llenarMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = random.nextInt(10);
        }
    }
}

public static void mostrarMatriz(int[][] matriz) {
    System.out.println("\nMatriz generada:");
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + "\t");
        }
        System.out.println();
    }
}
}
