package team.redrock.microboot.service.impl;

import org.springframework.stereotype.Service;
import team.redrock.microboot.dao.ICourseDAO;
import team.redrock.microboot.service.ICourseService;
import team.redrock.microboot.vo.Course;
import team.redrock.microboot.vo.Student;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImp implements ICourseService{
    @Resource
    private ICourseDAO iCourseDAO;
    @Override
    public List<Course> list(Course course) {
        return this.iCourseDAO.findCourseBySID(course);
    }

    @Override
    public boolean add(Course course) {
        return this.iCourseDAO.addCourseBySID(course);
    }

    @Override
    public boolean delete(Course course) {
        return this.iCourseDAO.deleteCourseBySID(course);
    }
}
