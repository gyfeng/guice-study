package team.study.guice.providerinterface;

import com.google.inject.AbstractModule;
import team.study.guice.providerannotation.TransactionLog;

/**
 * Created by gyfeng on 16-12-30.
 */
public class ProviderInterfaceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TransactionLog.class).toProvider(DatabaseTransactionLogProvider.class);
    }
}
