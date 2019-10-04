package countPrimes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CountPrimes {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int n = 100;

		System.out.println("result : " + solution.countPrimes6(n));

	}
}

class Solution {

	public int countPrimes(int n) {

		int count = 0;

		for (int i = 1; i < n; i++) {

			if ((i % 2 == 0 && i != 2) || (i % 3 == 0 && i != 3) || (i % 5 == 0 && i != 5) || (i % 7 == 0 && i != 7)
					|| (i % 13 == 0 && i != 13) || i == 1) {

			} else {
				System.out.println(i);
				count++;
			}
		}
		return count;

	}

	// 소수들을 담아서 그 소수들과 비교해서 나누어 지는지도 확인
	public int countPrimes2(int n) {

		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(2);
		int num = 0;
		if (n < 2) {
			return 0;
		}
		for (int i = 2; i < n; i++) {
			Iterator<Integer> it = hash.iterator();
			while (it.hasNext()) {
				num = it.next();
				if ((i % 2 == 0 && i != 2) || (i % 3 == 0 && i != 3) || (i % 7 == 0 && i != 7)
						|| (i % 5 == 0 && i != 5)) {
					break;
				} else if (i % num == 0 && i != num) {
//					System.out.println(" no match : "+i + " list : "+num);
					break;
				} else if (it.hasNext() == false) {
					System.out.println(i);
					hash.add(i);
					break;
				}
			}
		}
		return hash.size();
	}

	public int countPrimes3(int n) {
        
    	boolean check= true;

        List<Integer> list = new ArrayList<Integer>();
        
        for(int i =2; i < n; i++) {
			check = true;
			if((i%2==0 && i!=2) || (i%3==0 && i!=3) ) {
				check = false;
				continue;
			}else if((i %7==0 && i != 7) || ( i%5==0  && i != 5)) {
				check = false;
				continue;
			}else if((i %11==0 && i != 11) || (i %13 ==0 && i != 13)) {
				check = false;
				continue;
			}
			else {
				for(int j =5; j < list.size(); j++) {
					if(list.get(j) < i/2) {		
						if(i%list.get(j)==0 && i!= list.get(j)) {
							check = false;
							break;
						}else if(list.get(j) > i/2){
							break;
						}
					}
				}
			}	
			if(check) {
				list.add(i);
				System.out.println(i);
			}
        }
		return list.size();
	}
	
public int countPrimes4(int n) {
        
    	boolean check= true;
    	int listNum = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i =2; i < n; i++) {
			check = true;
			
			if(i %2 ==0 && i != 2) {
				continue;
			}else if((i %3 ==0 && i != 3)){
				continue;
			}else {
				for(int j =2; j < list.size(); j++) {
					listNum = list.get(j);
					if(listNum < i/2+1) {		
						if(i%listNum==0) {
							check = false;
							break;
						}
					}else {
						break;
					}
				}
			}
			if(check) {
				list.add(i);
				System.out.println(i);
			}
        }
		return list.size();
	}

// qq - how to find prime no ? a number which is only divided by 1 & its own is prime -
// lets try brute force: TIME O(N^2)

public static int countPrimes5(int n) {
	int count = 0;
	if(n == 0) {
		
		return 0;
	}
	if(n <=2) {
		return 0;
	}
	for(int i = 2; i < n ; i++) {
		if(isPrime(i)) {
			count++;
		}
	}
	return count;
}
private static boolean isPrime(int n) {
	for(int i = 2; i < n ; i++) {
		if(n % i == 0) {
			return false;
		}
	}
	return true;
}
// more advanced technique :
// you definitely need some caching ; so define a array of prime
// now if you think - 18 is prime or not
// 2* 9 , 3*6 , 6*3 , 9*2 but in that case isPrime function why to loop all ?
// because 3*6 and 6*3 are same.. then just check upto sqrt(18) upto 4
// but sqrt is costly so use i*i < n ; it will improve run time
// and as per Sieve of Eratosthenes  algo, just mark all mutiples of number in array
// time - O(nlogn) and Space - O(n)
		
		public  int countPrimes6(int n) {
			// define the prime Array
			boolean[] isPrime = new boolean[n];
			// 0 and 1 are not prime
			// so initializing the array from 2 as true;
			for(int i = 2 ; i < n ; i++) {
				isPrime[i] = true;
			}
			for(int i = 2; i*i < n; i++) {
				// 0 and 1 is not prime
				// 2 is prime, 3 is prime but 2 and 3 is multiplications are not.
				// check if 2 is prime or not or i number is prime or not. if it is not prime 
				// then why to mark its multiplication as fasle ? don;t do anything thats why
				// just continue; example 4 which is already false;
				if(! isPrime[i]) {
					continue;
				}
				// mark all multiplications as false; and it starts from 3*3 or 2*2 right then +3/+2
				// for(j = i; i*j <n ; j++)
			/*	for(int j = i*i ; j < n; j += i) {
					isPrime[j] = false;
				}*/
				for(int j = i ; i*j < n ;j++) {
					System.out.println(i*j);
					isPrime[i*j] = false;
				}
			}
			int count = 0;
			for(int i = 2; i < n; i++) {
				if(isPrime[i]) {
					count++;
				}
			}
			return count;
		}
	
}
