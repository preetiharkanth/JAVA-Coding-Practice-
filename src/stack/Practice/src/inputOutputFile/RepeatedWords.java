package inputOutputFile;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class RepeatedWords {
	
	public HashMap<String,Integer> findRepeatedWords(String filename){
		FileInputStream file;
		DataInputStream reader;
		BufferedReader br = null;
		String line = null;
		HashMap<String,Integer> wordMap = new HashMap<String,Integer>();
		try{
			file = new FileInputStream(filename);
			reader = new DataInputStream(file);
			br = new BufferedReader(new InputStreamReader(reader));
			while((line = br.readLine()) != null){
				StringTokenizer strToken = new StringTokenizer(line, "");
				while(strToken.hasMoreTokens()){
					String temp = strToken.nextToken().toLowerCase();
					if(wordMap.containsKey(temp)){
						wordMap.put(temp, wordMap.get(temp)+1);
					}else{
						wordMap.put(temp, 1);
					}
				}
			}
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}finally{
			try{
				if(br != null){
					br.close();}
				}catch(Exception e){
					
				}
			}
		return wordMap;
		}
		
	//public List<HashMap<String,Integer>> sort()
	
	}


