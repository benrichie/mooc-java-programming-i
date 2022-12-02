
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class SportStatistics {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        try(Scanner sc = new Scanner(Paths.get(file))){
            //while theres still a next line 
            while(sc.hasNextLine()){
                // array, split "," between each line
                String[] line = sc.nextLine().split(",");
                //add to values to object
                games.add(new Game(line[0], line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3])));
                
            }
            
            System.out.println("Team: ");
            String name = scan.nextLine();
            
            int played = 0;
            int wins = 0;
            int losses = 0;
            
            for(Game game: games){
                if(game.getHome().equals(name)){
                    played++;
                    if(game.getHomeScore() > game.getVisitingScores()){
                        wins++;
                    }else{
                        losses++;
                    }
                }
                if(game.getAway().equals(name)){
                    played++;
                    if(game.getVisitingScores() > game.getHomeScore()){
                        wins++;
                } else {
                        losses++;
                    }
            }
 
                 
            }
            System.out.println("Games: "+ played);
            System.out.println("Wins: "+ wins);
            System.out.println("Losses: "+ losses);
            
        } catch(Exception e){
            System.out.println("Error"+ e.getMessage());
        }
        
    }
 
}
    }

}
