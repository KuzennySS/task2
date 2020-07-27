package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPaymentAnalytic {

    private PaymentCategoryInfo analyticInfo;

    private Integer totalSum;

    private String userId;

}
