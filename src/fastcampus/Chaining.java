package fastcampus;

public class Chaining {
    public Slot[] hashTable;

    public Chaining(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String key; //체이닝 추가
        String value;
        Slot next;
        Slot(String key, String value) { //체이닝 추가
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) { //내부가 링크드리스트인경우
            Slot findSlot = this.hashTable[address]; //1.변수두개선언
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {//내가찾는 키값인지?
                    findSlot.value = value; //아 찾은 슬롯에 밸류 할당하고 끗
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value); //링크드리스트에없으니 새로 넣어주면된다
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address]; //링크드리스트를 순회하기위함
            while (findSlot != null) {
                if (findSlot.key == key) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null; //링크드리스트안에 없다
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Chaining chaining = new Chaining(20);
        chaining.saveData("DaveLee", "01022223333");
        chaining.saveData("fun-coding", "01033334444");
        chaining.saveData("David", "01044445555");
        chaining.saveData("Dave", "01055556666");
        System.out.println("chaining = " + chaining.getData("Dave"));
        System.out.println("chaining = " + chaining.getData("David"));
    }
}
