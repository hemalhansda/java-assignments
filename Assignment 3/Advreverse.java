class Test
{
  int num;
  Test(int n)
  {
   num=n;
   System.out.println("value of num="+num);
  }
  void getReverse()
  {
   int a=num%10;
   a=a*100;
   num=num/10;
   int b=num%10;
   b=b*10;
   num=num/10;
   int reNo=a+b+num;
   System.out.println("ReverseNO.="+reNo);
  }
 public static void main(String args[])
  {
   Test aa=new Test(234);
   aa.getReverse();
  }
}