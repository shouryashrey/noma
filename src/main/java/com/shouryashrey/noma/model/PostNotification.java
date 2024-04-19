package com.shouryashrey.noma.model;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostNotification implements Serializable {

    @Serial
    private static final long serialVersionUID = 5100461004011340854L;

    private Long timestamp;
    private List<Notification> notificationList;

}
