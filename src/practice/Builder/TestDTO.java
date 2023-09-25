package practice.Builder;

import java.time.LocalDate;


public class TestDTO {

    public static void main(String[] args) {

        UserDTO.UserDTOBuilder builder = new UserDTO.UserDTOBuilder();
        UserDTO userDTO =
                builder.withBirthday(LocalDate.now().minusYears(24)).withFirstName("Dhairya").withLastName("Parekh").build();
        System.out.println(userDTO.toString());
    }


}
