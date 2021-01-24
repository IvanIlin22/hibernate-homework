package ru.hh.school.entity;

//TODO: оформите entity

import javax.persistence.*;

//@Entity(name = "area")
@Entity
@Table(name = "area")
public class Area {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "area_id")
  private Integer id;

  private String name;
  
  @OneToOne(mappedBy = "area")
  private Vacancy vacancy;

  public Area() {}
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
