package mypack.list;

public class List {

	private Element L[];
	private int size;
	private int nextIndex;

	public List(int size) {
		L = new Element[size];
		this.size = size;
		nextIndex = 0;
	}

	public int getSize() {
		return size;
	}

	public boolean addElement(Element elem) {
		if (nextIndex < size) {
			L[nextIndex] = elem;
			nextIndex++;
			return true;
		}
		return false;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < nextIndex; i++) {
			s += L[i] + "\n";
		}
		return s;
	}

	public void selectionSort(boolean aufsteigend) {
		int pos = 0;
		Element tmp = null;
		for (int j = 0; j < L.length-1; j++) {
			pos = j;
			for (int i = j+1; i < L.length; i++) {
				
				if (aufsteigend == true && L[i].compareTo(L[pos]) < 0) {
					pos = i;
				}
				if (aufsteigend == false && L[i].compareTo(L[pos]) > 0) {
					pos = i;
				}
				
			}
			tmp = L[pos];
			L[pos] = L[j];
			L[j] = tmp;
		}

	}

	public void insertionSort(boolean aufsteigend) {
		Element tmp;
		for (int i = 1; i < L.length; i++) {
			int j = i;
			tmp = L[i];
			while (j > 0 && aufsteigend == true && tmp.compareTo(L[j - 1]) < 0) {
				L[j] = L[j - 1];
				j--;
			}
			while (j > 0 && aufsteigend == false && tmp.compareTo(L[j - 1]) > 0) {
				L[j] = L[j - 1];
				j--;
			}
			L[j] = tmp;
		}

	}

	public void bubbleSort(boolean aufsteigend) {
		int pos;
		Element tmp;
		for (int i = L.length; i > 0; i--) {
			pos = 0;
			while (pos < i && aufsteigend == true && L[pos].compareTo(L[pos + 1]) < 0) {
				tmp = L[pos];
				L[pos] = L[pos + 1];
				L[pos + 1] = tmp;
			}
			while (pos < i && aufsteigend == false && L[pos].compareTo(L[pos + 1]) > 0) {
				tmp = L[pos];
				L[pos] = L[pos + 1];
				L[pos + 1] = tmp;
			}
		}
	}

}
