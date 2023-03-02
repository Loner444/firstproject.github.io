package com.citsoft.test;

import com.citsoft.pojo.Student;
import com.citsoft.service.StudentService;
import com.citsoft.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

    StudentService service = new StudentServiceImpl();

    @Test
    void students() {
        List<Student> students = service.Students();
        System.out.println(students);
    }

    @Test
    void addStudent() {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("软件");
        list2.add("数据");
        list2.add("计科");

        list1.add("大一");
        list1.add("大二");
        list1.add("大三");
        list1.add("大四");

        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("孙七");
        Random random = new Random();
        int i = (int)(Math.random()*100+1);
        System.out.println(i);
        System.out.println(list.get(random.nextInt(list.size())));
        for (int j = 10; j < 100; j++) {
            service.addStudent(new Student("1000" + j,list.get(random.nextInt(list.size())) + (int)(Math.random()*9+1),list1.get(random.nextInt(list1.size())),
                    list2.get(random.nextInt(list2.size())) + (int)(Math.random()*3+1),
                    (int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),0));
        }
        //service.addStudent(new Student("0005","王五","大三","软件2",90,66,50,0));
    }

    @Test
    void delStudent() {
        service.delStudent("1234");
    }

    @Test
    void updateStudent() {
        service.updateStudent(new Student("0005","asd","大三","软件2",90,66,50,0));
    }

    @Test
    void query() {
        Student student = service.queryStudent("0004");
        System.out.println(student);
    }
}