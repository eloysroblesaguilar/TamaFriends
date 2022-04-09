package com.egrasoft.tamafriends.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, length = 30, unique = true)
        private String username;

        @Column(nullable = false, unique = true)
        private String email;

        @Column(nullable = false)
        private String password;

        @Column(length = 50)
        private String firstName;

        @Column(length = 50)
        private String lastName;

        @Column
        private Boolean isAdmin;

        @Column
        @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
        private List<Friend> friends;

        public User() {
        }



        public User(String username, String email, String password, String firstName, String lastName, Boolean isAdmin, List<Friend> friends) {
                this.username = username;
                this.email = email;
                this.password = password;
                this.firstName = firstName;
                this.lastName = lastName;
                this.isAdmin = isAdmin;
                this.friends = friends;
        }

        public User(Long id, String username, String email, String password, String firstName, String lastName, Boolean isAdmin, List<Friend> friends) {
                this.id = id;
                this.username = username;
                this.email = email;
                this.password = password;
                this.firstName = firstName;
                this.lastName = lastName;
                this.isAdmin = isAdmin;
                this.friends = friends;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public Boolean getAdmin() {
                return isAdmin;
        }

        public void setAdmin(Boolean admin) {
                isAdmin = admin;
        }

        public List<Friend> getFriends() {
                return friends;
        }

        public void setFriends(List<Friend> friends) {
                this.friends = friends;
        }
}
