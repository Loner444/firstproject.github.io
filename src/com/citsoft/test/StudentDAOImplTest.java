package com.citsoft.test;

import com.citsoft.dao.StudentsDAO;
import com.citsoft.dao.impl.StudentDAOImpl;
import com.citsoft.pojo.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

class StudentDAOImplTest {

    StudentsDAO studentsDAO = new StudentDAOImpl();

    @Test
    void queryStudentByID() {
        Student student = (Student) studentsDAO.queryStudentByID("0001");
        if(student == null) {
            System.out.println("无查询结果，请检查学号输入是否有误");
        } else {
            System.out.println(student);
        }
    }

    @Test
    void saveStudent() {
        int res = studentsDAO.saveStudent(new Student("0001","张三","大二","软件1",77,88,99,0));
        if(res == -1) {
            System.out.println("失败");
        } else {
            System.out.println("成功");
        }
    }

    @Test
    void queryAllStudent() {
        String sql = "SELECT * FROM t_student";
        List<Student> list = studentsDAO.queryAllStudent();
        System.out.println(list);
    }

    @Test
    void deleteStudent() {
        int res = studentsDAO.deleteStudentByID("java");
        if(res == 1) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    @Test
    void updateStudent() {
        int res = studentsDAO.updateStudentByID(new Student("0001", "张三", "大二", "软件1", 77, 88, 99, 0));
        if(res == 1) {
            System.out.println("更改成功");
        }
    }
}