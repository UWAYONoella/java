class Humans{
    String Name;
    String Location;
    int Height;


   

public static void main(String[] args){
        Humans prs1 = new Humans();
        Students std1 = new Students();
        book bk1=new book();
        tractor trc=new tractor();
        trc.brand="toyota";
        bk1.bookNumber=12;
        prs1.Name="Nono";
        std1.Name="Dani";
        prs1.Location="Rulindo";
        System.out.println("This person is called "+prs1.Name +"and is located to "+prs1.Location +" his book has " +bk1.bookNumber +"book number");
        System.out.println("My car's brand is "+trc.brand);
    }
}
      public class Students extends Humans {
        String reg, Name;
    }
    public class book extends Students {
        int bookNumber;
    }
    public class tractor extends Students {
        String brand;
    }





















// public class Students {
//     int age;
//     String reg;
// char grade;
// Students(){}
// Students(int age, String reg, char grade){
//         this.age=age; this.reg=reg; this.grade=grade;
// }

//     public static void main(int age, String reg) {
//         Students std1=new Students();
//         std1.age=23;
//         std1.reg="22/16751";
//         // constructor
//         Students std2 = new Students(25,"22/3456",'A');

//         System.out.println("Student that has this Reg_number "+std1.reg +" is " 
//         +std1.age +" years old!");
//         System.out.println("Student that has this Reg_number "+std2.reg +" is " 
//         +std2.age +" years old!");
        
//     }
    
// }






