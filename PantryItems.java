public class PantryItems extends Foods {
   //instance variable for PantryItems object
   private int expireYear;

   public PantryItems(String name, int amount, int yearBought){
       super(name, amount);
       expireYear = yearBought + 10;
   }
   
    /**
    Returns the int expireYear - expiration date of a given pantryItem object.
    @return names;
    */
    public int getExpireYear(){
       return expireYear;
    }

    public int setYearBought(int year){
        expireYear = year;
    }
}
