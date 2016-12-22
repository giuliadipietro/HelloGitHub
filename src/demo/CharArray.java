package demo;

public class CharArray {
	
	private char[] characterList; 
	int positionInArray = 0;
	
	public CharArray(char[] param) {
		this.characterList = param;
	}
	
	public void print() {
		for (positionInArray  = 0; positionInArray  < characterList.length; positionInArray ++ ) {
			System.out.println(characterList[positionInArray]);
			System.out.println();
		}
	}
//
//	public void print(int start, int end){
//		if (start = 0 || end > start || end = characterList.length){
//			for (positionInArray = start; positionInArray < end; positionInArray++){
//			System.out.println(characterList[positionInArray]);
//			System.out.println();
//			}
//		}
	}
	
//}
