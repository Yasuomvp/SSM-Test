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
public class test2 {

    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void test01(){
        Item yasuo = itemMapper.findByName("yasuo");
        System.out.println(yasuo);
    }

    public void test02(){

    }

}
