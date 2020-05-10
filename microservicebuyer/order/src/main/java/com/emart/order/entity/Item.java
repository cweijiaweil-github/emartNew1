package com.emart.order.entity;

import java.io.Serializable;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "tb_item")
public class Item  implements Serializable{

    private static final long serialVersionUID = 1L;

    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // @Column(name = "category_id")
    private Long category_id;

    // @Column(name = "subcategory_id")
    private Long subcategory_id;

    // @Column(name = "price")
    private float price;

    // @Column(name = "item_name")
    private String item_name;

    // @Column(name = "description")
    private String description;

    // @Column(name = "stock_number")
    private Long stock_number;

    // @Column(name = "remarks")
    private String remarks;

    public Item(final Long category_id, final String item_name) {

        this.category_id = category_id;
        this.item_name = item_name;
    }


}