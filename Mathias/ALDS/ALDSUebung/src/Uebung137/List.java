package mypack.list;

public class List {

    private Element L[];
    private int size;
    private int nextIndex;
    
    public List(int size)
    {
        L=new Element[size];
        this.size=size;
        nextIndex=0;
    }
    
    public int getSize() {
        return size;
    }

    public boolean addElement(Element elem)
    {
        if(nextIndex<size)
        {   L[nextIndex]=elem;
            nextIndex++;
            return true;
        }
        return false;
    }
    
    public String toString()
    {   String s="";
        for(int i=0; i<nextIndex; i++)
        {
            s+=L[i]+"\n";
        }
        return s;
    }
    
    public void selectionSort(boolean aufsteigend) {

	
	
	
	
    }
    
    
}
