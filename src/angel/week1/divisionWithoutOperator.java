package angel.week1;

public class divisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator
    public static void main(String[] args)
    {
        System.out.println(division(5,0));//can not
        System.out.println(division(0,1));//0
        System.out.println(division(4,3)); // 4\3= 1 reminder 1
        System.out.println(division(4,-2)); //-2
        System.out.println(division(-9,4));//-2 reminder -1
        System.out.println(division(4,4));//1
        System.out.println(division(2,4)); // invalid entry

    }

    public static String division(int num1 , int num2 ){
        int result=0;
        String message="";

        if (num2 == 0) {
             return message+="Can not divide by 0";
            }

        if (num1==0){
            return message+=num1+"\\"+num2+"=0";
        }

        if (Math.abs(num1) < Math.abs(num2)){
            return message+="Fractions not supported . Dividend have to be bigger or equal to the divisor  ";
        }

        if ( (num1 >0 && num2 >0) || (num1 <0 && num2<0)){
            System.out.print(num1+"\\"+num2+"= ");
            while(num1 >= num2) {
                num1 -= num2;
                result++;
            }
            return message+= (num1 ==0)? result:result+" reminder "+num1 ;
        } else {
            System.out.print(num1+"\\"+num2+"= -");
            int n1 = Math.abs(num1);
            int n2 = Math.abs(num2);
            while(n1 >= n2) {
                n1 -= n2;
                result++;
            }
            return message+=(n1==0)? result :  result+" reminder -"+n1;
        }



    }
}
