package OOPs.Abstraction;

public class SOA extends NIRF{
    SOA(String collegeName){
        this.collegeName = collegeName;
    }
    void numStu(int Students){
        System.out.println("Total Students:" + Students);
    }
    void fest(){
        System.out.println("No fests sorry!!");
    }
}
