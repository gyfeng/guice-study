package team.study.guice.bindingannotations;

import com.google.inject.Inject;

/**
 * @author GYFeng by 2016/12/23
 * @version 1.0
 */
public class BusinessService {
    private final LogService fileLogService;
    private final LogService networkLogService;

    @Inject
    public BusinessService(@FileLog LogService fileLogService, @NetWorkLog LogService networkLogService) {
        this.fileLogService = fileLogService;
        this.networkLogService = networkLogService;
    }

    public void process() {
        fileLogService.log("file log msg");
        networkLogService.log("network log msg");
    }
}
