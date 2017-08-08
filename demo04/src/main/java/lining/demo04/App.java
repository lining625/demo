package lining.demo04;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import lining.bean.Info;
import lining.mapper.InfoMapper;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Reader reader = null;
    	SqlSessionFactory sqlSessionFactory = null;
    	
    	try{
    		reader = Resources.getResourceAsReader("lining/config/config.xml");
        	sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    	SqlSession ss = sqlSessionFactory.openSession();
    	InfoMapper infoMapper = ss.getMapper(InfoMapper.class);
//    	//查询所有
//    	List<Info> infoList = infoMapper.queryInfos();
//    	for(Info info:infoList){
//    		System.out.println(info.getName());
//    		System.out.println(info.getIntro());
//    	}
//    	//精确查询
//    	Info info = infoMapper.queryInfo(2);
//    	System.out.println(info.getName());
//		System.out.println(info.getIntro());
    	
    	//插入
    	Info info = new Info();
    	info.setName("Bob");
    	info.setIntro("this is Bob");
    	infoMapper.insertInfo(info);
    	
    	ss.commit();
    	
    	List<Info> infoList = infoMapper.queryInfos();
    	for(Info inf:infoList){
    		System.out.println(inf.getName());
    		System.out.println(inf.getIntro());
    	}

    	
    	
    	
    	
    	
    	
    	
    	
    	
//    	Reader reader = null;
//    	SqlSessionFactory sqlSessionFactory = null;
//    	
//    	try{
//    		reader = Resources.getResourceAsReader("lining/config/config.xml");
//        	sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//    	}catch(Exception e){
//    		e.printStackTrace();
//    	}
//    	
//    	SqlSession ss = sqlSessionFactory.openSession();
//    	InfoMapper infoMapper = ss.getMapper(InfoMapper.class);
//    	List<Info> infoList = infoMapper.queryInfos();
//    	for(Info info:infoList){
//    		System.out.println(info.getName());
//    		System.out.println(info.getIntro());
//    	}

    	
    	
    }
}
