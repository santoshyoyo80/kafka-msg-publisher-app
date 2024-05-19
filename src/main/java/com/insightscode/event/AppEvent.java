package com.insightscode.event;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppEvent {
    private String name;
    private String ipv4;
    private String ipv6;
    private String agentString;
}
