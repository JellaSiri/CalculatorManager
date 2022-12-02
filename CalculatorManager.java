class Calculator1
{


    int first;
    int second;

    int sumResult;
    int subResult;
    int mulResult;
    int remResult;
    double divResult;

    Calculator1(int a ,int b)
    {
       first=a;
       second=b;
    }


    public void performAdd()
     {
       sumResult = first + second;
     }
      public void performMul()
     {
       subResult = first - second;
      }
      public void performDiv()
       {
       mulResult = first * second;
      } 
     public void performRem()
    {
       remResult = first % second;
    }
    public void display()
   {
   System.out.println(sumResult);
System.out.println(subResult);
System.out.println(mulResult);
System.out.println(remResult);
}

}  
   class CalculatorManager
   {
  public static void main (String[] args)
  {
    Calculator1 c = new Calculator1(10,2);
     c.performAdd(); 
     c.performMul();
     c.performDiv();
     c.performRem();
     c.display();
}
   }