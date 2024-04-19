package com.shouryashrey.noma.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notification implements Serializable {

    @Serial
    private static final long serialVersionUID = 5100461004011340347L;

    private String title;
    private String message;
    private String subtitle;
    private String imageUrl;
    private Long dispatchTimestamp;

//    add action buttons later
}
