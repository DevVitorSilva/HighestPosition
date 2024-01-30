import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int quantity = sc.nextInt();
        double[] positions = new double[quantity];
        for(int i = 0; i < quantity; i++){
            System.out.printf("Enter %da number: ", i);
            positions[i] = sc.nextDouble();
        }
        double highestValue = 0;
        int highestPosition = 0;
        for(int i = 0; i < quantity; i++){
            if(highestValue < positions[i]){
                highestValue = positions[i];
                highestPosition = i;
            }
        }
        System.out.println();
        System.out.printf("Highest value: %.2f\n",highestValue);
        System.out.printf("position highest value: %d", highestPosition);
        sc.close();
    }
}