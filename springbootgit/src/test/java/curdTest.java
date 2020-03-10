import com.rp.mall.MyApplication;
import com.rp.mall.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MyApplication.class)
@RunWith(SpringRunner.class)
public class curdTest {
    @Autowired
    MailService mailService;
    @Test
    public void demoTest(){
//        System.out.println("Hello World");
        mailService.sendSimpleMail("614523473@qq.com",
                "1513835615@qq.com",
                "m813502894@qq.com",
                "myx",
                "sb");
    }
}
