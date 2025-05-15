import java.io.FileWriter;
import java.io.IOException;

public class OOPJVTH42 {
//    public static void main(String[] args) {
//        try {
//            FileWriter myWriter = new FileWriter("output.txt");
//            Agent a=new Agent();
//            int x=a.running(0, 1,1);
//            int y=a.running(1,1,1);
//            int z=a.running(1, 0,1);
//            myWriter.write(x+" "+y+" "+z);
//            myWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("output.txt");
            Agent a=new Agent();
            int x=a.running(0,1,0);
            int y=a.running(1,1,1);
            int z=a.running(1,0,1);
            myWriter.write(x+" "+y+" "+z);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class ConnectionError extends Exception{
    int source;
    int destination;
    public ConnectionError(int s,int d){
        //TODO 1
        this.source = s;
        this.destination = d;
    }
    public String getMessage(){
        //TODO 2
        return "connection error "+ source +" to "+ destination;
    }
}
class Agent {
    public void connecting(int source, int destination) throws ConnectionError {
        //TODO 3
        if (source == destination || destination == 0){
            throw new ConnectionError(source, destination);
        }

    }
    public int running(int source, int destination,int value){
        //TODO 4:
//        try{
//            connecting(source, destination);
//            return 0;
//        } catch (ConnectionError e) {
//            System.out.println(e.getMessage());
//            return 1;
//        }

//        c:
        try{
            connecting(source, destination);
            processing(value);
            return 0;
        }
        catch (ConnectionError e){
            e.printStackTrace();
            return  1;
        }
        catch (ArithmeticException ex){
            ex.printStackTrace();
            return 2;
        }

    }
    void processing(int value) throws ArithmeticException {
        if (value == 0){
            throw new ArithmeticException();
        }
    }
}
