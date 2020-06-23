package com.yousushare.modules.express.base;


import lombok.*;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * 联合主键
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode
public class KdgAllStateFeedbackKey implements Serializable {

    private String sfIp;

    private String sfCurrentTimeMillis;

    private Integer elCode;

    private Integer boxCode;
}
