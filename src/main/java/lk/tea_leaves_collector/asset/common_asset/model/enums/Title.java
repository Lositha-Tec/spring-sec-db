package lk.tea_leaves_collector.asset.common_asset.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Title {
    MR("Mr. "),
    MRS("Mrs. "),
    MISS("Miss. "),
    MS("Ms. ");


    private final String title;
}
