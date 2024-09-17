public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setHealth(200);
        boss.setDeffence("Balta");

        System.out.println("health: " + boss.getHealth() + "damage: " + boss.getDamage() +
                "deffence: " + boss.getDeffence());


        Hero[] heroes = creatHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.print(heroes[i].getHealth());
            System.out.print(" " + heroes[i].getDamage());
            System.out.println(" " + heroes[i].getSuperPower());
        }
    }
    public static Hero[] creatHeroes() {
        Hero magic = new Hero(100,300,"fire");
        Hero fighter = new Hero(500,700,"gun");
        Hero archer = new Hero(150,250,"arch");

        Hero[] heroes = new Hero[]{magic, fighter, archer};
        return heroes;
    }
}
