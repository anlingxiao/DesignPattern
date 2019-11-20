import java.math.BigDecimal;

/**
 * Created by c06042 on 2019/11/20.
 * 封装思想
 */
public class Wallet {
    private String id;
    private long createTime;
    private BigDecimal balance;
    private long balanceLastModifiedTime;

    public Wallet() {
        //this.id=IdGenerator.getInstance().generate();
        this.createTime=System.currentTimeMillis();
        this.balance=BigDecimal.ZERO;
        this.balanceLastModifiedTime=System.currentTimeMillis();
    }
    public String getId(){return this.id;}
    public long getCreateTime(){return this.createTime;}
    public BigDecimal getBalance(){return this.balance;}
    public long getBalanceLastModifiedTime(){return this.balanceLastModifiedTime;}

    public void increaseBalance(BigDecimal increaseAmount){
        if (increaseAmount.compareTo(BigDecimal.ZERO)<0){
            //throw new InvalidAmountException("...");
        }
        this.balance.add(increaseAmount);
        this.balanceLastModifiedTime=System.currentTimeMillis();
    }

    public void decreaseBalance(BigDecimal decreaseAmount){
        if (decreaseAmount.compareTo(BigDecimal.ZERO)<0){
            //throw new InvalidAmountExpection("...");
        }
        if (decreaseAmount.compareTo(this.balance)>0){
            //throw new InsufficientAmountExpection("...");
        }
        this.balance.subtract(decreaseAmount);
        this.balanceLastModifiedTime=System.currentTimeMillis();
    }
}
