package org.zerock.backend.domain.board.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Board {

    Long id;

    String writer;

    String content;
}
