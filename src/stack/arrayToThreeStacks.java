package stack;

public class arrayToThreeStacks {
	
        int[] arr;
        int size;
        int[] topPointers={-1,-1,-1};
         
    arrayToThreeStacks(){
    arr=new int[300];
    this.size=100;
    }
    arrayToThreeStacks(int size){
    arr=new int[size*3];
    this.size=size;
    }
 
 
 
 
    void push(int item, int stackNumber) throws Exception{
    int index=stackNumber-1;//for stack #1, index is 0,ect…
    if(index<1||index>3) throw new Exception("Error input. Range of stackNumber is [1,3]");
    int pointer=topPointers[index]+(stackNumber-1)*size; 
    if(topPointers[index]+1>=size) throw new Exception("Out of space.");
    topPointers[index]++;
    arr[pointer]=item;
    }
 
 
 
 
    Object pop(int stackNumber) throws Exception{
    int index=stackNumber-1;//for stack #1, index is 0,ect…
    if(index<1||index>3) throw new Exception("Error input. Range of stackNumber is [1,3]");
    int pointer=topPointers[index]+(stackNumber-1)*size; 
    if(topPointers[index]==-1) throw new Exception("The stack is empty");
    topPointers[index]--;
    int item= arr[pointer];
    arr[pointer]=0;//clear
    return item;
    }
 
 
 
 
    Object peek(int stackNumber) throws Exception{
    int index=stackNumber-1;//for stack #1, index is 0,ect…
    if(index<1||index>3) throw new Exception("Error input. Range of stackNumber is [1,3]");
    int pointer=topPointers[index]+(stackNumber-1)*size; 
    if(topPointers[index]==-1) throw new Exception("The stack is empty");
    int item= arr[pointer];
    return item;
    }
 
 
 
 
    boolean isEmpty(int stackNumber){
    return (topPointers[stackNumber-1]==-1); 
    }
    

}
