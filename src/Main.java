//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend =  19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var weigthBoxer1 = 78.2;
        System.out.println(weigthBoxer1);
        var weigthBoxer2 = 82.7;
        System.out.println(weigthBoxer2);
        var totalWeigthBoxers = weigthBoxer1 + weigthBoxer2;
        System.out.println("Общий вес боксеров " + totalWeigthBoxers + " кг");
        var weightDifference = weigthBoxer2 - weigthBoxer1;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");
        var overweight = weigthBoxer2 % weigthBoxer1;
        System.out.println(overweight);
        var totalOperatingHour = 640;
        System.out.println("Всего рабочих часов компании " + totalOperatingHour);
        var hoursForWorkers = 8;
        System.out.println("Время работы одного сотрудника " + hoursForWorkers + " ч.");
        var numberEmployees = totalOperatingHour / hoursForWorkers;
        System.out.println("Всего сотрудников в компании " + numberEmployees + " человек");
        numberEmployees = numberEmployees + 94;
        System.out.println("Количество сотрудников " + numberEmployees + " человек");
        var allOperatingHour = numberEmployees * hoursForWorkers;
        System.out.println("Если в компании работает " + numberEmployees + " человек, то всего " + allOperatingHour + "часов работы может быть поделено между сотрудниками");



    }
}