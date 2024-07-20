class Solution 
{
    public String losingPlayer(int x, int y) 
    {
        int i=0;
        while(x>=0 && y>=0)
        {
            x=x-1;
            y=y-4;
            i++;
            
        }
        if(i%2==0)
        {
            return "Alice";
        }
        else
        {
            return "Bob";
        }
    }
}