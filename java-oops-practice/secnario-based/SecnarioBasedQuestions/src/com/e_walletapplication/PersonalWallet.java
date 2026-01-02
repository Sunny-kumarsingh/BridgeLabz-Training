package com.e_walletapplication;

public class PersonalWallet extends Wallet {

    PersonalWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    void transferTo(User receiver, double amount) {

        double tax = amount * 0.02;   // 2% charge
        double total = amount + tax;

        if (debit(total)) {
            receiver.wallet.credit(amount);
            history.add(new Transaction(
                "Transfer to " + receiver.name, amount
            ));
        } else {
            System.out.println("Insufficient balance in Personal Wallet");
        }
    }
}
