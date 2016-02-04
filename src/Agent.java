import java.util.Random;

public class Agent extends Thread{
	private Table tab;
	
	public Agent(Table tab){
		this.tab = tab;
	}
	@Override
    public void run() {
        do {
            try {
                Thread.sleep(1000);
                Random random = new Random();
                int currentIngredients;
                String disposedIngredients = new String();
				currentIngredients = random.nextInt(3);
                if (currentIngredients == 0) {
                    disposedIngredients = "Bread and Cheese";
                }
                if (currentIngredients == 1) {
                    disposedIngredients = "Bread and Avocado";
                }
                if (currentIngredients == 2) {
                    disposedIngredients = "Cheese and Avocado";
                }
                System.out.println("Ingredients on the table: "+ disposedIngredients);
            }
            catch (Exception var1_1) {
                // empty catch block
            }

        } while (true);
    }
	
	
}
