package com.kainos.engineering.skjavaspringbootrest.dto;

import lombok.*;

import java.io.Serializable;

@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public final class Greeting implements Serializable {
    private final long id;
    private final String content;
}
