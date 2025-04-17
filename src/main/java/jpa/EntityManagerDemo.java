package jpa;

//import javax.persistence.*;
//import java.util.Date;

public class EntityManagerDemo {

/*    @Entity // Marks the class as an entity.
    @Entity
@   Table(name = "users", schema = "public") // Specifies the table name
    public class User {

        @Id // Specifies the primary key field.
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the primary key generation strategy.
        private Long id;

        @Column(name = "user_name", nullable = false, length = 50)
        private String name;

        @Column(name = "email", nullable = false, unique = true) // Maps a field to a column in the database
        private String email;

        @Temporal(TemporalType.DATE) // Specifies the temporal type (DATE, TIME, or TIMESTAMP)
        private Date birthDate;

        @Enumerated(EnumType.STRING) // Specifies that a field is an enumeration type.
        private Status status;

        @Lob // Specifies that a field should be treated as a large object (BLOB or CLOB).
        private byte[] profilePicture;

        @Transient // Indicates that a field is not persistent and should not be mapped to a database column.
        private String temporaryData;

        // Getters and setters

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

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public byte[] getProfilePicture() {
            return profilePicture;
        }

        public void setProfilePicture(byte[] profilePicture) {
            this.profilePicture = profilePicture;
        }

        public String getTemporaryData() {
            return temporaryData;
        }

        public void setTemporaryData(String temporaryData) {
            this.temporaryData = temporaryData;
        }
    }

    enum Status {
        ACTIVE,
        INACTIVE
    }
    */
    public static void main(String[] args) {
        System.out.println("EntityManager Demo");
    }
}
