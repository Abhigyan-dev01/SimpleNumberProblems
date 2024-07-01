class Solution {
    public int reverse(int x) {
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
