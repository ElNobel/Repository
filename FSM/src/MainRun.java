import java.util.Scanner;

/**
 * Created by Numl on 04.10.2016.
 */
public class MainRun {
    public static void main(String[] args) {
        final FSM fsm = new FSM();
        final Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter data");

            IncomeData data = new IncomeData(sc.nextLine());

            fsm.handlingData(data);

            System.out.println("State of FSM after check: " + fsm.getState());

            fsm.reset();
        }
    }
}
