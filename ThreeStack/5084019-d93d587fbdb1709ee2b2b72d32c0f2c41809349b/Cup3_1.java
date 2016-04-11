//Cup 3.1
public class OneArrayThreeStack {
  	int stackSize = 5;
		String[] array = new String[stackSize * 3];
		int position;
		int[] points = {0, 0, 0};
		
		void push(int stackNum, String value) {
			position = stackNum * stackSize + points[stackNum];
			points[stackNum]++;
			array[position] = value;
		}
		
		String pop(int stackNum) {
			position = stackNum * stackSize + points[stackNum] - 1;
			points[stackNum]--;
			if (points[stackNum] == -1)  return "stack" + stackNum + " is empty";
			else return array[position];
		}
	}
	
	@Test
	public void test3_1() {
		OneArrayThreeStack s = new OneArrayThreeStack();
		s.push(0, "12");
		s.push(0, "13");
		s.push(0, "14");
		System.out.println(s.pop(0));
		System.out.println(s.pop(0));
		System.out.println(s.pop(0));
		System.out.println(s.pop(0));
	}