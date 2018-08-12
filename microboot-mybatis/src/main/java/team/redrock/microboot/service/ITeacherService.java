package team.redrock.microboot.service;

import org.springframework.transaction.annotation.Transactional;
import team.redrock.microboot.vo.Teacher;

import java.util.List;

public interface ITeacherService {
    @Transactional(readOnly = true)
    public List<Teacher> list();
}
