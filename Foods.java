public class Foods {
    //instance variables for foods object
    private String name;
    private int amount;
    private double total = 0;
    
    //arrays to store name and cost of items in store inventory
    private String[] names = {"none","apple", "banana", "carrots","cherries","corn", "cucumbers","dragon fruit", "edaname", "figs", "grapes","green beans","honeydew","jicama", "kale", "kiwi", "lemons","lettuce", "mango","nectarine", "oranges","pears", "plums", "pomogranate","potatoes", "spinach", "tangerines", "tomatoes", "mushrooms", "watermelon","zucchini", 
    "applesauce", "almonds", "alphabet noodle soup", "beans", "chicken broth","cereal", "chocolate", "canned mixed fruit", "dried fruit","eggnog", "flour","granola", "honey", "instant coffee", "jam", "kimchi", "lentils", "marshmellows","nachos","oreos", "oatmeal" ,"peanut butter","pancake mix", "popcorn", "potato chips", "rice","salsa", "spices","tea", "tuna", "water", "yeast"};
    private double[] cost = {0,1,1,1,2,3,1,2,3,4,5,3,2,3,1,1,2,3,1,2,3,4,5,3,2,3,1,1,2,3,1,2,3,4,5,3,2,3,1,1,2,3,1,2,3,4,5,3,2,3,1,1,2,3,1,2,3,4,5,3,2,3,2,2,2};
    
     /**
    Initializes a Foods object
    Postcondition: Instance variables String name and int amount are initialized  
    
    @param name - String to initialize instance variable name for Food object
    @param amount - int to initialize instance variable amount for Food object
    */
    public Foods(String name, int amount){
        this.name = name;
        this.amount = amount;
        for(int i = 0; i < names.length; i++){
            if(names[i] == name){
                total += cost[i] * amount;
            }
        }
    }
    
    /**
    Returns the String array names of a given Food object.
    @return names;
    */
    public String[] getNames(){
        return names;
    }
    
    /**
    Returns the double array cost of a given Food object.
    @return cost;
    */
    public double[] getCost(){
        return cost;
    }
    
    /**
    Returns the double total cost of a given Food object.
    @return total;
    */
    public double getTotal(){
        return total;
    }
    
     /**
    Returns the int amount bought of a given Food object.
    @return amount;
    */
    public int getAmount(){
        return amount;
    }
    
     /**
    Returns the String name of a given Food object.
    @return name;
    */
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    /**
    Returns part of receipt of items to be bought
    */
    public String toString(){
        return " ____________________________________"+
            "\n|                                    |"+
            "\n|              RECEIPT               |"+
            "\n|                                    |"+
            "\n|************************************|"+
            "\n|Name             Qty          Price |"+
            "\n|                                    |";
           
         
    }
    
    public String firstLine(){
      return "\n|" + name + ": "+ amount + " costing toal of " + total + "$";
    }
    
    public int getNumOrganic(){
       return 0;
    }
    
    
}
