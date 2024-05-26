//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int start = 100;
        int amount = 1100;
        int bonus = amount/100;
        if (amount > 1000) {
            System.out.println(start + amount + bonus);
        }
        else {
            System.out.println(start + amount);
        }
    }
}