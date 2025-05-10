package org.example.models3;

import java.util.List;

public class Zoo {
    private List<Animals> animalsList;

    public Zoo(List<Animals> animalsList) {
        this.animalsList = animalsList;
    }
    public void addAnimal(Animals a){
        animalsList.add(a);
    }
    public void displayInf(){
        System.out.println("Info of Animals: \n");
        for(Animals a : animalsList){
            a.display();
            a.makeSound();
            a.move();
            System.out.println("-------------------\n");
        }
    }
    public void numberOfAnimals(){
        int dogCount = 0;
        int catCount = 0;
        int birdCount = 0;
        for(Animals a : animalsList){
            if(a.getClass().getSimpleName().equals("Dog")){
                dogCount++;
            } else if (a.getClass().getSimpleName().equals("Cat")) {
                catCount++;
            }
            else{
                birdCount++;
            }
        }
        System.out.printf("Number of Animals: \n");
        System.out.println("Dog: " +dogCount);
        System.out.println("Cat: " + catCount);
        System.out.println("Bird: " + birdCount);
    }
    public List<Animals> getAnimalsList() {
        return animalsList;
    }

    public void setAnimalsList(List<Animals> animalsList) {
        this.animalsList = animalsList;
    }
}
