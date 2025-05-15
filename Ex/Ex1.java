package Ex;

import javax.lang.model.element.Name;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        SinhVien s1= new SinhVien("A", "IT3", 3);
        s1.setSubjectScore(new float[]{8.5f, 8.7f, 9.0f});

        s1.print();

    }
}

class SinhVien{
    String name;
    String className;
    float CPA;
    float[] subjectScore;
    int n;

    public SinhVien() {
    }

    public SinhVien(String name, String className, int n) {
        this.name = name;
        this.className = className;
        this.n = n;
        this.subjectScore = new float[n];
    }

    public void setSubjectScore(float[] score){
        if (score.length != n){
            throw new IllegalArgumentException();
        }
        this.subjectScore = Arrays.copyOf(score, n);
    }

    public float getSubjectScore(int k){
        if (k< 0 || k > n){
            throw new IndexOutOfBoundsException();
        }
        return subjectScore[k];
    }

    public float CalAverScore(){
        float sum = 0;
        for (float s: subjectScore){
            sum += s;
        }
        this.CPA = (n>0) ? sum / n :0;
        return this.CPA;
    }

    public  int CompareByCPA(SinhVien another){
        float cpa1 = this.CalAverScore();
        float cpa2 = another.CalAverScore();

        return Float.compare(cpa1,cpa2);
    }

    public void print(){
        System.out.println(name);
        System.out.println(className);
        System.out.println(CalAverScore());
    }
}
