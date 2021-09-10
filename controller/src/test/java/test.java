import com.rick.dao.ItemMapper;
import com.rick.domain.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext*.xml"})
public class test {

    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void test01(){
        Item yasuo = itemMapper.findByName("yasuo");
        System.out.println(yasuo);
    }
    
    @Test
    public void test02(){
        int[] arr = {211,246,188,251,182,171,193, 214,163,172,211,246,188,251,184,252,186, 195,181,196,215,212,188,186};
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char) arr[i]);
        }
    }

}
