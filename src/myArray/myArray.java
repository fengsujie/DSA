package myArray;

public class myArray {
private int[] items;
int currentIndex;

public myArray(int initialize){
    this.items = new int[initialize];
}

public void insert(int value){
    this.items[currentIndex]=value;
    currentIndex++;
}

    public String toString() {
        StringBuilder str = new StringBuilder("[");

        for (int i = 0; i < currentIndex; i++) {
            str.append(items[i]);
            if (i < currentIndex-1) {
                str.append(", ");
            }
        }

        str.append("]");
        return str.toString();
    }
}
