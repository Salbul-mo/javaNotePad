package jeong_seok.object;

import java.util.StringJoiner;

public class Ex9_9 {
	
	public static void main(String[] args) {
		String animals = "dog,cat,bear"; //공백이 있으면 공백도 같이 들어간다.
		String[] arr = animals.split(",");
		//, 기준으로 잘라서 String 배열 만들고
		
		System.out.println(String.join("-", arr));
		// String.join(사이,String 배열)
		
		StringJoiner sj = new StringJoiner("/","[","]");
		// 사이,처음,끝 ?
		
		for(String s : arr)
			sj.add(s); 
//java.util.StringJoiner.add(CharSequence newElement)
//Adds a copy of the given CharSequence value as the nextelement of the StringJoiner value. 
//If newElement is null, then "null" is added.

		
		System.out.println(sj.toString());
	}

}
/*출력 결과
dog-cat-bear
[dog/cat/bear]
*/