package springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.enhinck.SpringbootApplication;
import com.enhinck.demo.entity.App;
import com.enhinck.demo.repository.AppRepository;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
@Slf4j
public class MongoDbTest {
	@Autowired
	AppRepository appRepository;

	@Test
	public void test1() {
		App app = new App();
		app.setApiKey("111");
		//app.setId(new ObjectId("0x11"));
		appRepository.insert(app);
		
		App temp = appRepository.findOneByApiKey("111");
		
		log.info(temp.toString());
	}
	
	
}
