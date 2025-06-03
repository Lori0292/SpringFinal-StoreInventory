public class FreshFoods extends Foods{
   // instance variable for FreshFoods object
   private boolean organic;
   private int numOrganic = 0;
   
   public FreshFoods(String name, int amount, boolean organic){
       super(name, amount);
       this.organic = organic;
   }
   
   /**
    Returns the boolean organic - determines whether food is organic
    @return organic;
    */
   public boolean getOrganic(){
       return organic;
   }
  
   @Override
   public int getNumOrganic(){
       if(organic){
           numOrganic += super.getAmount();
       }
       return numOrganic;
   }
   
   @Override
   public String firstLine(){
      return "\n|" + super.getName() + ": "+ super.getAmount() + " costing total of " + (super.getTotal() + getNumOrganic()) + "$";
    }
   
   
}
