package com.vsouhrada.kotlin.playground.default_value;

import java.util.UUID;

/**
 * @author vsouhrada
 */
public class UserInJava {

    private final String uuid;
    private final String name;
    private final Boolean hasAccess;
    private final Boolean isAdmin;
    private final String notes;

    public UserInJava(String uuid, String name, Boolean hasAccess, Boolean isAdmin, String notes) {
        this.uuid = uuid;
        this.name = name;
        this.hasAccess = hasAccess;
        this.isAdmin = isAdmin;
        this.notes = notes;
    }

    public UserInJava(String uuid, String name) {
        this(uuid, name, true, false, "");
    }

    public UserInJava(String name, Boolean hasAccess) {
        this(UUID.randomUUID().toString(), name, hasAccess, false, "");
    }

    // ...
}
