import java.util.*;
import java.lang.*;
import java.io.*;


public class Big{
	static int MAX = 5000;
	private int[] arr = new int[MAX];
	private int length;


	public static void main(String[] args){

		Big a = new Big("83496963634236656497584949");
		Big b = new Big("1");
		//Big a = new Big("100");
		//Big b = new Big("10");
		Big c,d,e;
		c = a.divide(b);
		//d = a.add("0");
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		//e = a.divide(b);
		//System.out.println("a+b: " + d);
		System.out.println("a-b: " + c);
		//System.out.println("a/b: " + e);
		

	}


	public Big(){
		length = 1;
	}

	public Big(String str){
		length = str.length();
		char [] array = str.toCharArray();
		int i = 0;
		if(array[i]=='-'){
			i+=1;
			length-=1;
		}
        for(int j = 0; j<length ; i++,j++){
            	arr[j] = Character.getNumericValue(array[i]);
        }

	}

	public Big(Long l){
		char[] x = ("" + l).toCharArray();
		length = x.length;

		for (int i = 0; i < length; i++){
        		arr[i] = x[i] - '0';
    	}
	}

	public Big(Big li){
		arr = li.arr;
		length = li.length;
	}




	public Big add(Big li){
		int[] sum = new int[MAX];
		int[] addend = arr;
		int[] addend2 = li.arr;
		int i = length-1,j = li.length-1,x,carry = 0,tmp;
		Big answer = new Big();
		answer.length = li.length+length;
		if(i<j){
			addend = li.arr;
			addend2 = arr;
			i = li.length-1;
			j = length-1;
		}
		for(int k = li.length+length-1;i>=0;i--,j--,k--){
			if(j<0){
				x = addend[i] + carry;	
			}else{
				x = addend[i]+addend2[j] + carry;
			}		 
			if(x/10>0){
				carry = 1;
				x%=10;
			}else{
				carry = 0;
				x%=10;
			}
			sum[k] = x;
		
		}
		answer.arr = sum;
        return answer;
	}

	public Big add(String str){
		Big li = new Big(str);
        return this.add(li);
	}
	public Big add(Long l){
		Big li = new Big(l);
        return this.add(li);
	}


public Big subtract(Big li){
		int[] difference = new int[MAX];
		int[] minuend = arr;
		int[] subtrahend = li.arr;
		int i = length-1 , j = li.length-1;
		boolean borrow = false;
		Big answer = new Big();

		if(i < j){
			minuend = li.arr;
			subtrahend = arr;
			//negative
			i = li.length-1;
			j = length-1;
		}else if(i == j){
			int m;
			for(m = 0 ; minuend[m] == subtrahend[m] && m<i+j ; m++);
				if(minuend[m]<subtrahend[m]){
					minuend = li.arr ; subtrahend = arr;
					i = li.length-1 ; j = length-1;
				}
		}
		answer.length = i+1;
		int l;
		for(l = answer.length-1 ; i>=0 ; i-- , j-- , l--){
			if(j<0){
				difference[l] = minuend[i];
			}else{
				if(minuend[i]<subtrahend[j]){
					borrow = true;
					difference[l]=((minuend[i])+10)-subtrahend[j];
					if(minuend[i-1] == 0){
						int c;
						for(c = i-1 ;minuend[c] == 0 ; c--){
							minuend[c] = 9;
						}
						minuend[c]-=1;
					}else{minuend[i-1]-=1;}

				}else{
					borrow = false;
					difference[l] = minuend[i] - subtrahend[j];
				}
			}

		}



		answer.arr = difference;

		return answer;
	}

	public Big subtract(Long l){
		Big li = new Big(l);
        return this.subtract(li);
	}

	public Big subtract(String str){
		Big li = new Big(str);
        return this.subtract(li);
	}

	public Big multiply(Big li){
		int[] product = new int[length+li.length];
		int[] multiplicand = arr;
		int[] multiplier = li.arr;
		int i, j;
		Big answer = new Big();
		int carry = 0, carry2 = 0,x , l = 0 ,k ;

		answer.length = length+li.length;

		for(i = length-1; i>=0 ; i--){
			j =li.length-1;
			k = i+j+1;
			carry = 0;

			for(; j>=0 ; j--){
				x = multiplicand[i]*multiplier[j] + carry;
				carry = x/10; 

				l = product[k] + carry2;  
				l+=x%10;

				if(l/10>0){
					carry2 = l/10;
					l %=10;
				}else{
					carry2 = 0;
				}
				product[k] = l;
				k--;
				if(j==0){
					product[k] += (carry + carry2);
					carry2 = 0;
					carry = 0;
				}
			}
		}

		answer.arr = product;
		
        return answer;

	}

	public Big multiply(Long l){
		Big li = new Big(l);
        return this.multiply(li);
	}

	public Big multiply(String str){
		Big li = new Big(str);
        return this.subtract(li);
	}


	public Big divide(Big li){
		Big dividend = this;
		Big divisor  = li;
		Big ans = new Big();

		while((dividend.compare(divisor))==1||dividend.compare(divisor)==0){
			dividend = dividend.subtract(divisor);
			ans = ans.add("1");
		}

		return ans;
	}


	public Big divide(Long l){
		Big li = new Big(l);
        return this.divide(li);
	}

	public Big divide(String str){
		Big li = new Big(str);
        return this.divide(li);
	}

	public void zeroOut(){
		int ctr = 0 , i;
		length+=1;

		for(i = 0 ; i<length ; i++){
			ctr++;
			if(arr[i] != 0){
				for(int j =0 ;i<length;i++ ,j++)
					arr[j] = arr[i];
			}
		}

		length-=ctr;
		if(length == 0){
			length+=1;
		}
	}

	public int compare(Big num){
		this.zeroOut();
		num.zeroOut();
		if(length>num.length)
			return 1;
		else{
			if(num.length>length){
				return -1;
			}
			else{
				for(int x = 0 ; x < length ; x++){
					if(arr[x]>num.arr[x])
						return 1;
					else{
						return -1;
					}
				}
			}
			return 0;
		}

	}
	public String toString(){
		int i = 0;
		for(;arr[i] == 0 ; i++);
		if(i>=length)
			return "0";
		else{
			int [] arr2 = new int[length-i];
			System.arraycopy(arr,i,arr2,0,length-i);
			return Arrays.toString(arr2).replaceAll("[\\[\\]\\s,\\-]","");
		}
	}


}