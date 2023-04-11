public class DayZeroZeroTwo {
    public static void main(String[] args) {
        //Calculate the  area of a circle.
        int r;//Variable Declaration
        try {
            r = 0/0;
        }catch (Exception e)
        {
            System.out.println("Exception Handled");
            r=1;
        }
        float pi = 3.14f;//Input
        double area = pi * r * r;//Process
        System.out.println("AREA :: "+area);//Output

    }
}
