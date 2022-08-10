import java.util.Scanner;

class Main {
    public static void main(String[] args) {
   		Scanner scanner = new Scanner(System.in);
           int arraySize;
           int sum=0;

           arraySize = scanner.nextInt();
           int [] array =  new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();  //Guardamos cada valor en su posicion
            sum = sum + array[i];  //Sumamos todos los valores
        }

        System.out.println(sum);

			

    }
}
