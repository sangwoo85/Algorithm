package lastStoneWeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * We have a collection of rocks, each rock has a positive integer weight.

	Each turn, we choose the two heaviest rocks and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
	
	If x == y, both stones are totally destroyed;
	If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
	At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
	
	우리를 돌 컬렉션을 가지고 있고 그 돌들은 양의 정수의 무게를 가지고 있다.
	
	매턴 우리는 2개의 무거운 돌들 서로 부딪친다. 
	
	그 두돌을 x 와 y와 가정 하에  x<=y  이다.
	부딪친 결과  만일
	x 와 y 가 같다면  전체 파괴됨
	x 와 y가 다르다면 x가 파괴됨 그리고 y돌의 무게는 y-x가 된다.
	
	결국 1개의 돌만 남아있다. 그 돌의 무게를 리턴 하거나  돌이 없을 경우 0을 리턴 하시오
	
 *
 */

public class LastStoneWeight {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		int[] stones = {2,7,4,1,8,1};
		
		System.out.println("result : "+solution.lastStoneWeight(stones));
	}
	
}
class Solution{
	
	public int lastStoneWeight(int[] stones) {
		
		
		if(stones.length<2) {
			return stones[0];
		}
		
		List<Integer> list = new ArrayList<Integer>(stones.length);
		
		for(int a : stones) {
			list.add(a);
		}
		
		int one = 0;
		int oneidx = 0;
		int two = 0;
		int twoidx = 0;
		while(list.size()>1) {
			one = 0;
			two = 0;
			System.out.println("list.size"+list.size());
			for(int j =0;j < list.size();j++) {
				if(two <= list.get(j)) {
					if(one<=list.get(j)) {
						two = one;
						twoidx = oneidx;
						one = list.get(j);
						oneidx = j;
						System.out.println("oneidx"+oneidx+" : twoidx : "+twoidx);
					}else {
						two = list.get(j);
						twoidx = j;
					}
				}
			}
			System.out.println("one : "+one+"  two : "+two);
			System.out.println("oneidx T : "+oneidx+"  twoidx T : "+twoidx);
			if(one!=two) {
				if(one>two) {
				list.remove(oneidx);
				list.remove(twoidx);
				list.add((one-two));
				}else {
					list.remove(twoidx);
					list.remove(oneidx);
					list.add((one-two));
						
				}
				
			}else {
				list.remove(oneidx);
				list.remove(twoidx);
			}
			
		}
		
		if(list.size()>0){
            return list.get(0);
        }else
            return 0;	
	}
	public int lastStoneWeight2(int[] stones) {
		
		int length = 0;
		int x = 0,	y =0;
		while(length>1) {
			
			for(int i=0; i<length;i++) {
				if(x<=stones[i]) {
					if(y<=stones[i]) {
						x = y;
						y = stones[i];
					}else {
						x = stones[i];
					}
				}
			}
			
			if(x != y) {
				
			}
			
			
			
		}
		
		return 0;
	}
	public int[] removeLength(int[] arr,int n) {
		int[] tmp  = new int[arr.length-n];
		for(int i =0; i < (arr.length-n); i++) {
			tmp[i] = arr[i];
		}
		return tmp;
	}
}