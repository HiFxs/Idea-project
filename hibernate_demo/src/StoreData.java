import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;

public class StoreData {
    public static void main(String[] args) {
/**
        //creating configuration object  
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  

        //creating seession factory object  
        SessionFactory factory=cfg.buildSessionFactory();

        //creating session object  
        Session session=factory.openSession();

        //creating transaction object  
        Transaction t=session.beginTransaction();

        Employee e1=new Employee();
        e1.setId(100);
        e1.setFirstName("Max");
        e1.setLastName("Su");

        session.persist(e1);//persisting the object  

        t.commit();//transaction is committed  
        session.close();

        System.out.println("successfully saved");
*/

//Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
                .build();
        // 2. 根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        /**** 上面是配置准备，下面开始我们的数据库操作 ******/
      Session session=sessionFactory.openSession();//从会话工厂中开启一个会话
        Transaction t=session.beginTransaction();
        Employee e=new Employee();
        e.setId(990);
        e.setFirstName("MARK");
        e.setLastName("loh");

        session.persist(e);
        t.commit();
        session.close();
        System.out.print("Successfully saved!");








    }
}