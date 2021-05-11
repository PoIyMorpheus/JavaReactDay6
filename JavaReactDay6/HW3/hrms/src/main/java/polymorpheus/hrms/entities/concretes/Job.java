package polymorpheus.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="JobRoles")
public class Job {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    public int id;

    @Column(name = "JobId")
    public int jobId;

    @Column(name = "JobName")
    public String jobName;


}
