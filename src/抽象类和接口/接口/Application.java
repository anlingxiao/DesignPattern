package 抽象类和接口.接口;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c06042 on 2019/12/2.
 */
public class Application {
    private List<Filter> filters=new ArrayList<>();

    public void HandleRpcRequest(RpcRequest req){
        try {
            for (Filter filter:filters) {
                filter.doFilter(req);
            }
        } catch (RpcException e) {
            e.printStackTrace();
        }
    }
}
