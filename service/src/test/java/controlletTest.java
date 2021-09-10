import com.rick.domain.Item;
import com.rick.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext-service.xml")
public class controlletTest {

    @Autowired
    private ItemService itemService;

    @Test
    public void testC(){
        Item item = itemService.findByName("Yasuo");
        System.out.println(item);
    }

}
