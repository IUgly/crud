package team.redrock.microboot.dao;

import org.apache.ibatis.annotations.Mapper;
import team.redrock.microboot.vo.Student;

import java.util.List;

@Mapper
public interface IStudentDAO {
    public List<Student> findAll();
    public Student findIdByName(Student student);
}
