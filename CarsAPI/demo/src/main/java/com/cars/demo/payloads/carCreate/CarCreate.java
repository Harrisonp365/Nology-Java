package com.cars.demo.payloads.carCreate;

import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;

public class CarCreate {
    @Getter @Setter @NonNull
    String name;
    @Getter @Setter @NonNull
    String brand;
}
