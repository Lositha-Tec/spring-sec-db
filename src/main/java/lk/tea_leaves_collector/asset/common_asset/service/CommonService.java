package lk.tea_leaves_collector.asset.common_asset.service;

import lk.tea_leaves_collector.util.service.MakeAutoGenerateNumberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommonService {
  private final MakeAutoGenerateNumberService makeAutoGenerateNumberService;


  public String commonMobileNumberLengthValidator(String mobileTwo) {
    return mobileTwo;
  }


}
