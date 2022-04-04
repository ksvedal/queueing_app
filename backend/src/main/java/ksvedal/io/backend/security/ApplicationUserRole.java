package ksvedal.io.backend.security;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Roles for user.
 */
public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMINISTRATOR(Sets.newHashSet());

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
