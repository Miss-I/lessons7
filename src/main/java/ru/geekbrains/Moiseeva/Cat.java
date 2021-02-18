package ru.geekbrains.Moiseeva;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;


    public Cat(String name) {
        this.name = name;
        this.appetite = 5;
        this.hungry = true;
    }

    public void eat(Plate p) {
        if (appetite > p.getFood()){
            System.out.println("Кот не может покушать из этой тарелки, недостаточное количество еды");
        } else if(appetite <= p.getFood()){
            p.decreaseFood(appetite);
            hungry = false;
        }
    }

    public void info(){
        System.out.print(name + " : ");
        if (hungry == true) {
            System.out.println("голодный");
        } else if(hungry == false){
            System.out.println("покушал");
        }
    }
}
