package com.citsoft.service;

import com.citsoft.pojo.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询所有学生
     * @return
     */
    public List<Student> Students();

    /**
     * 增加学生信息
     * @param student
     */
    public boolean addStudent(Student student);

    /**
     * 删除学生信息
     * @param id
     */
    public boolean delStudent(String id);

    /**
     * 更新学生信息
     * @param student
     */
    public boolean updateStudent(Student student);

    /**
     * 查询学生信息
     * @param id
     * @return
     */
    public Student queryStudent(String id);
}
