package com.ironbank.moneyraven.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component //? надо ли?
@ConfigurationProperties("ironbank")
public class PredskazProperties {
    List<String> whoseWhoRepayDebts;

}
