package findTheDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifference {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
//		String s = "ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor";
//		String t = "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";
		
		String s = "vnarumubgspwiaeckgnxipnzrdynkioyjzngeytraihdxxtalsxtrtpezzwltqzibkxmikquogajuntmnmfnaukhbczbkalcgqqgxzrysnvqkclnzfkurw";
		String t = "qezltntnkeffirprqgtlzusdcxpmgqjtiyqzpsktuoarhkizrszbcxxmjgumiaucwnxukczwannakknkygxinwdbranxbmnrzgzgebqokahyivatyulnnvl";
		
//		String s = "";
//		String t = "y";
		System.out.println("result : " +solution.findTheDifference(s, t));
		System.out.println("result2 : " +solution.findTheDifference2(s, t));
		System.out.println("result3 : " +solution.findTheDifference3(s, t));
		
		
		
	}
}
class Solution{
	
	public char findTheDifference(String s, String t) {
		
		char[] arrS = new char[s.length()];
		char[] arrT = new char[t.length()];

		// 내부 함수로 이렇게 사용 가능
//		arrS = s.toCharArray();
//		arrT = t.toCharArray();
		if(t.length()<=1) {
			return t.charAt(0);
		}
		for(int i =0;i<s.length();i++) {
				arrS[i] = s.charAt(i);
				arrT[i] = t.charAt(i);
		}
		arrT[t.length()-1] = t.charAt(t.length()-1);
		
		Arrays.sort(arrS);
		Arrays.sort(arrT);
		
		int front =0;
		int end = arrT.length-1;
		for(;front<arrS.length;) {
			if(arrT[front]==arrS[front]) {
				front++;
			}else
				return arrT[front];
			if(arrT[end]==arrS[end-1]) {
				end--;
			}else
				return arrT[end];
		}
		return arrT[0];
	}
	
	public char findTheDifference3(String s, String t) {
		
		char[] arrS = new char[s.length()];
		char[] arrT = new char[t.length()];
		
		arrS = s.toCharArray();
		arrT = t.toCharArray();
		for(int i =0;i<s.length();i++) {
				arrS[i] = s.charAt(i);
				arrT[i] = t.charAt(i);
		}
		arrT[t.length()-1] = t.charAt(t.length()-1);
		Arrays.sort(arrS);
		Arrays.sort(arrT);
		for(char a : arrS) {
			System.out.print(a);
		}
		System.out.println();
		for(char a : arrT) {
			System.out.print(a);
		}
		System.out.println();
		for(int i =0; i < s.length(); i++) {
			if(arrS[i] != arrT[i]) {
				return arrT[i];
			}
		}
		return arrT[t.length()-1];
	}
	
	
	
	public char findTheDifference2(String s,String t) {
		
		String a = "";
		
		for(int i =0; i<s.length(); i++) {
			a = String.valueOf(s.charAt(i));
			t = t.replaceFirst(a, "0");
			
		}
		System.out.println(t);
		for(int i = 0; i < t.length();i++) {
			if(t.charAt(i)!='0') {
				return t.charAt(i);
			}
		}
		
		return ' ';
		
	}
	
}
