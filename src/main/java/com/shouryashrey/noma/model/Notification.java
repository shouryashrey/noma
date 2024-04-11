package com.shouryashrey.noma.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    private String title;
    private String message;
    private String subtitle;
    private String imageUrl;
    private Long dispatchTimestamp;

//    add action buttons later
}
