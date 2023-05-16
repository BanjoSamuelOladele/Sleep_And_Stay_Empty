import java.math.BigDecimal;

public class AccountReference {
    public AccountReference(String name) {
        this.name = name;
    }

    private String name;
    private BigDecimal balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    @Override
    public String toString(){
        return "Account{\n Name: " +name+"\n Balance: "+ balance +"}";
    }
}
