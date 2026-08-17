class TaskWeek1 {
    public static void main (String[] args){

        // 1.Positive or Negative
        int num = -20;
        if (num >= 0 ){
            if (num == 0){
                System.out.println("The value is Zero");
            }
            else {
                System.out.println("The Value is Positive Number");
                }
            }
        else {
            System.out.println("The Value is Negative Number");
            }
        System.out.println("------------------------------------");

        // 2.Income Tax Slab
        int salary = 500000;
        if (salary <= 300000){
            System.out.println("No Tax");
        }
        else if (salary <= 600000){
            System.out.println("5% Tax");
        }
        else if (salary <= 900000){
            System.out.println("10% Tax");
        }
        else if (salary <= 1200000){
            System.out.println("15% Tax");
        }
        else {
            System.out.println("20% Tax");
        }
        System.out.println("------------------------------------");

        // 3. Admission Eligibility
        int age = 19;
        int mark = 60;
        if (age >=18){
            if (mark >=60){
                System.out.println("Eligible");
            }
            else {
                System.out.println("Not Eligible");
            }
        }
        else{
            System.out.println("Not Eligible");
        }
        System.out.println("------------------------------------");

        // 4.Display Day by use Switch Case
        int day = 9;
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid Day number!!!!");
                break;
        }
        System.out.println("------------------------------------");

        // 5. largest number between 4 number
        int large1=23;
        int large2=99;
        int large3=99;
        int large4=8;
        if (large1 >= large2 && large1 >=large3 && large1>=large4){
            System.out.println("Largest Number : " + large1);
        }
        else if (large2 >= large1 && large2 >=large3 && large2>=large4){
            System.out.println("Largest Number : " + large2);
        }
        else if (large3 >= large1 && large3 >=large2 && large3>=large4){
            System.out.println("Largest Number : " + large3);
        }
        else {
            System.out.println("Largest Number : " + large4);
        }
        System.out.println("------------------------------------");

        // 6. Discount 
        int bill = 20000;
        if (bill<=2000){
            System.out.println("No Discount :)");
        }
        else if (bill<= 5000){
            System.out.println("5% Discount :)");
        }
        else if (bill<= 8000){
            System.out.println("10% Discount :)");
        }
        else if (bill<= 10000){
            System.out.println("15% Discount :)");
        }
        else{
            System.out.println("20% Discount :)");
        }
        System.out.println("------------------------------------");

        // 7.Student result Pass or Fail
        int Smark=40;
        String result = (Smark>=35) ? "Studen Pass " : "Student Fail" ;
        System.out.println(result);
        System.out.println("------------------------------------");

        // 8.Check leap year
        int year = 2026;
        System.out.println((year%4==0 ? "Leap Year" : "Not Leap Year"));
        System.out.println("------------------------------------");

        // 9.Salary Calculator
        int Ysalary = 1200000 ;
        System.out.println("Annual  Salary : " + Ysalary);
        System.out.println("1.Monthly Salary : " + (Ysalary/12));
        System.out.println("2.Weekly Salary : " + (Ysalary/52));
        System.out.println("3.Daily Salary : " + (Ysalary/365));

        System.out.println("------------------------------------");

        // 10.Check whether number is divisiable by 5

        int number = 67;
        System.out.println(
            (number%5==0 ? 
            "Number Divisiable by five" :
             "Number not Divisiable by five")
            );

        System.out.println("------------------------------------");

        // 11.Electricity bill
        int units = 120;
        int ebill ;
        if (units <=100){
            System.out.println("No bill");
        }
        else if (units <=200){
            ebill = units * 2; 
            System.out.println("Bill Amount : " +ebill);
        } 
        else if (units <=300){
            ebill = units * 4; 
            System.out.println("Bill Amount : " +ebill);
        } 
        else if (units <=500){
            ebill = units * 6; 
            System.out.println("Bill Amount : " +ebill);
        } 
        else {
            ebill = units * 10; 
            System.out.println("Bill Amount : " +ebill);
        }
        System.out.println("------------------------------------");

        // 12. check vowel
        char letter = 'z';
        if (letter == 'a' || letter == 'e' || letter == 'i' ||
         letter == 'o' || letter == 'u' || letter == 'A' || 
         letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            System.out.println (letter + " is a Vowel Character");
         }
         else{
            System.out.println (letter + " is a VowelConsonant Character");
         }
        System.out.println("------------------------------------");

        
        

    }
}