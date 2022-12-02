/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author 61410
 */
public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitPoints;
    
    public Game(String home, String visit, int homeScore, int visitScore){
        this.homeTeam = home;
        this.visitingTeam = visit;
        this.homePoints = homeScore;
        this.visitPoints = visitScore;
    }
    
    public String getHome(){
        return homeTeam;
    }
    
    public String getAway(){
        return visitingTeam;
    }
    
    public int getHomeScore(){
        return homePoints;
    }
    
    public int getVisitingScores(){
        return visitPoints;
    }
}