package org.example.Stuctural_Pattern.BT2;

public class CryptoAdapter implements PaymentGateway{
    private CryptoAPI cryptoAPI;
    private String wallet;

    public CryptoAdapter(CryptoAPI cryptoAPI, String wallet) {
        this.cryptoAPI = cryptoAPI;
        this.wallet = wallet;
    }

    @Override
    public void pay(double amount) {
        cryptoAPI.transferCrypto(wallet,amount);
    }
}
