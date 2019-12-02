package 抽象类和接口.接口;

/**
 * Created by c06042 on 2019/12/2.
 */
//接口实现类：限流过滤器
public class RateLimitFilter implements Filter {
    @Override
    public void doFilter(RpcRequest req) throws RpcException {
        //限流逻辑
    }
}
