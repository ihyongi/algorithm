package fastcampus;

public class MyHash5 {

    public Slot[] hashTable;

    public MyHash5(Integer size){
        this.hashTable = new Slot[size];
    }

    public class Slot{
        String value;
        Slot(String value){
            this.value = value;
        }
    }

    public int func(String key){
        return (int)key.charAt(0) % this.hashTable.length;
    }

    public  boolean saveData(String key, String value){
        int address = this.func(key);
        if (this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        }else{
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key){
        int address = this.func(key);
        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        MyHash5 mainObject = new MyHash5(20);
        mainObject.saveData("DaveLee", "01022223333");
        mainObject.saveData("fun-coding", "01033334444");
        mainObject.getData("fun-coding"); //키값으로 가져옴


        //--충돌
        MyHash5 mainObject2 = new MyHash5(20);
        mainObject2.saveData("DaveLee", "01022223333"); //D
        mainObject2.saveData("fun-coding", "01033334444");
        mainObject2.saveData("David", "01044445555"); //D
        mainObject2.saveData("Dave", "01055556666"); //D
        mainObject2.getData("DaveLee");//D 충돌..!
    }
}
