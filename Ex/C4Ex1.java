package Ex;

public class C4Ex1 {
    public static void main(String[] args) {
        Group<Integer> gr_int = new Group<>(Integer.class, 100);
        gr_int.addItem(10);
        gr_int.addItem(20);
        System.out.println(gr_int.getNumberItems());
        System.out.println(gr_int.getItem(0));

        Group<String> group_str=new Group<>(String.class,100);
        group_str.addItem("hihi");
        group_str.addItem("tingting2");
        System.out.println(group_str.getNumberItems());
        System.out.println(group_str.getItem(1));
    }
}

class Group<T>{
    T items[];// mảng lưu các phần tử trong nhóm
    int num;// số phần tử hiện tại trong nhóm

    public Group(Class<T>dataType, int length){
        this.items = (T[]) java.lang.reflect.Array.newInstance(dataType, length);
    }

    public void addItem(T t){
        if (num < items.length){
            items[num++] = t;
        }
        else{
            System.out.println("Full");
        }
    }

    public T getItem(int index){
        //TODO: lấy phần tử thứ index từ nhóm
        if (index < num && index >= 0){
            return this.items[index];
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getNumberItems(){
        //TODO: trả về số phần tử trong nhóm
        return this.num;
    }

}