package ru.geekbrains.Moiseeva;

public class lesson7 {
    public static void main(String[] args) {


        Cat[] cats = {
                new Cat("Barsik"),
                new Cat("Bublik"),
                new Cat("Zilli"),
                new Cat("Graff"),
                new Cat("Tuc")
        };
        Plate plate1 = new Plate(15);
        plate1.info();
        plate1.fillMax();
        plate1.info();
        for (int i = 0; i < cats.length; i++) {
            if(cats[i].isHungry() == true) {
                cats[i].eat(plate1);
            } else if (!cats[i].isHungry()){
                System.out.println("Коту больше не нужно кушать, он поел");
            }
            plate1.info();
            cats[i].info();
        }
    }

}
