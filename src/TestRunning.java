import com.test.medium.CountAndSay;
import com.test.simple.BackContentNumber;
import com.test.simple.FindLucky;
import com.test.simple.SearchInsert;
import com.test.simple.RemoveDuplicates;

public class TestRunning {
    public static void main(String[] args) {
        System.out.println("常言道：一日不学十日空。");
        FindLucky test01 = new FindLucky();
        int [] nowArr = { 1,1,3 };
        System.out.println( test01.findLucky(nowArr) );

    }
}
