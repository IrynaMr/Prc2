//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //1
        int a = 79;
        if (a>50 && a<100) {
            System.out.println("Число " +a+ " міститься в проміжку 50;100");
        }
        else
        {
            System.out.println(" Число " +a+ " не міститься в проміжку 50;100");
        }
        //2

        int n = 534;
        n= Math.abs(n);
        int firstNumber = n/100;
        int secondNumber = (n/10)%10;
        int thirdNumber = n%10;
        if (firstNumber >= secondNumber & firstNumber >= thirdNumber) {
            System.out.println(firstNumber);
        }
        else if (secondNumber>=firstNumber & secondNumber>=thirdNumber){
            System.out.println(secondNumber);
        }
        else {
            System.out.println(thirdNumber);
        }
        //3
        String direction = "До гори";
        int floor = 2;
        if (direction=="До низу"){
            if (floor==2){
                System.out.println("Ви спустили на 1 поверх");
            } else {
                System.out.println("Ви спустились на" +floor+ "поверх");
            }
        }
        else {
            if (floor==2){
                System.out.println("Ви піднялись на 3 поверх");
            } else {
                System.out.println("Ви піднялись на" +floor+ "поверх");
            }
        }
        //4
        String option = "x";
        switch(option) {
            case"Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Невідома операція");

        }
    }
}
