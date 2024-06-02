package com.pennant.propertystudio.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ApartmentFloorId {
    private int floorIndex;
    private Project project;
}
