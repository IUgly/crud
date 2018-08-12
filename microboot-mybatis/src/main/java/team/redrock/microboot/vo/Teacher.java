package team.redrock.microboot.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Teacher implements Serializable {
    private Long tid;
    private String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
