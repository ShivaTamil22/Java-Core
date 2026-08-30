public class Day7P2 {
    public static void main(String[] args) {
        // try {
        //     int a = 10;
        //     int b = 0;
        //     int answer = a/b;
        //     System.out.println(answer);
        // } catch (ArithmeticException e){
        //     System.out.println("Cannot divide by zero");
        // }finally {
        //     System.out.println("Program completed");
        // }

        // int[] marks = {100, 100,90, 90, 100};
        // try{
        //     System.out.println(marks[0]);
        //     System.out.println(marks[1]);
        //     System.out.println(marks[2]);
        //     System.out.println(marks[3]);
        //     System.out.println(marks[4]);
        //     System.out.println(marks[12]);

        // } catch (ArrayIndexOutOfBoundsException e){
        //     System.out.println("Invalid Index ");
        // }

        // try{
        //     String name = null;
        //     System.out.println(name.length());
        // } catch(NullPointerException e){
        //     System.out.println("Null Value");
        // }

        // try{
        //     String a = "hi";
        //     int num = Integer.parseInt(a);
        //     System.out.println(num);
        // } catch(NumberFormatException e){
        //     System.out.println("invalid number");
        // }

        try {
            String name = "Shiva";
            System.out.println(name.charAt(9));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }




        }
    
}
