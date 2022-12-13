import java.util.ArrayList;

public class Knapsack {
	ArrayList<Item> solutionSet = new ArrayList<Item>();
	ArrayList<Item> items = new ArrayList<Item>();
	int maxWeight;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Item addItems(Item a, Item b) {
		int value = a.value+b.value;
		int weight = a.weight+b.weight;
		ArrayList<Integer> components = new ArrayList<Integer>();
		components.addAll(a.components);
		components.addAll(b.components);
	}
	public void mergePurge(ArrayList<Item> solutionSet, Item item) {
		ArrayList<Item> temp = new ArrayList<Item>();
		temp.add(item);
		for(Item i:solutionSet) {
			Item tempItem = addItems(item, i);
			if (tempItem.weight<=maxWeight) {
				temp.add(tempItem);
			}
		}
	}
	public void solveKnapsack(ArrayList<Item> items) {
		for(Item i:items) {
			mergePurge(solutionSet, i);
		}
		int max = Integer.MIN_VALUE;
		Item temp = null;
		for(Item i:solutionSet) {
			if(i.value>max) {
				max = i.value;
				temp = i;
			}
		}
		solutionSet.clear();
		solutionSet.add(temp);
	}
}
