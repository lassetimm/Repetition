import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type a number");
        int input = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%input == 0 && numbers.get(i) != input){
                numbers.remove(i);
            }
        }


/*  //Mig der eksperimentere med en anden metode
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j = j + input - 1) {
                if(numbers.get(i) == numbers.get(j) && i != 0 && i != input - 1){
                    numbers.remove(j);
                }
            }
        }

 */
        System.out.println(numbers);
    }
}
