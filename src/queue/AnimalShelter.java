package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Animal{
	public String name;
}

class Dog extends Animal{
	

	Dog(String name){
		//super();
		this.name = name;
	}
}

class Cat extends Animal{
	
	

	Cat(String name){
		this.name = name;
	}
}


public class AnimalShelter {
		Queue<Animal> queue = new LinkedList<Animal>();
		
		public void enqueue(Animal animal){
			queue.add(animal);
		}
		
		public Animal dequeueAny(){
			return queue.poll();
		}
		
		public Animal dequeueDog(){
			Iterator<Animal> itr = queue.iterator();
			while(itr.hasNext()){
				Animal animal = itr.next();
				if(animal instanceof Dog){
					return animal;
				}
			}
			return null;
		}
		
		public Animal dequeueCat(){
			Iterator<Animal> itr = queue.iterator();
			while(itr.hasNext()){
				Animal animal = itr.next();
				if(animal instanceof Cat){
					return animal;
				}
			}
			return null;
		}
		
		public static void main(String args[]){
			AnimalShelter as = new AnimalShelter();
			as.enqueue(new Dog("Dog1"));
			as.enqueue(new Dog("Dog1"));
			as.enqueue(new Cat("Cat1"));
			as.enqueue(new Dog("Dog1"));
			as.enqueue(new Dog("Dog1"));
			as.enqueue(new Cat("Cat1"));
			as.enqueue(new Cat("Cat1"));
			as.enqueue(new Cat("Cat1"));
			as.enqueue(new Dog("Dog1"));
			as.enqueue(new Cat("Cat1"));
			
			System.out.println(as.dequeueAny().name);
			System.out.println(as.dequeueAny().name);
			System.out.println(as.dequeueAny().name);
			
			System.out.println(as.dequeueCat().name);
			System.out.println(as.dequeueDog().name);
			
			System.out.println();
		}
}
