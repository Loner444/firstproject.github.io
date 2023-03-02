package com.citsoft.pojo;

public class Student {
    private String id;
    private String name;
    private String grade;
    private String stuClass;
    private Integer cScore;
    private Integer javaScore;
    private Integer cppScore;
    private Integer totalScore;

    public Student() {
    }

    public Student(String id, String name, String grade, String stuClass, Integer cScore, Integer javaScore, Integer cppScore, Integer totalScore) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.stuClass = stuClass;
        this.cScore = cScore;
        this.javaScore = javaScore;
        this.cppScore = cppScore;
        this.totalScore = totalScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public Integer getcScore() {
        return cScore;
    }

    public void setcScore(Integer cScore) {
        this.cScore = cScore;
    }

    public Integer getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(Integer javaScore) {
        this.javaScore = javaScore;
    }

    public Integer getCppScore() {
        return cppScore;
    }

    public void setCppScore(Integer cppScore) {
        this.cppScore = cppScore;
    }

    public Integer getTotalScore() {
        return getcScore() + getJavaScore() + getCppScore();
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = getcScore() + getJavaScore() + getCppScore();
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号='" + id + '\'' +
                ", 姓名='" + name + '\'' +
                ", 年级='" + grade + '\'' +
                ", 班级='" + stuClass + '\'' +
                ", C语言成绩=" + cScore +
                ", java成绩=" + javaScore +
                ", cpp成绩=" + cppScore +
                ", 总分=" + totalScore +
                '}';
    }


}
