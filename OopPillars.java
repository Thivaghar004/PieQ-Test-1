import java.util.Scanner;

//Absraction
// It hides the implementation of the code by only revealing the necessary content.
abstract class Myabstract{
    //abstract methods..
    public abstract void abstractMethod();
    //concrete methods..
    public void concreteMethod(){
        System.out.println("Abstract class can have concrete methods too..");
    }

}


//polymorphism
class polymorphism extends Myabstract{
    @Override
    public void abstractMethod(){
        System.out.println("Hi");
    }
    //encapsulation
    private int id=1; // only accessible in this class
    protected String first_name="Thivaghar"; // can be accessed by child class too
    public String last_name="M";    // can be accessed anywhere

    public void operations(int a,int b){
        int sum=a+b;
        System.out.println("Addition:"+sum);
    }
    //method overloading
    public void operations(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("Addition:"+sum);
    }
    public void idAccess(){
        System.out.println(id);
    }


}
//inheritance
class inheritance extends polymorphism{
    //method overriding..
    @Override
    public void operations(int a,int b){
        int sub=a-b;
        System.out.println("Subtraction:"+sub);
    }

    public void accessModifier(){
        // id=10; --> this will throw an error because the id field is set to private 
        first_name="Walker";
        System.out.println(first_name);
    }
}
public class OopPillars{
    
    public static void main(String[] args){
        //AbstractMethodChild amc=new AbstractMethodChild();
        //amc.abstractMethod();

        polymorphism p=new polymorphism();
        System.out.println("Method is used for Addition");
        p.operations(5,5);
        System.out.println("Method is used for Addition of 3 numbers");
        p.operations(5,5,5);

        p.abstractMethod();
        p.concreteMethod();

        polymorphism i=new inheritance();
        System.out.println("Same method is used for subraction");
        i.operations(5,5);
    }
}