package com.citsoft.dao;

import com.citsoft.pojo.Student;

import java.util.List;

public interface StudentsDAO {
    /**
     * 根据学号查询学生信息
     * @param id
     * @return  若返回为null则说明学生不存在
     */
    public Object queryStudentByID(String id);

    /**
     * 保存学生信息
     * @param student
     * @return 返回-1则说明保存失败
     */
    public int saveStudent(Student student);

    /**
     * 查询所有学生
     * @return
     */
    public List<Student> queryAllStudent();

    /**
     * 根据学号删除学生信息
     * @param id
     * @return 如果返回1则说明删除成功
     */
    public int deleteStudentByID(String id);

    /**
     * 根据学号更新学生信息
     * @param student
     * @return 返回改变行数,0则说明不变
     */
    public int updateStudentByID(Student student);
}
