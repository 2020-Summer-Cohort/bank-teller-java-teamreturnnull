package teller;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Set;


public class Bank {
    Map<String, Account> accounts = new HashMap<>();


    Set<String> accountNames = accounts.keySet();

    Collection<Double> allAccounts = accounts.values();
        System.out.println("all the accounts are "+allAccounts);
}



