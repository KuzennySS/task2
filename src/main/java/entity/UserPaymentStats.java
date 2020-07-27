package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPaymentStats {

    private Integer maxAmountCategoryId;

    private Integer minAmountCategoryId;

    private Integer oftenCategoryId;

    private Integer rareCategoryId;

}
