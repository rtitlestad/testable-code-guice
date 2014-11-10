package eg3_violating_lod;

// Violates the Law of Demeter
// Brittle because of excessive dependencies
// Mixes object lookup with assignment
class AccountView {
    User user;
    AccountView() {
        user = RPCClient.getInstance().getUser();
    }
}
