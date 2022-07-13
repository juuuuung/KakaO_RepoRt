package problems;

public class ArrayList {

	public static void main(String[] args) {
		list ar = new list();
		for (int i = 1; i <= 100; i++)
			ar.add(i);

		ar.get(2);
		ar.add(30, 5);
		System.out.println(ar.size());
		ar.remove(10);
		
		for (int i = 0; i < ar.lastIndex; i++) {
			System.out.println(ar.datas[i]);
		}

	}

}

class list {
	int lastIndex = 0;
	int[] datas = new int[3];

	// 부족한 배열 늘리기
	void None_Repeat() {
		if (lastIndex >= datas.length) {
			int[] more = new int[datas.length * 2];

			for (int i = 0; i < datas.length; i++)
				more[i] = datas[i];

			datas = more;
		}
	}

	// add(int data)
	void add(int data) {
		None_Repeat();
		datas[lastIndex] = data;
		lastIndex++;
	}

//	add(int data, int index)
	void add(int data, int index) {
		None_Repeat();
		for (int i = lastIndex; i >= index; i--) {
			datas[i] = datas[i - 1];
		}
		datas[index] = data;
	}

//	get()
	int get(int num) {
		return datas[num];
	}

//	size()
	int size() {
		return lastIndex;
	}

//	remove()
	void remove(int index) {
		if (index < lastIndex) {
			for (int i = index; i <= lastIndex; i++) {
				datas[i] = datas[i + 1];
			}
			lastIndex--;
		} else
			System.out.println("error");

	}

}