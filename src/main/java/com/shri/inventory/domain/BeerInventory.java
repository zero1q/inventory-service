/*
 *  Created by zeeroiq on 9/15/20, 12:13 AM.
 */

package com.shri.inventory.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class BeerInventory extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -3733555557522669818L;

    @Type(type="org.hibernate.type.UUIDCharType")
    @Column(length = 40, columnDefinition = "varchar(40)", updatable = false, nullable = false )
    private UUID beerId;
    private String upc;
    private Integer quantityOnHand = 0;
}
