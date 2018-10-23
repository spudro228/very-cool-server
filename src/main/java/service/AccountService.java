package service;

import entity.Accaunt;

import java.util.Hashtable;

final public class AccountService {
    private Hashtable<String, String> accountTable;

    public AccountService(Hashtable<String, String> accaunts) {
        accountTable = accaunts;
    }

    public AccountService() {
        accountTable = new Hashtable<String, String>();
    }

    public boolean registrate(Accaunt notRegisteredAccount) {
        if (!accountTable.containsKey(notRegisteredAccount.getLogin())) {
            return false;
        }

        accountTable.put(notRegisteredAccount.getLogin(), notRegisteredAccount.getPassword());
        return true;
    }

    public boolean login(Accaunt accaunt) {
        throw new RuntimeException("\nMethod not implemented.\n");
    }

    public void addAccaunt(Accaunt accaunt) {
        accountTable.put(accaunt.getLogin(), accaunt.getPassword());
    }
}
