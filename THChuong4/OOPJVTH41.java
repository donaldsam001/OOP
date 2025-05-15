import java.io.FileWriter;
import java.io.IOException;

public class OOPJVTH41 {

//    public static void main(String[] args) {
//        Series<Integer> s = new Series(Integer.class, 2);
//        s.set(0, 2);
//        s.set(1, 3);
//        try {
//            FileWriter myWriter = new FileWriter("output.txt");
//            myWriter.write((s.get(0)+s.get(1))+"");
//            myWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



    public static void main(String[] args) {
        FloatSeries s = new FloatSeries(3);
        s.set(0, 2.4f);
        s.set(1, 3.3f);
        s.set(2,4.5f);
        try {
            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write(s.getSum()+"");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class Series<T> {

    T objs[];
    int size;
    public Series(Class<T> datatype, int size) {
        this.size = size;
        objs= (T[]) java.lang.reflect.Array.newInstance(datatype, size);
    }
    public T get(int index){
        return objs[index];
    }
    public void set(int index,T obj){
        objs[index]=obj;
    }
}

class FloatSeries extends Series<Float>{
    public FloatSeries(int size){
        super(Float.class, size);
    }
    public Float getSum(){
        Float s=0f;
//        Cach 1
//        for (Float e: this.objs){
//            s += e;
//        }
//
//        cach 2
        for (int i=0; i<this.size; i++){
            s += get(i);
        }
        return  s;

    }
}