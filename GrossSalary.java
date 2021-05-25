import java.util.*;
class GrossSalary
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            double hra=0,da=0;
            int salary=sc.nextInt();
            if(salary<1500)
            {
                hra=(salary*10.0)/100;
                da=(salary*90.0)/100;
            }
            else
            {
                hra=500;
                da=(salary*98.0)/100;
            }
            System.out.println(salary+hra+da);
        }
    }
}