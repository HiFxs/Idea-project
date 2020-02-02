package MAIN;

import bean.Employee;
import employeeinterface.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.test.context.TestConstructor;

import java.io.IOException;
import java.io.InputStream;

public class test {
    @Test
    public  void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession opensession=sqlSessionFactory.openSession();
        Employee employee=opensession.selectOne("org.mybatis.example.employeeinterface.EmployeeMapper.selectEmp",1);
        System.out.println(employee);
        opensession.close();
    }


    @Test
    public  void test1() throws  Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession opensession=sqlSessionFactory.openSession();

       try {
           EmployeeMapper mapper = opensession.getMapper(EmployeeMapper.class);
           Employee employee = mapper.getEmpById(1);
           System.out.println(employee);
       }finally {
           opensession.close();




       }
    }
}
