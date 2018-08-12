package team.redrock.microboot.dao;

import org.apache.ibatis.annotations.Mapper;
import team.redrock.microboot.vo.Course;
import team.redrock.microboot.vo.Student;

import java.util.List;

@Mapper
public interface ICourseDAO {
    /**
     * 通过学生id找到学生所修课程
     *
     * @param course 课程对象
     * @return List
     */
    public List<Course> findCourseBySID(Course course);

    /**
     * 通过学生id增加其所修课程
     *
     * @param course 课程vo
     * @return List
     */
    public boolean addCourseBySID(Course course);

    /**
     * 通过学生id和课程id删除学生所修课程
     *
     * @param course 课程对象
     * @return List
     */
    public boolean deleteCourseBySID(Course course);

}
