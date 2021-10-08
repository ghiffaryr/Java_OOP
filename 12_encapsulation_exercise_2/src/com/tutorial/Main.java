package com.tutorial;

class Player{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int incrementHealth;
    private int incrementAttack;
    private boolean isAlive;
    private int totalDamage;

    public Player(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }

    public void display(){
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.getHealth() +"/" + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
        System.out.println("Alive\t\t: " + this.isAlive + "\n");
    }

    public void attack(Player opponent){
        int damage = this.getAttackPower();
        System.out.println(this.name + " is attacking " + opponent.getName() + " with " + damage + " damage");
        opponent.defense(damage);

        this.levelUp();
    }

    public void defense(int damage){
        int defensePower = this.armor.getDefensePower();
        int deltaDamage;

        System.out.println(this.name + " defense power = "+ defensePower);
        if(damage > defensePower){
            deltaDamage = damage - defensePower;
        } else {
            deltaDamage = 0;
        }
        
        System.out.println("damage earned = " + deltaDamage + "\n");
        
        this.totalDamage += deltaDamage;

        if (this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }

    public void levelUp(){
        this.level++;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int maxHealth(){
        return this.baseHealth + this.level*this.incrementHealth + this.armor.getAddHealth();
    }

    public int getAttackPower(){
        return this.baseAttack + this.level*this.incrementAttack + this.weapon.getAttack();
    }
}

class Weapon{
    private String name;
    private int attack;

    public Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    public String getWeaponName(){
        return this.name;
    }

    public int getAttack(){
        return this.attack;
    }
}

class Armor{
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public String getArmorName(){
        return this.name;
    }

    public int getAddHealth(){
        return this.strength*10 + this.health;
    }

    public int getDefensePower(){
        return this.strength*2;
    }

}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ucok");
        Armor armor1 = new Armor("Habergeon",5,100);
        Weapon weapon1 = new Weapon("Sword", 50);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Acong");
        Armor armor2 = new Armor("Polosan",0,50);
        Weapon weapon2 = new Weapon("Ampu", 1);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player1);
    }
}