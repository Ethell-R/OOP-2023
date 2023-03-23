package ie.tudublin;

public class Cat
{
	String name;
    public int numLives; //private field

	public void setName(String name)
	{
		this.name = name;
	}

    public void setLives(int numLives)
	{
		this.numLives = 9;
	}
	
	public Cat()
	{
	}
	
	public Cat(String name)
	{
	}

    public void kill (int numLives) {
        if (numLives > 0){
            numLives --;
            System.out.println("Ouch!");
        }
        else if (numLives == 0){
            System.out.println("Dead");
        }
    }

	public void speak()
	{
		System.out.println("Miau");
	}

}