package angel.week1;

public class oddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/
    public static void main(String[] args)
    {

        idetify(0);
        idetify(1);
        idetify(2);
        idetify(-2);
        idetify(-1);

    }
    public static void idetify(int num){
        System.out.println( ((num&1)==1)? "Odd":"Even");

    }


}