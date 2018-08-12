package team.redrock.microboot.dao;

import org.apache.ibatis.annotations.Mapper;
import team.redrock.microboot.vo.Teacher;

import java.util.List;

@Mapper
public interface ITeacherDAO {
    public List<Teacher> findAll();
}
