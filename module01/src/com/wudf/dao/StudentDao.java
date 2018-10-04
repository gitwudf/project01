package com.wudf.dao;

import com.wudf.entity.Student;

public interface StudentDao {
    /**
     * 添加学生
     * @param student
     * @return
     */
    Boolean addStudent(Student student);
}
