interface I{
void m1();
}
class A
{
  public static void main(String[] args)
 { 

   I a1 =()->{
      System.out.print("lamda");
   };
    a1.m1();
 }
}
  