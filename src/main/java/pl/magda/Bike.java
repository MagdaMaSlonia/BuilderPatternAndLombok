package pl.magda;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Bike {
    private String rama;
    private String kierownica;
    private String kola;
    private String siodelko;
}
