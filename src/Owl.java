public class Owl {

    String name = "Сова";
    void woohoo () {
        System.out.println(name + ": ухууу~");}


    void flight(){
        double flyHight;

        if (flyHight <4 && flyHight > 0)
            System.out.println("Сова врезалась в слона");
        else if (flyHight = 0)
            System.out.println("Сова решила прогуляться");
        else if (flyHight < 0)
            System.out.println("Сова не крот, под землёй не живёт!");
        else System.out.println("Сова летит");
    }

}
}
