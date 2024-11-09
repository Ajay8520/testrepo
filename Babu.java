class Animal1
  {
    void monkey() 
   {
  System.out.println("key...");
 System.out.println("maaa...");
   }
}
 class Animal2 extends Animal1
   {
      void cow()
  {
 System.out.println("maaa...");  
 System.out.println("knoww...");
  }
} 
 class Bab 
  {
     public static void main(String [] args)
   {
   Animal2 an = new Animal2();
    an.monkey();
    an.cow();
}
}
