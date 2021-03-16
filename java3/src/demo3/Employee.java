package demo3;

import java.util.LinkedHashSet;

class Set1{
		int id;
		String name,manager,dept;
		public Set1(int id, String name, String manager, String dept) {
			super();
			this.id = id;
			this.name = name;
			this.manager = manager;
			this.dept = dept;
		}
}
public class Employee {
		public static void main(String[] args) {
			LinkedHashSet <Set1> s = new LinkedHashSet <Set1>();
			 Set1 e1 = new  Set1(123,"kiran","Chandran","it");
			 Set1 e2 = new  Set1(124,"banu","Suresh","businessmanagement");
			 Set1 e3 = new  Set1(125,"vicky","Pooja","medicalcoding");
	        s.add(e1);
	        s.add(e2);
	        s.add(e3);
	       // Iterator <Employee> it = set.iterator();{
	        	//while(it.hasNext()) {
	        	for(Set1 sc : s) {
	        		System.out.println("id:"+sc.id+"  " +"name:"+sc.name+"  "+ "manager:"+sc.manager+"  "+"dept:"+sc.dept);
	        	}
	        }
		}
