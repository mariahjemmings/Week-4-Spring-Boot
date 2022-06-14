package com.promineotech.jeep.entity;
import java.math.BigDecimal;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Builder
@Data
public class Order {
  private Long orderPK;
  private Customer customer;
  private Jeep model;
  private Color color;
  private Engine engine;
  private Tire tire;
  private BigDecimal price;
  private List<Option>options;

}
