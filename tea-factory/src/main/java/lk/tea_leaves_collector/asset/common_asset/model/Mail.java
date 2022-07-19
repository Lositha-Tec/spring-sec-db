package lk.tea_leaves_collector.asset.common_asset.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Mail {

  private String from;
  private String mailTo;
  private String subject;
  private String htmlContent;
}
