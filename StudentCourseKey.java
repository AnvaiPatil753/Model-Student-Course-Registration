package com.example.university.entity;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class StudentCourseKey {
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "course_id")
    private Long courseId;

    // Getters and Setters
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    // hashCode
    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        return result;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentCourseKey that = (StudentCourseKey) o;

        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        return courseId != null ? courseId.equals(that.courseId) : that.courseId == null;
    }
}
