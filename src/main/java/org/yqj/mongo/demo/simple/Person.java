package org.yqj.mongo.demo.simple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

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
public class Person {
    private ObjectId id;
    private String name;
    private int age;
    private Address address;
}
