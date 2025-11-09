class complexNumber// this is fields
{
  int real;
  int image;
  
  complexNumber(int r,int i) //this is constructor
  {
      this.real = r;
      this.image = i;
  }
  
  complexNumber add(complexNumber other) //this is a method
  {
    int sumreal = this.real+other.real;
    int sumimage = this.image+other.image;
    return new complexNumber(sumreal,sumimage);
  }
  
  public void showC() //this is also a method
  {
    System.out.print(real + " +i" + image + "\n");
  }
  
} 

class ComplexNumber //this is main class that match with name of the java file
{
  public static void main(String []args) // entry point of java program 
    {
      complexNumber c1 = new complexNumber(10,4);
      complexNumber c2 = new complexNumber(4,10);
      complexNumber result=c1.add(c2);
      result.showC();
    }
}
