package team.study.guice.bindingannotations;

import javax.inject.Inject;
import javax.inject.Named;


/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public class NamedBusinessService {
    private final LogService fileLogService;
    private final LogService networkLogService;

    @Inject
    public NamedBusinessService(@Named("fileLog") LogService fileLogService, @Named("networkLog") LogService networkLogService) {
        this.fileLogService = fileLogService;
        this.networkLogService = networkLogService;
    }

    public void process() {
        fileLogService.log("file log msg");
        networkLogService.log("network log msg");
    }
}
