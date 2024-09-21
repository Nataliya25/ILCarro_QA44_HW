package dto;
import lombok.*;
public class AutoDTOLombok {


    @Getter
    @Setter
    @Builder
    @ToString
    @NoArgsConstructor
    @AllArgsConstructor

    public class autoDTOLombok {

        private String address;
        private String manufacture;
        private String model;
        private String year;
        private String fuel;
        private String seats;
        private String clas;
        private String registrNumber;
        private String price;
    }
}
