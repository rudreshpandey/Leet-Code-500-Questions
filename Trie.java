import java.util.Arrays;

import javax.swing.text.StyledEditorKit.BoldAction;

import sun.net.www.content.text.plain;
public class Trie {
	static class TrieNode{
		TrieNode[] childreTrieNode = new TrieNode[26];
		boolean isEndOfWord;
		TrieNode() {
			Arrays.fill(childreTrieNode,null);
			isEndOfWord = false;
	}
	static TrieNode rooTrieNode;
	
	static void insert(String key) {
		TrieNode tempNode = rooTrieNode;
		int length = key.length();
		for(int i=0;i<length;i++) {
			int index = key.charAt(i)-'a';
			if(tempNode.childreTrieNode[index]==null) tempNode.childreTrieNode[index] = new TrieNode();
			tempNode = tempNode.childreTrieNode[index];
		}
		tempNode.isEndOfWord = true;
	}
	static boolean search(String key) {
		TrieNode tempNode = rooTrieNode;
		int length = key.length();
		for(int i=0;i<length;i++) {
			int index = key.charAt(i)-'a';
			if(tempNode.childreTrieNode[index]==null) return false;
			tempNode = tempNode.childreTrieNode[index];
			final  StringBuilder gettingParentCategory = new StringBuilder("Select * from case_study where" +
	                "case_study_title like :case_study_title and" +
	                "case_study_status like :case_study_status");
	       // gettingParentCategory.append();
	        System.out.println(gettingParentCategory);
		}
		return tempNode.isEndOfWord;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                         "by", "bye", "their"};
       
        String output[] = {"Not present in trie", "Present in trie"};
        
       
        rooTrieNode = new TrieNode();
       
        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);
       
        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);
          
        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);
          
        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);
          
        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);
         
    }
	}
	
	
	

}
