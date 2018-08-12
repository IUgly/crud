package team.redrock.microboot.service.impl;

import org.springframework.stereotype.Service;
import team.redrock.microboot.dao.ITeacherDAO;
import team.redrock.microboot.service.ITeacherService;
import team.redrock.microboot.vo.Teacher;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImp implements ITeacherService{
    @Resource
    private ITeacherDAO iTeacherDAO;
    @Override
    public List<Teacher> list() {
        return this.iTeacherDAO.findAll();
    }
}
