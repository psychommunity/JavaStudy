import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TestGenerics01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();

		d.getList().add(3);
		d.getList().add(2);
		d.getList().add(1);
		d.getList().add(1);
		System.out.println("list : " + d.getList());

		Collections.sort(d.getList());
		System.out.println("asc : " + d.getList());

		Collections.reverse(d.getList());
		System.out.println("dsc : " + d.getList());

		System.out.println("");

		TreeSet<Integer> set = new TreeSet<>();
		set.addAll(d.getList());
		System.out.println("set : " + set);

		d.getList().removeAll(d.getList());
		d.getList().addAll(set);
		System.out.println("list : " + d.getList());

		System.out.println("dsc : " + set.descendingSet());

	}

}

class Data {
	private ArrayList<Integer> list = new ArrayList<>();

	public ArrayList<Integer> getList() {
		return list;
	}
}