package aulasjavaavc;

import java.util.HashSet;
import java.util.Set;

public class TestaSet {
	public static void main(String[] args) {
		Set objetos = new HashSet();
		objetos.add("objeto3");
		objetos.add("objeto1");
		objetos.add("objeto2");
		objetos.add("objeto1");
		objetos.add("objeto2");
		System.out.println(objetos.size());
		System.out.println(objetos+"\n");
		
		for (Object object : objetos) {
			String sTemp = (String) object;
			System.out.println(sTemp);
		}
		
		for (Object object : objetos) {
			System.out.println(object);
		}
		
	}
}