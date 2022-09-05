import java.util.HashMap;

public class LinearProbing {
    public Slot[] hashTable;

    public LinearProbing(Integer size) {
        this.hashTable = new Slot[ size];
    }

    public class Slot {
        String key;
        String value;
        Slot(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key == key) {
                this.hashTable[address].value = value;
                return true;
            } else {
                Integer currAddress = address + 1; //주소값 한칸씩이동
                while (this.hashTable[currAddress] != null) { //다음슬롯이있냐?
                    if (this.hashTable[currAddress].key == key) { //있으면 내가 찾는값이냐?
                        this.hashTable[currAddress].value = value;
                        return true;
                    } else {
                        currAddress++;//주소를 다음슬롯으로 이동
                        if (currAddress >= this.hashTable.length) { //맨끝이면?? false 실패
                            return false;
                        }
                    }
                }
                this.hashTable[currAddress] = new Slot(key, value);
                return true;
            }
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            if (this.hashTable[address].key == key) {
                return this.hashTable[address].value;
            } else {
                // 참고: 다음 코드를 수정합니다.
                // Integer currAddress = address + 1;
                // 예외 케이스로, 키에 해당하는 주소가 가장 마지막 슬롯일 경우,
                // this.hashTable[address + 1] 에 해당하는 배열은 없기 때문에,
                // 예외 케이스에서도 동작하도록 currAddress 는 address 만 대입하고 진행합니다
                Integer currAddress = address; // 수정
                while (this.hashTable[currAddress] != null) {
                    if (this.hashTable[currAddress].key == key) {
                        return this.hashTable[currAddress].value;
                    } else {
                        currAddress++;
                        if (currAddress >= this.hashTable.length) {
                            return null;
                        }
                    }
                }
                return null;
            }
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        LinearProbing linearProbing = new LinearProbing(20);
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
