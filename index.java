class Pass
{
    public static void main(String a[])
    {
        int x = 50;
        int y = 100;
        int z = 150;
       
        if(x > y && x > z)
        {
            System.out.println(x);
            System.out.println("Thank you");  
        }
        if(y > z)
        {
            System.out.println(y);
            System.out.println("Thank you");  
        }
        else
        {
            System.out.println(z);
            System.out.println("Thank you");  
        }
    }
}

