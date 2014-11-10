package eg3_z;

import com.google.inject.Inject;
import eg3_violating_lod.User;

class AccountView {
    User user;

    @Inject
    AccountView(User user) {
        this.user = user;
    }
}

