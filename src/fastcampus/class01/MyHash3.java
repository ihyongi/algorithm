package fastcampus.class01;

public class MyHash3 {

    public Slot[] table;

    public MyHash3(Integer s){
        this.table = new Slot[s];
    }

    public class Slot{
        String val;
        Slot(String val){
            this.val = val;
        }
    }

    public int func(String key){
        return (int)(key.charAt(0)) % this.table.length;
    }

    public boolean save(String key, String val){
        Integer i = this.func(key);
        if (this.table[i] != null) {
            this.table[i].val = val;
        }else{
            this.table[i] = new Slot(val);
        }
        return true;
    }

    public String get(String key){
        int i = this.func(key);
        if (this.table[i] != null) {
            return this.table[i].val;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        MyHash3 mainObject = new MyHash3(20);
        mainObject.save("DaveLee", "01022223333");
        mainObject.save("fun-coding", "01033334444");
        mainObject.get("fun-coding"); //키값으로 가져옴


        //--충돌
        MyHash3 mainObject2 = new MyHash3(20);
        mainObject2.save("DaveLee", "01022223333"); //D
        mainObject2.save("fun-coding", "01033334444");
        mainObject2.save("David", "01044445555"); //D
        mainObject2.save("Dave", "01055556666"); //D
        mainObject2.get("DaveLee");//D 충돌..!

    }
}
