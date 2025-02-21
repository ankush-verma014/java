import java.util.*;

public class BattingAverageTester
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
         String name = sc.nextLine();
         int runs = sc.nextInt();
         int matches = sc.nextInt();

         if(runs<=0 || matches<=0)
         {
            System.out.println("Error");
         }
         Batter b = new Batter(name,runs,matches);
         b.computeBattingAverage();
         b.getStatistics();

         sc.close();
    }
}
class Batter 
{
    String name;
    int runs;
    int matches;
    float batting_avg;

    public Batter()
    {
        this.name = null;
        this.runs = 0;
        this.matches = 0;
        this.batting_avg=0.0f;

    }
    public Batter(String name,int runs,int matches)
    {
        this.name = name;
        this.runs = runs;
        this.matches = matches;
    }

    public void computeBattingAverage()
    {
        double avg = runs/matches;
        System.out.println("Name:"+name);
        System.out.println("Batting_Avg:"+avg);
    }

    public void getStatistics()
    {
        System.out.println("Name:"+name);
        System.out.println("Runs:"+runs);
        System.out.println("Matches:"+matches);

    }

}