package fastcampus.class01;

public class MyHash_11 {
    public Slot[] hashTable;

    public MyHash_11(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String value;
        Slot(String value) {
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length; //키를 받아서 해쉬테이블의 개수로 나눠서 나머지가져옴,,사이즈-1까지의 값을 가지게됨
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        MyHash_11 mainObject = new MyHash_11(20);
        mainObject.saveData("DaveLee", "01022223333");
        mainObject.saveData("fun-coding", "01033334444");
        mainObject.getData("fun-coding"); //키값으로 가져옴


        //--충돌
        MyHash_11 mainObject2 = new MyHash_11(20);
        mainObject2.saveData("DaveLee", "01022223333"); //D
        mainObject2.saveData("fun-coding", "01033334444");
        mainObject2.saveData("David", "01044445555"); //D
        mainObject2.saveData("Dave", "01055556666"); //D
        mainObject2.getData("DaveLee");//D 충돌..!



    }
}
