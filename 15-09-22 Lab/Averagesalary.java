public class Averagesalary 
{   
    public static void main(String[] args)
    {
        int average = 10000;
        int emp1 = 11000;
        int emp2 = 5000;

        //average = (emp1 + emp2 + emp3) / 3
        //average * 3 = (emp1 + emp2 + emp3)
        int emp3 = (average * 3) - (emp1 + emp2);
        System.out.println("The salary of the third employee is : " + emp3);
    }   
}
