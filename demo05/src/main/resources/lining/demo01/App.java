package lining.demo01;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lining.bean.Info;
import lining.service.InfoService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ac =new ClassPathXmlApplicationContext("application.xml");
        //InfoService info=aac.getBean("001",InfoService.class);
        ////info.sayHello();
    	InfoService is=ac.getBean("ds03",InfoService.class);
    	Info info=new Info();
    	info.setName("Jim");
    	info.setIntro("This is Jim");
    	is.insert(info);
    	
    	info.setName("aaaaa");
    	info.setIntro("This is aaaa");
    	is.insert(info);
    	
    	info.setId(1);
    	is.delete(info.getId());
    	
    	info.setId(1);
    	info.setName("Tom");
    	info.setIntro("This is Tom");
    	is.update(info);
    
    	
    	InfoService ds3=ac.getBean("ds03",InfoService.class);
    	List<Info> infList=ds3.getInfo(0);
    	for(Info i:infList) {
    		System.out.println(i.getId()+"  "+i.getName()+"  "+i.getIntro());
    	}
    	
    	ac.close();
        
      //  System.out.println( "Hello World!" );
    	
    	
    	
    }
}
