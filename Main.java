import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int maquinas = 2;
        MaquinaDeTuring TM1 = Maquinas.EqualBinaryWords();
        //MaquinaDeTuring TM1 = Maquinas.Sumar();


      //  boolean done = TM1.Run("010000110101#010000110101", false);
        //boolean done = TM1.Run("B111B11", false);
      //  if (done) {
//            System.out.println("The input was accepted.");
//        } else {
//            System.out.println("The input was rejected.");
//        }


        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Desea crear una maquina o ejecutar una maquina");
        System.out.println("Ingrese 1 si desea ejecutar una de las maquinas de turing ya existentes, ingrese 2 si desea generar una maquina nueva");
        int opc = in.nextInt();

        if (opc ==1){


            System.out.println("Ingrese 1 si desea la maquina de suma, Ingrese 2 si desea la maquina de igualdad");
            int num = in.nextInt();
            System.out.println("usted tiene: " + num);

            switch (num) {
                case 1:
                    System.out.println("Maquina de suma");
                    System.out.println("Por favor ingrese el input, los numeros deben estar separados por");
                    String input = in.nextLine();
                    boolean donea = TM1.Run("111B11", false);
                    if (donea) {
                        System.out.println("The input was accepted.");
                    } else {
                        System.out.println("The input was rejected.");
                    }
                    break;
                case 2:
                    System.out.println("Maquina de igualdad");
                    System.out.println("Por favor ingrese el input, los numeros deben estar separados por #");
                    String lapruebadelinput = in.nextLine();



                    boolean dones = TM1.Run("0101#001", false);
                    //boolean dones = TM1.Run("0101#0101", false);

                    if (dones) {
                        System.out.println("The input was accepted.");
                    } else {
                        System.out.println("The input was rejected.");
                    }
                    break;
                default:
                    System.out.println("Usted ingreso una opcion incorrecta");
                    break;
            }
        } else if (opc == 2) {

        }else {
            System.out.println("Usted ingreso una opcion incorrecta");
        }


/*
        String prueba="";

        try {
            File file = new File("C:\\Users\\jazmi\\IdeaProjects\\Maquina de Turing\\src\\Maquinas.java");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine())
                prueba +=scanner.nextLine()+"\n";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("Esta es la prueba");
        System.out.println(prueba);
*/
    }

}