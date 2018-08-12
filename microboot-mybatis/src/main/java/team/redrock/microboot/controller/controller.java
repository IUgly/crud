package team.redrock.microboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import team.redrock.microboot.service.ICourseService;
import team.redrock.microboot.service.IStudentService;
import team.redrock.microboot.service.ITeacherService;
import team.redrock.microboot.util.controller.AbstractBaseController;
import team.redrock.microboot.vo.Course;
import team.redrock.microboot.vo.Student;
import team.redrock.microboot.vo.Teacher;

import javax.annotation.Resource;
import java.util.ArrayList;
import com.alibaba.fastjson.JSON;
import java.util.List;

@Controller
public class controller extends AbstractBaseController {
    @Resource
    private IStudentService iStudentService;

    @Resource
    private ITeacherService iTeacherService;

    @Resource
    private ICourseService iCourseService;
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "test";
    }
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public Object index(){
        return "index";
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Object stuList(Model model){
        List<Student> allMembers = this.iStudentService.list();
        model.addAttribute("allMembers", allMembers);
        return "student_show";
    }
    @RequestMapping(value = "/teacher", method = RequestMethod.GET)
    public Object teaList(Model model){
        List<Teacher> allMembers = this.iTeacherService.list();
        model.addAttribute("allMembers", allMembers);
        return "teacher_show";
    }
    @ResponseBody
    @RequestMapping(value = "/course")
    public String courseList(Student student){
        Course course = new Course();
        course.setSid(iStudentService.SidByName(student).getSid());
        List<Course> allCourse = this.iCourseService.list(course);
        String result = JSON.toJSONString(allCourse);
        return result;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addCourse(Course course){
        if (iCourseService.add(course)){
            return "success";
        }
        return "fail";
    }
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody Course course){
        if (iCourseService.delete(course)){
            return "success";
        }
        return "fail";
    }
}
