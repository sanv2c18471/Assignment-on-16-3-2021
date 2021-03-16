package demo3;

import java.util.Iterator;
import java.util.TreeSet;
//import java.util.*;
public class Treeset1 {
public static void main(String[] args) {
	TreeSet<String> ts = new TreeSet<String>();
	ts.add("sam");
	ts.add("anu");
	ts.add("ram");
	ts.add("priya");
	ts.add("vanitha");
	//ts.add(67);
 //   ts.add(90);
  //    ts.add(12);
	//ts.add(32);
	Iterator <String> it =ts.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	Iterator<String> it1 =ts.descendingIterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	for(String name:ts) {
		System.out.println(name);
	}
	//for(Integer number:ts) {
	//	System.out.println(number);
	//}
}
}
