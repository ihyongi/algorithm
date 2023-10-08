package fastcampus.class01;

import java.util.HashMap;

public class LinearProbing2 {
    public Slot[] hashTable;
    public LinearProbing2(Integer size){
    this.hashTable = new Slot[size];
    }
    public class Slot{
        String key;
        String value;
        Slot(String key, String value){
            this.key = key;
            this.value = value;
        }
    }

    public int func(String key){
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        int address = this.func(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key == key) {
                this.hashTable[address].value = value;
                return true;
            }else{
                int curAddress = address + 1;
                while (this.hashTable[curAddress] != null) {
                    if (this.hashTable[curAddress].key == key) {
                        this.hashTable[curAddress].value = value;
                        return true;
                    }else{
                        curAddress ++;
                        if(curAddress >= this.hashTable.length){
                            return false;
                        }
                    }
                }
                this.hashTable[curAddress] = new Slot(key,value);
                return true;
            }
        }else{
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        int address = this.func(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key == key) {
                return this.hashTable[address].value;
            }else{
                int curAddress = address;
                while (this.hashTable[curAddress] != null) {
                    if (this.hashTable[curAddress] != null) {
                        return this.hashTable[curAddress].value;
                    }else{
                        curAddress ++;
                        if (curAddress >= this.hashTable.length){
                            return null;
                        }
                    }
                }
                return null;
            }
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        LinearProbing2 linearProbing = new LinearProbing2(20);
        linearProbing.saveData("DaveLee", "01022223333");
        linearProbing.saveData("fun-coding", "01033334444");
        linearProbing.saveData("David", "01044445555");
        linearProbing.saveData("Dave", "01055556666");
        System.out.println(linearProbing.getData("fun-coding"));

        HashMap<Integer, String> map1 = new HashMap();
        map1.put(1, "사과");
        map1.put(2, "바나나");
        map1.put(3, "포도");

        HashMap<String, String> map2 = new HashMap();
        map2.put("DaveLee", "01033334444");
        map2.put("Dave", "01032221111");
        map2.put("David", "0104445555");

        System.out.println(map1.get(2));
        System.out.println(map2.get("Dave"));
    }
}
