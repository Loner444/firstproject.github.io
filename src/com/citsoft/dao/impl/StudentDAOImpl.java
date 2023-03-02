package com.citsoft.dao.impl;

import com.citsoft.dao.StudentsDAO;
import com.citsoft.pojo.Student;

import java.util.List;

public class StudentDAOImpl extends BaseDAO implements StudentsDAO {
    @Override
    public Object queryStudentByID(String id) {
        String sql = "select * from t_student where id = ? ";//
        return queryForOne(sql,Student.class,id);
    }

    @Override
    public int saveStudent(Student student) {
        String sql = "INSERT INTO t_student VALUES(?,?,?,?,?,?,?,NULL)";
        return update(sql,student.getId(),student.getName(),student.getGrade(),student.getStuClass(),student.getcScore(),
                student.getJavaScore(),student.getCppScore());
    }

    @Override
    public List<Student> queryAllStudent() {
        List<Student> students = queryStudent();
        return students;
    }

    @Override
    public int deleteStudentByID(String id) {
        String sql = "DELETE FROM t_student WHERE id = '" + id + "'";
        return update(sql);
    }

    @Override
    public int updateStudentByID(Student student) {
        String sql = "UPDATE t_student SET NAME = ?,grade = ?,stuClass = ?,cScore = ?,javaScore = ?,cppScore = ? WHERE id = ?";
        return update(sql,student.getName(),student.getGrade(),student.getStuClass(),student.getcScore(),
                student.getJavaScore(),student.getCppScore(),student.getId());
    }
}
