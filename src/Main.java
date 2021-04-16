public class Main {
    public static void main(String[] args) {

        long start = 208;
        long income = 2125;
        long bonus = 0;

        if (income >= 1000){
            bonus = income / 100;
        }
        else {
            bonus = 0;
        }

        long balance = income+start+bonus;
        System.out.println(balance);

}}
