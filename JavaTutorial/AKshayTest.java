package com.JavaTutorial;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AKshayTest {

	
	String name;
	int id;
	long num;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	// Contractor
	public   AKshayTest(String name , int id , long num) {
		// TODO Auto-generated method stub
		 this.name = name;
		 this.id= id;
		 this.num= num; 
	} 

	@Override
	public String toString() {
		return "AKshayTest [name=" + name + ", id=" + id + ", num=" + num + "]";
	}

	public static void main(String[] args) {
		
		AKshayTest  aks= new AKshayTest( "Akshay", 1 , 12345679L);
		AKshayTest  aks5= new AKshayTest( "sca", 11 , 12345679L);
		AKshayTest  aks6= new AKshayTest( "aofjc", 14 , 12345679L);
		AKshayTest  aks7= new AKshayTest( "mil", 17 , 12345679L);
		AKshayTest  aks8= new AKshayTest( "kudhf", 13 , 12345679L);
		AKshayTest  aks1= new AKshayTest( "pooja", 2 , 12345679L);
		AKshayTest  aks9= new AKshayTest( "pooja", 2 , 12345679L);
		AKshayTest  aks2= new AKshayTest( "okkm", 4 , 12345679L);
		AKshayTest  aks3= new AKshayTest( "monu", 5 , 12345679L);
		AKshayTest  aks4= new AKshayTest( "asc", 9 , 12345679L);
//		HashMap<Integer, AKshayTest> map1 = new HashMap<Integer, AKshayTest>();
//		TreeMap<K, V>
		TreeMap<Integer, AKshayTest> map =new TreeMap<Integer, AKshayTest>();
		map.put(aks9.getId(), aks9);
		map.put(aks8.getId(), aks8);
		map.put(aks7.getId(), aks7);
		map.put(aks6.getId(), aks6);
		map.put(aks5.getId(), aks5);
		map.put(aks4.getId(), aks4);
		map.put(aks3.getId(), aks3);
		map.put(aks2.getId(), aks2);
		map.put(aks1.getId(), aks1);
		map.put(aks.getId(), aks);
		
		
		System.out.println("Assending Order -----------");
		
//		System.out.println(map.descendingMap());
//		System.out.println(map);
		
		for (AKshayTest mp : map.values()) {
			System.out.println(mp);
		}
	
		System.out.println("Decending Order ----------------");
		for (AKshayTest st : map.descendingMap().values()) {
			System.out.println(st);
		}
		
		System.out.println("---------   Using List   ---------------------************-----------------------------");
		
		List<AKshayTest> Dec = new ArrayList<AKshayTest>();
		List<AKshayTest> Ass = new ArrayList<AKshayTest>();
		Dec.addAll(map.values());
				
		Collections.reverse(Dec);
		
//		System.out.println(ku);
		
		for (AKshayTest aKshayTest : Dec) {
			System.out.println(aKshayTest);
			
		}
		
		System.out.println("----Assending order using List ");
		
		Ass.addAll(map.descendingMap().values());
		Collections.reverse(Ass);
	
		
		for (AKshayTest aKshayTest : Ass) {
			System.out.println(aKshayTest);
		}
		
		
		System.out.println("Sorting by name ");
		
//		HashMap<Integer, AKshayTest> map1 = new HashMap<Integer, AKshayTest>();
//		TreeMap<K, V>
		TreeMap<String, AKshayTest> map1 =new TreeMap<String, AKshayTest>();
		map1.put(aks9.getName(), aks9);
		map1.put(aks8.getName(), aks8);
		map1.put(aks7.getName(), aks7);
		map1.put(aks6.getName(), aks6);
		map1.put(aks5.getName(), aks5);
		map1.put(aks4.getName(), aks4);
		map1.put(aks3.getName(), aks3);
		map1.put(aks2.getName(), aks2);
		map1.put(aks1.getName(), aks1);
		map1.put(aks1.getName(), aks1);
		
		for (AKshayTest aKshayTest : map1.values()) {
			System.out.println("By Name --- > "+aKshayTest);
		}
		
		for (AKshayTest aKshayTest : map1.descendingMap().values()) {
			System.out.println("By Name  In Reverse --- > "+aKshayTest);
		}
		
	}
}
