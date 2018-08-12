package team.redrock.microboot.service.impl;

import org.springframework.stereotype.Service;
import team.redrock.microboot.dao.IStudentDAO;
import team.redrock.microboot.service.IStudentService;
import team.redrock.microboot.vo.Student;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImp implements IStudentService {
    @Resource
    private IStudentDAO iStudentDAO;
    @Override
    public List<Student> list() {
        return this.iStudentDAO.findAll();
    }

    @Override
    public Student SidByName(Student student) {
        return this.iStudentDAO.findIdByName(student);
    }
}
