class Sample 
{
  public Sample()
  {
    System.out.println("No argument constructor"); //2
       {
       System.out.println("Non static block inside CONSTRUCTOR BODY");//3
       }
  }
}

public class NSB5 
{
    public static void main(String[] args) 
    {
        new Sample();//1
    }
}