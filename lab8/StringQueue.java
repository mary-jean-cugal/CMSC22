/* mp  made by 
 * Mary Jean Cugal
 * Lovely Grace Arsolon
 * Iris Desabille
 */

import java.util.*;

public class StringQueue{

	private String[] elements ; 
	private int count;
	private int size;
	public static final int DEFAULT_SIZE = 10;

	public static void main(String[] args){

		StringQueue q = new StringQueue();

		q.enqueue("a");
		q.enqueue("b");
		q.enqueue("c");
		q.enqueue("d");
		q.enqueue("e");
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.peek());

		
		q.singit(10,"f");
		q.singit(4,"g");
		System.out.println(q);
		System.out.println(q.size());

		String item1 = q.dequeue();
		String item2 = q.dequeue();
		System.out.println(item1);
		System.out.println(item2);

		System.out.println(q);

		System.out.println(q.dequeue(2));
		System.out.println(q);
	}

	private void expand(){
		String[] copy = new String[size*2];
		copy = Arrays.copyOf(elements,size*2);
		elements = copy;
	}

	public StringQueue(){
		elements = new String[DEFAULT_SIZE];
		size = DEFAULT_SIZE;
	}

	public void enqueue(String item){
		if(count==size){
			expand();
		}
		elements[count++] = item;
	}

	public String dequeue(){
		if(count<=0){
			throw new ArrayIndexOutOfBoundsException("Way Sud!!");
		}else{
			String first = elements[0];
			for(int i = 0; i<count ; i++){
				elements[i] = elements[i+1];
			}
			count--;
			return first;
		}
	}

	public String dequeue(int x){
		if(count<=0){
			throw new ArrayIndexOutOfBoundsException("Way Sud!!");
		}else{
			String result = "" ; 
			for(int i = 0; i<x ; i++){
				result = dequeue();
			}
			return result ;
		}

	}

	public String toString(){
		String str = "";
		if(count<=0){
			return "EMPTY";
		}else{
			for(int i = 0; i<count-1; i++){
				str+=elements[i] + "," ;
			}
			return str+elements[count-1];
		}
	}

	public String peek(){
		return elements[0];
	}

	public void singit(int pos , String item){
		if(count>=size){
			expand();
		}
		if(pos<=0){
			elements[0] = item;
			for(int i = count ; i>pos ; i--){
				elements[i] = elements[i-1];
			}
		}else if(pos>count){
			elements[count] = item ;
		}else if (pos>0 && pos<count){
			
			for(int i = count ; i>pos-1 ; i--){
				elements[i] = elements[i-1];
			}
			elements[pos-1] = item ;
		}

		count++;
	}

	public int size(){return count;}
}