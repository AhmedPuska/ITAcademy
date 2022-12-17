package javaapplication29;
public class Horse {
    public Staza staza;
    protected String ime;
    public String rasa;
    public double brzina;
    private int godine;
    public double pos_x;
    
    public double sjheight;
    public int sjstamia;
    
    public int damage;
    public int health;
    
    void hit (BlassterHorse enemy){
        enemy.health-=damage;
//        System.out.println("Flying Horse is hitting someone!!!");
//        System.out.println("Ahmed je najbolji!!!");
        return;
    }
}
