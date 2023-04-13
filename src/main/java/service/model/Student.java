package service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.inject.Inject;
import jakarta.persistence.*;
@NamedQuery(name="Student.list",query = "SELECT s FROM Student s ")
@Entity
@Table(name = "STUDENT")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column
    String name;
    @Column
    String email;

    public Student(String name, String email){
        this.name=name;
        this.email=email;
    }
}
