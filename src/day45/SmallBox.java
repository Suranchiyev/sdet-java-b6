package day45;

import java.util.ArrayList;
import java.util.List;

// we use implements keyword to implement interfaces
// The first non abstract/inteface concrete class
// must implement all abstract methods
public class SmallBox implements Box {
	private List<String> data = new ArrayList<>();
	
	@Override
	public void add(String element) {
		data.add(element);
	}
	
	@Override
	public String get(int index) {
		return data.get(index);
	}
	
	@Override
	public int size() {
		return data.size();
	}
}
