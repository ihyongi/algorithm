package fastcampus.class01;

public class Chaining2 {

    public Slot[] hashTable;

    public Chaining2(Integer size){
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String key;
        String value;
        Slot next;

        Slot(String key, String value){
            this.key =key;
            this.value =value;
            this.next = null;
        }
    }

    public int func(String key){
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        int address = this.func(key);
        if (this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key ==key) {
                    findSlot.value = value;
                    return true;
                }else{
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next=new Slot(key, value);
        }else {
            this.hashTable[address] = new Slot(key,value);
        }
        return true;
    }

    public String getData(String key){
        int address = this.func(key);
        if (this.hashTable[address] !=null) {
            Slot findSlot = this.hashTable[address];
            while (findSlot != null) {
                if (findSlot.key == key) {
                    return findSlot.value;
                }else {
                    findSlot =findSlot.next;
                }
            }
            return null;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        Chaining2 chaining = new Chaining2(20);
        chaining.saveData("DaveLee", "01022223333");
        chaining.saveData("fun-coding", "01033334444");
        chaining.saveData("David", "01044445555");
        chaining.saveData("Dave", "01055556666");
        System.out.println("chaining = " + chaining.getData("Dave"));
    }
}
