package dto;
import lombok.*;
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class AutoDTOLombok {

        private String serialNumber;
        private String manufacture;
        private String model;
        private String year;
        private String fuel;
        private int seats;
        private String carClass;
        private double pricePerDay;
        private String about;
        private String city; //location
        private String image;
    }

