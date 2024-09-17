public class Boss {
    private int health ;
    private int damage;
    private String deffence;

    public int getDamage(){
      return damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public String getDeffence(){
        return deffence;
    }
    public void setDeffence(String deffence){
        this.deffence = deffence;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
}
