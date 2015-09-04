package training;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Array {

    public int[] a = new int[10];
    public String[] b = new String[10];
    public int[] c ={9, 2, 3, 3, 6};


    @Test
    public void main(){
        System.out.println(c[0]);
        System.out.println(c.length);
        Assert.assertEquals(c[0],9);
        for (int aa:a){
            a[aa]+=1;
            System.out.println(a[aa]);
        }

    }


}