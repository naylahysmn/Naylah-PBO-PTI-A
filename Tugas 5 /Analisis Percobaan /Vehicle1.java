public class Vehicle1 {
   // no. 3, 4, 5 sebelum diubah
   private double load, maxLoad;

   // no.3 setelah diubah
   // public double load;
   // public double maxLoad;

   // no.4 setelah diubah
   // protected double load, maxLoad;

   // no.5 setelah diubah
   // double load, maxLoad;

   public Vehicle1 (double max){
   this.maxLoad = max;
   }
   // no. 1 accessor (getter) 1 karena mengembalikan nilai dari atribut load 
   public double getLoad(){
       return this.load;
   }
   // no.1 accessor (getter) 2 karena mengembalikan nilai dari atribut maxload
   public double getMaxLoad(){
       return this.maxLoad;
   }
   public boolean addBox(double weight){
   double temp = 0.0D;
   temp = this.load + weight;
   if(temp <= maxLoad){
       this.load = this.load + weight;
       return true;
    } else {
        return false;
    }
  }
}  
