import java.util.Scanner;

public class What_should_I_wear {
    public static void main(String[] args) {
        //Getting weather info
        System.out.println("What is the weather like today? Sunny, Snowy or Rainy?");
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();
        //Getting temperature info
        System.out.println("What is the temperature today in degrees?");
        Scanner reader2 = new Scanner(System.in);
        int temp = reader2.nextInt();

        //Giving clothing advice
        System.out.print("You should wear ");
        if(temp < 10){
            System.out.print("a coat ");
        } else if (temp > 20) {
            System.out.print("a t-shirt ");
        } else {
            System.out.print("a jumper ");
        }
        if(weather.toLowerCase().equals("sunny")){
            System.out.println("and sunglasses.");
        } else if (weather.toLowerCase().equals("snowy")) {
            System.out.println("and a wooly hat.");
        } else if (weather.toLowerCase().equals("rainy")){
            System.out.println("and bring an umbrella.");
        }

    }
}
