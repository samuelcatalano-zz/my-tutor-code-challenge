package co.uk.mytutor.code.challenge.codechallenge.model;

import co.uk.mytutor.code.challenge.codechallenge.model.base.BaseEntity;
import lombok.*;

import java.util.List;

/**
 * @author Samuel Catalano
 * @since Feb 28, 2020
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class BookShop extends BaseEntity {

    private Double ballance;
    private List<Book> books;

}
