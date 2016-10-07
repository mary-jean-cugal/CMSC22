/* mp  made by 
 * Mary Jean Cugal
 * Lovely Grace Arsolon
 * Iris Desabille
 */

import java.util.*;

public class StringStack{

	private String[] elements ; 
	private int count ;
	private int size ;
	public static final int DEFAULT_SIZE = 10;

	public static void main(String[] args){
		StringStack s = new StringStack();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		s.push("f");
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.peek());
		String item1 = s.pop();
		String item2 = s.pop();
		String item3 = s.pop();
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);
		System.out.println(s);
		System.out.println(s.pop(2));
		System.out.println(s);
	}

	public StringStack(){
		this(DEFAULT_SIZE);
	}

	public StringStack(int size){
		this.size = size;
		elements = new String[size];
	}

	private void expand(){
		String[] copy = new String[size*2];
		copy = Arrays.copyOf(elements,size*2);
		elements = copy;
	}

	public void push(String item){
		if(count>=size){
			expand();
		}
		elements[count++] = item ;
	}

	public String pop(){
		if(count<=0){
			throw new ArrayIndexOutOfBoundsException("Way Sud!!");
		}else{
			return elements[--count];
		}
	}

	public String pop(int x){
		if(count<=0){
			throw new ArrayIndexOutOfBoundsException("Way Sud!!");
		}else{
			String result = "" ; 
			for(int i = 0; i<x ; i++){
				result = pop();
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
		return elements[count-1];
	}

	public int size(){return count;}
}