
package ice3;

/**
 * This class +++Insert Description Here+++
 *
 * @author Will Agbonselobho
 */
public class ICE3 {

  
    
  
    public static void main(String[] args) {
 Employee emp = new Employee("Employee",20,30000);
 emp.calculatePay();
 Employee man = new Manager("Manager",20,30000,40,30);
 man.calculatePay();
 Employee sal= new SalesAssociate("Manager",20,30000,30);
 sal.calculatePay();
}
}
 class Employee {
         String EmployeeName = "";
         int hours =0;
         int wage=0;
      Employee(String name,int h,int w){
          this.EmployeeName =name;
          this.hours= h;
          this.wage= w;
      }
  
  public void calculatePay(){
    System.out.println("Employee salary is:" + (hours*wage));
  }
 
 
    }
  class Manager extends Employee{
    int bonus,vacPay;
        public Manager(String name,int h,int w,int b, int v) {
            super(name,h,w);
            this.bonus = b;
            this.vacPay = v;
        }
 
      @Override
        public void calculatePay(){
    System.out.println("Manager salary is: " + (hours*wage)+" bonus: "+ bonus+" vacation pay: "+ vacPay);
  }


        }
      
    
  class SalesAssociate extends Employee{
     int vacPay;
        public SalesAssociate(String name,int h,int w, int v) {
            super(name,h,w);
            this.vacPay = v;
        }
 
      @Override
        public void calculatePay(){
     System.out.println("Sales Associate salary is:" + (hours*wage)+" vacation pay: "+vacPay);
  }

  
 
 }
  