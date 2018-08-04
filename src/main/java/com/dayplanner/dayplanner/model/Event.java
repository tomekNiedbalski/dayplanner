package com.dayplanner.dayplanner.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date eventDate;

    @OneToOne
    private Location location;

    private Double price;

    private CostRange costRangeType;

    private String eventDescription;

    @OneToMany
    private Set<Tag> eventTags = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    private Rating eventRating;


}
