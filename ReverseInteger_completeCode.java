public class ReverseInteger {
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();

        System.out.println(reverse(n));


    }

    public static int reverse(int x) {

        long temp=0;
        while(x!=0)
        {
            if(temp*10>Integer.MAX_VALUE || temp*10<Integer.MIN_VALUE) //Checking the constraint that integer value shoud be in range of -2147483648 to 2147483647
            return 0;
            temp=(temp*10)+(x%10);
            x/=10;
        }

            return (int)temp;
    }
}
