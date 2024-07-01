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
            if(temp*10>Integer.MAX_VALUE || temp*10<Integer.MIN_VALUE)
            return 0;
            temp=(temp*10)+(x%10);
            x/=10;
        }

            return (int)temp;
    }
}
