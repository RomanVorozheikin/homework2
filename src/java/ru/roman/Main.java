package ru.roman;

public class Main {
    public static void main(String[] args) {
        var fighter1=78.2;
        var fighter2=82.7;
        var fighterWeight=fighter1+fighter2;
        System.out.println("Общий вес бойцов "+fighterWeight+ " кг");
        var differenceWeight=(fighter2-fighter1)%fighterWeight;
        System.out.println("Разница веса бойцов "+differenceWeight+ " кг");


        var time=640;
        var timeOneEmployee=8;
        var numberEmployees=time/timeOneEmployee;
        System.out.println("Всего работников в компании-  "+numberEmployees+ " человек");


        var newNumber=numberEmployees+94;
        var newTime=newNumber*8;
        System.out.println("Если в компании работает "+ newNumber+ " человек, то всего "+ newTime+ " часа работы может быть поделено между сотрудниками.");

    }
}
