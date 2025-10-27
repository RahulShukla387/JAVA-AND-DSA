import java.util.Scanner;

public class Practice {
   public static void main(String[] args) {
    System.out.println("Enter the real and imaginary part of number1");
    Scanner sc = new Scanner( System.in);
    float nr1 = sc.nextInt();
    float ni1 = sc.nextInt();
    System.out.println("Enter the real and imaginary part of number2");
    float nr2 = sc.nextInt();
    float ni2 = sc.nextInt();
    complex c1 = new complex();
    sc.close();
    c1.difference(nr1, ni1, nr2, ni2);
   } 
}

class complex{
 
    void sum(float real1, float img1, float real2, float img2){
        float real = real1 + real2;
        float img = img1 + img2;
        System.out.println(" The sum is  "+ real +"+"+ img + "i" ); 
    }
    void difference (float real1, float img1, float real2, float img2){
        float real = real1 - real2;
        float img = img1 - img2;
        System.out.println(" The difference is  "+ real +"+"+ img + "i" ); 
        
    }
    void product(float real1, float img1, float real2, float img2){
        float real = real1 * real2;
        float img = img1 * img2;
        System.out.println(" The product is  "+ real +"+"+ img + "i" ); 
     
    }
    
}