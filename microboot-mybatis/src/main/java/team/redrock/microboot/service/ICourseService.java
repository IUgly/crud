package team.redrock.microboot.service;

import org.springframework.transaction.annotation.Transactional;
import team.redrock.microboot.vo.Course;
import team.redrock.microboot.vo.Student;

import java.util.List;

public interface ICourseService {
    @Transactional(readOnly = true)
    public List<Course> list(Course course);

    public boolean add(Course course);

    public boolean delete(Course course);
}
