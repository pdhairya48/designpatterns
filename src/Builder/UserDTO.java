package Builder;

import java.time.LocalDate;
import java.time.Period;


//Product class
public class UserDTO {

    private String name;


    private String age;

    public String getName() {
        return name;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("UserDTO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }


    private void setAge(String age) {
        this.age = age;
    }


    //Get builder instance
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }
    //Builder
    public static class UserDTOBuilder {

        private String firstName;

        private String lastName;

        private String age;


        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public UserDTOBuilder withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }


        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName+" " + lastName);
            userDTO.setAge(age);
            return this.userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }
    }
}
