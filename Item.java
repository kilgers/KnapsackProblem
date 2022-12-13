import java.util.ArrayList;

public class Item {
public int value;
public int weight;
public ArrayList<Integer> components;

public Item(int  value, int weight, int number) {
	this.value = value;
	this.weight = weight;
	this.components = new ArrayList<Integer>();
	components.add(number);
	
}
public Item(int value, int weight, ArrayList<Integer> components) {
	this.value = value;
	this.weight = weight;
	this.components = components;
}
}
