package eg3_z;

import com.google.inject.Provides;
import com.google.inject.Singleton;
import eg3_violating_lod.RPCClient;
import eg3_violating_lod.User;

public class Eg3Module {

    // The User is provided by a GUICE provider
    @Provides
    User getUser(RPCClient rpcClient) {
        return rpcClient.getUser();
    }

    // RPCClient is also provided, and it is no longer
    // a JVM Singleton.
    @Provides
    @Singleton
    RPCClient getRPCClient() {
        // we removed the JVM Singleton
        // and have GUICE manage the scope
        return new RPCClient();
    }

}
