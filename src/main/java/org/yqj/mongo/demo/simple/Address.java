package org.yqj.mongo.demo.simple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2018/10/19
 * Email: qijunyao@xiaohongshu.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String street;
    private String city;
    private String zip;
}
