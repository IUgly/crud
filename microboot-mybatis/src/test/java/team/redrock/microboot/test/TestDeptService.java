package team.redrock.microboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import team.redrock.microboot.StartSpringBootMain;
import team.redrock.microboot.service.ICourseService;
import team.redrock.microboot.service.IStudentService;
import team.redrock.microboot.vo.Course;
import team.redrock.microboot.vo.Student;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDeptService {
    @Resource
    private IStudentService iStudentService;
    @Resource
    private ICourseService iCourseService;
    @Test
    public void testAdd() throws Exception {
        Course course = new Course();
        Long l = new Long((long)4);
        course.setSid(l);
        course.setCid(l);

        boolean a = iCourseService.delete(course);

        System.out.println(a);
    }
}
