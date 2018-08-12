package team.redrock.microboot.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable {
    private Long sid;
    private String name;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
