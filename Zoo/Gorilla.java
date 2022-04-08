package Zoo;

public class Gorilla extends Mammal {
    int eatBananas(){
        return setEnergy(10);
    }

    int throwThings(){
        int energy = getEnergy();
        System.out.println(energy);
        int e = ((energy - 5) >= 0) ? energy - 5 : 0;
        String status = (energy != e) ? "Success" : "Not enough Energy";
        System.out.println(status);
        return setEnergy(e);
    }

    int climb(){
        int energy = getEnergy();
        int e = ((energy - 10) >= 0) ? (-10) : 0;
        String status = (energy != e) ? "Success" : "Not enough Energy";
        System.out.println(status);
        return setEnergy(e);
    }
}
