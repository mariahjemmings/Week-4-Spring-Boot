package com.promineotech.jeep.entity;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Engine {
  
  private Long enginePK;
  private String engineId;
  private float sizeInLiters;
  private String name;
  private FuelType fuelType;
  private float mpgCity;
  private float mpgHwy;
  private boolean hasStartStop;
  private String description;
  private BigDecimal price;
  

}
