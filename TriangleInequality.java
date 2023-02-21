    import java.util.Scanner;
    
    public class TriangleInequality {
    public static void main( String[] args ) {
        double s1,s2,s3;
        boolean isTriangle = true;
        
        Scanner keys=new Scanner(System.in);
         while(3==3){
        System.out.println("Enter the 1st side of the a triangle");
        s1= keys.nextDouble();
        
        System.out.println("Enter the 2nd side of the a triangle");
        s2= keys.nextDouble();
        
        System.out.println("Enter the 3rd side of the a triangle");
        s3= keys.nextDouble();
    
        
       
        if(((s1 + s2) > s3)&& ((s1 + s3) > s2)&&((s2 + s3) > s1)) {
            System.out.println("The side lengths form a triangle");
        }
        else{
        System.out.println("The side lengths do not form a triangle");
        
        }
    }
    }  //end main
}  //end TriangleInequality
