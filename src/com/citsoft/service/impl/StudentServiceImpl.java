package com.citsoft.service.impl;

import com.citsoft.dao.StudentsDAO;
import com.citsoft.dao.impl.StudentDAOImpl;
import com.citsoft.pojo.Student;
import com.citsoft.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentsDAO studentsDAO = new StudentDAOImpl();

    @Override
    public List<Student> Students() {
        return studentsDAO.queryAllStudent();
    }

    @Override
    public boolean addStudent(Student student) {
        int res = studentsDAO.saveStudent(student);
        if(res == -1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean delStudent(String id) {
        int res = studentsDAO.deleteStudentByID(id);
        if(res == 1) {
            System.out.println("删除成功");
            return true;
        } else {
            System.out.println("删除失败");
            return false;
        }
    }

    @Override
    public boolean updateStudent(Student student) {
        int res = studentsDAO.updateStudentByID(student);
        if(res == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Student queryStudent(String id) {
        return (Student) studentsDAO.queryStudentByID(id);
    }
}
