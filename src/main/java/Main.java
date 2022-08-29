import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// test pour Git
// new stings

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Hello world!");

        Human human = new Human();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //
        System.out.print("Write your  name: ");
        human.setName(reader.readLine());
        System.out.print("Write your  surname: ");
        human.setSurName(reader.readLine());
        System.out.print("Write user cache amount: ");
        int NewCache = Integer.parseInt(reader.readLine());
        human.setCacheAmount((NewCache));

        System.out.println(human.toString());

        // CHOICE MENU
        boolean systemIsRun = true;

        do {
            System.out.println();
            System.out.println("==============================================");
            System.out.println("Press: 1 - to buy bred (-10$)");
            System.out.println("Press: 2 - to buy water (-15$)");
            System.out.println("Press: 3 - to go work (+0-20$)");
            System.out.println("Press: 4 - to write overtime work (+5$ per 1h");

            int option = Integer.parseInt(reader.readLine()); // read user choice

            switch (option) {

                case 1:
                    human.buyBred();
                    break;
                case 2:
                    human.buyWater();
                    break;
                case 3:
                    human.goWork();
                    break;
                case 4:
                    human.doOvertime(); // add money for overtime work
                    break;
                default:
                    systemIsRun = false;
            }

            System.out.println(human.toString());

        } while (systemIsRun);

    }
}