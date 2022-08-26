import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Human
{
    private String name;
    private String surname;
    private double cacheAmount;
    //private int hour;

    public void goWork()
    {
        double value = Math.random() * 20;
        double scale = Math.pow(10, 2);

        double earnedMoney = Math.ceil(value * scale) / scale;

        setCacheAmount(cacheAmount + earnedMoney);
        System.out.println(name + " " + surname + " earned: " + earnedMoney + "$");
    }

    public void doOvertime() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // вызываем ридер

        System.out.println("Enter how many hours did you overtime work: ");
        int hour = Integer.parseInt(reader.readLine()); // принимаем значение от пользователя в hour (kol-vo chasov)

        int overtimeCache = 5 * hour;
        setCacheAmount(cacheAmount + overtimeCache);
        System.out.println("For " + getFullName() + " was added: " + overtimeCache + "$");
    }

    @Override
    public String toString()
    {
        return name + " " + surname + ", has " + cacheAmount + "$";
    }

    // Buy BREAD = cash - 10$
    public void buyBred()
    {
        if (cacheAmount - 10 > 0)
        {
            setCacheAmount(cacheAmount - 10);
            System.out.println("Bread was bought");
        }
        else
        {
            System.out.println("Unfortunately, you haven't enough money");
        }
    }

    // But WATER = cash - 15$
    public void buyWater()
    {
        if (cacheAmount - 15 > 0)
        {
            setCacheAmount(cacheAmount - 15);
            System.out.println("Water was bought");
        }
        else
        {
            System.out.println("Unfortunately, you haven't enough money");
        }
    }

    public String getFullName()
    {
        return name + " " + surname;
    }

    public String getSurName()
    {
        return surname;
    }

    public void setName(String name) // Указваем Имя
    {
        this.name = name;
    }

    public void setSurName(String surname) // Указваем фамилию
    {
        this.surname = surname;
    }

    public double getCacheAmount()
    {
        return cacheAmount;
    }

    public void setCacheAmount(double cacheAmount)
    {
        this.cacheAmount = cacheAmount;
    }
}