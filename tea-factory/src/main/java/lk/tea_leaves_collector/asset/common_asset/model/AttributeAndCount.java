package lk.tea_leaves_collector.asset.common_asset.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AttributeAndCount {
  private String name;
  private int count;
}
