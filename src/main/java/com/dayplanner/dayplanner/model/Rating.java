package com.dayplanner.dayplanner.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int evaluationSum;

    private String totalRating;
    @OneToMany
    private Set<UserRating> userRatings = new HashSet<>();
    @OneToOne
    private Event event;

    public void setTotalRating(double rating){

        this.totalRating = String.format("%.2f", rating);
    }

    public void setTotalRating(String rating){
        this.totalRating = rating;
    }
}
