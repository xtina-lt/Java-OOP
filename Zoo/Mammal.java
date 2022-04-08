package Zoo;

class Mammal {
    private boolean sleeping = false;
    private int energy = 100;
    // private variables need getters and setters to be seen

    //GETTERS
    boolean getSleeping(){
        return sleeping;
    }

    void regulateTemp(){
        System.out.println("My temp is just right now.");
    }

    int getEnergy(){
        return energy;
    }

    void showEnergy(){
        System.out.println("Energy: " + energy);
    }

    //SETTERS
    void startSleeping(){
        sleeping = true;
        energy = 100;
        System.out.println("zZzZ");
    }

    int setEnergy(int e){
        return energy += e;
    }

}
