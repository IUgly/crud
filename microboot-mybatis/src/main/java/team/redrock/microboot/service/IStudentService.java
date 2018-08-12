package team.redrock.microboot.service;

import org.springframework.transaction.annotation.Transactional;
import team.redrock.microboot.vo.Student;

import java.beans.Transient;
import java.util.List;

public interface IStudentService {
    @Transactional(readOnly = true)
    public List<Student> list();
    @Transactional(readOnly = true)
    public Student SidByName(Student student);
}
