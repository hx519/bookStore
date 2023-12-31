package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="myorder")
public class MyOrder {
    @Id
    @Column(name = "oid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;
    private Long uid;
    private String year;
    private String month;
    private String day;
    private String hour;
    private String minute;
    private String price;
    private String username;
    @ManyToOne
    @JoinColumn(name = "uid", insertable = false, updatable = false)
    private User user;
//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//    private List<OrderItem> orderItems;

//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//    private List<OrderItem> orderItems;

    public void setUid(Long uid) {
        this.uid = uid;
    }

//    public void setUser(User user) {
//        this.user = user;
//        this.uid = user.getUid();
//    }
}


