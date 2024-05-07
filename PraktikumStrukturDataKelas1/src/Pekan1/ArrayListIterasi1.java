package Pekan1;

import java.util.ArrayList;

public class ArrayListIterasi1 {

	public static void main(String[] args) {
ArrayList<String> al = new ArrayList<>();
al.add("saya");
al.add("informatika");
al.add(1, "mahasiswa");
for (int i = 0; i < al.size(); i++) {
	System.out.print(al.get(i) + " ");
}
System.out.println();
for (String str : al)
	System.out.println(str + " ");
	System.out.println();
	System.out.println("Initial ArrayList " + al);
	al.remove(1);
	System.out.println("After the Index Removal   "+ al);
	al.remove("saya");
	System.out.println("After the Object Removal " + al);

	}

}
