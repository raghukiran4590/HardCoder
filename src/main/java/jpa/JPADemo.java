package jpa;

//import javax.annotation.processing.Generated;
//import javax.persistence.*;

public class JPADemo {

  /*  @Entity
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public class UserService {
        private EntityManager entityManager;

        public void createUser(String name, String email) {
            User user = new User(name, email);
            entityManager.persist(user);
        }

        public User getUser(Long id) {
            return entityManager.find(User.class, id);
        }

        public void updateUser(Long id, String name, String email) {
            User user = getUser(id);
            if(user != null) {
                user.setEmail(name);
                user.setEmail(email);
                entityManager.merge(user);
            }
        }

        public  void deleteUser(Long id) {
            User user = getUser(id);
            if(user != null) {
                entityManager.remove(user);
            }
        }
    }*/

    public static void main(String[] args) {
        System.out.println("CRUD Operations using JPA");
    }
}
