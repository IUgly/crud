package team.redrock.microboot.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Course implements Serializable {
    private Long cid;
    private String name;
    private Long sid;
    private Long tid;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", sid=" + sid +
                ", tid=" + tid +
                '}';
    }
}
