package JavaCollection;

import java.util.*;

public class ColeccionesJava {

	public static void main(String[] args) {
		
		System.out.println("=====LISTA=====");
		
		List<String> arrayList=new ArrayList<>();
		arrayList.add("Uno");
		arrayList.add("Dos");
		arrayList.add("Tres");
		arrayList.remove("Tres");
		arrayList.set(1, "Cuatro");
		System.out.println("ArrayList: "+arrayList);
		System.out.println("=====LISTA=====");
		List<String> LinkedList=new ArrayList<>();
		LinkedList.add("Uno");
		LinkedList.add("Dos");
		LinkedList.add("Tres");
		LinkedList.remove(1);
		LinkedList.remove("Uno");
		System.out.println("LinkedList: "+LinkedList);
		System.out.println("=====LISTA=====");
		Set<String> hashSet =new HashSet();
		hashSet.add("Manzana");
		hashSet.add("Banano");
		hashSet.add("Pera");
		hashSet.add("Nuez");
		hashSet.add("Manzana");
		System.out.println("HashSetList: "+hashSet);
		System.out.println("=====LISTA=====");
		Set<String> treeSet =new TreeSet();
		treeSet.add("Manzana");
		treeSet.add("Banano");
		treeSet.add("Naranja");
		treeSet.add("Manzana");
		treeSet.add("Aguacate");
		treeSet.add("Uva");
		treeSet.remove("Uva");
		treeSet.add("Fresa");
		System.out.println("TreeSetList: "+treeSet);
		System.out.println("=====LISTA=====");
		Set<String> linkedHashSet =new LinkedHashSet();
		linkedHashSet.add("Manzana");
		linkedHashSet.add("Banano");
		linkedHashSet.add("Limón");
		linkedHashSet.add("Naranja");
		
		System.out.println("LinkedHashSet: "+linkedHashSet);
		
		System.out.println("=====COLA=====");
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(30);
		priorityQueue.add(390);
		priorityQueue.add(1);
		priorityQueue.add(27);
		priorityQueue.add(19);
		System.out.println("PriorityQueue: "+priorityQueue);
		System.out.println("=====COLA=====");
		Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("Frente");
		arrayDeque.addLast("Final");
		arrayDeque.addFirst("Inicio");
		System.out.println("ArrayDeque: "+arrayDeque);
		System.out.println("=====MAP=====");
		Map<Integer,String> hashmap = new HashMap<>();
		hashmap.put(2, "Dos");
		hashmap.put(1, "Uno");
		hashmap.put(0, "Cero");
		hashmap.put(3, "Tres");
		System.out.println("HashMap: "+hashmap);
		System.out.println("=====MAP=====");
		Map<Integer,String> TreeMap = new TreeMap<>();
		TreeMap.put(2, "Dos");
		TreeMap.put(1, "Uno");
		TreeMap.put(0,"Cero");
		TreeMap.put(3, "Tres");
		System.out.println("TreeMap: "+TreeMap);
		
		System.out.println("=====MAP=====");
		Map<Integer,String> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put(2, "Dos");
		linkedhashmap.put(1, "Uno");
		linkedhashmap.put(0,"Cero");
		linkedhashmap.put(3, "Tres");
		System.out.println("LinkedHashMap: "+linkedhashmap);
		
		
		
	}

}
