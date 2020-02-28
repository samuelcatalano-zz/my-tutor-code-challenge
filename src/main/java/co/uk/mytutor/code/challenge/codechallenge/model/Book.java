package co.uk.mytutor.code.challenge.codechallenge.model;

import co.uk.mytutor.code.challenge.codechallenge.enums.BookType;
import co.uk.mytutor.code.challenge.codechallenge.model.base.BaseEntity;
import lombok.*;

/**
 * @author Samuel Catalano
 * @since Feb 28, 2020
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Book extends BaseEntity {

    private BookType type;
    private Double price;
    private Integer quantity;
    private Integer copiesSold;
    private Double profit;

}