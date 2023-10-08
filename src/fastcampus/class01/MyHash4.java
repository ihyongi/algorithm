package fastcampus.class01;

public class MyHash4 {

    public Slot[] table;

    public MyHash4(Integer size){
        this.table = new Slot[size];
    }

    public class Slot{
        String value;
        Slot(String value){
            this.value = value;
        }
    }

    public int func(String key){
        return (int)(key.charAt(0)) % this.table.length;
    }

    public boolean save(String key, String value){
        int address = this.func(key);
        if (this.table[address] != null) {
            this.table[address].value = value;
        }else{
            this.table[address] = new Slot(value);
        }
        return true;
    }

    public String get(String key){
        int address = this.func(key);
        if (this.table[address] != null) {
            return this.table[address].value;
        }else{
            return null;
        }
    }
}
