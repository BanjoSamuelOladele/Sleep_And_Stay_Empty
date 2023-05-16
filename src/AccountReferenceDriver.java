import javax.xml.namespace.QName;

public class AccountReferenceDriver {
    public static void main(String[] args) {
        AccountReferenceDriver driver = new AccountReferenceDriver();
        AccountReference account = new AccountReference("Dleex");
        System.out.println("In the main "+ account);
        driver.nameChanged(account);
        System.out.println("in the namechanged method"+ account);
    }
    public void nameChanged(AccountReference account){
        account.setName("Dele");
    }
}
