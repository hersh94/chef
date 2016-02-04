import java.util.Random;

public class Chef extends Thread{
	String ingredient;
	Table table;
	String missingIngredients;
	public Chef(Table table, String ingredient){
		this.table = table;
        this.ingredient = ingredient;
        if (ingredient.equals("Bread")) {
            missingIngredients = "Cheese and Avocado";
        }
        if (ingredient.equals("Cheese")) {
            missingIngredients = "Bread and Avocado";
        }
        if (ingredient.equals("Avocado")) {
            missingIngredients = "Bread and Cheese";
        }
	}
	
	@Override
    public void run() {
        do {
            try {
                
            }
            catch (Exception var1_1) {
                // empty catch block
            }

        } while (true);
    }
	
	public void checkTable(){
		String onTable = table.get();
		if (true){
			
		}else if (false){
			
		}else if (null){
			
		}
	}
}
