package io.nology.iceland.payloads.books;

import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;
import javax.validation.constraints.NotBlank;

public class BookCreate {
    @Getter @Setter @NonNull
    Integer pages;
    @Getter @Setter @NonNull
    Boolean isHardCover;
    @Getter @Setter @NotBlank
    String author;
}
