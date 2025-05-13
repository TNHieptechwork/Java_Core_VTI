package org.example.HW1;

public class HW1 {

    public static void displayField(PeaShooter p, Zombie z) {
        for (int i = 0; i <= 10; i++) {
            if (i == p.x && i == z.x) {
                System.out.print("[pz]");
            } else if (i == p.x) {
                System.out.print("[p]");
            } else if (i == z.x) {
                System.out.print("[z]");
            } else {
                System.out.print("[ ]");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PeaShooter p = new PeaShooter(100,5,1);
        Zombie z = new Zombie(150,10,1);

        for(int i = 0;i < 5;i++){
            System.out.println("\n -- Step: " + i + 1 +" --");
            displayField(p,z);

            p.update();
            z.update();
            if(z.isAlive() && z.y == p.y && z.x - p.x <= 5 && z.x > p.x) {
                p.shoot(z);
            }
            else if(z.x <= p.x){
                System.out.println("\n Zombie eating PeaShooter");
                break;
            }
            if(!z.isAlive()){
                System.out.println("\n Zombie defeated!");
                break;
            }

        }

    }
}
