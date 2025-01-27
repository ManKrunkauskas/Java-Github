package Main;

import lt.itakademija.exam.*;
import lt.itakademija.exam.test.BaseTest;
import lt.itakademija.exam.Customer;



public class MyCurrencyTest extends BaseTest {
    @Override
    protected Bank createBank(CurrencyConverter CurrencyConverter) {
        if (CurrencyConverter == null) {
            System.out.println("CurrencyConverter is null!!!");
            return null;
        }
        return new

                Bank() {
                    @Override
                    public Customer createCustomer(PersonCode personCode, PersonName personName) {
                        Customer customer = new MyCustomer(personCode, personName);
                        return customer;
                    }

                    @Override
                    public Account createAccount(Customer customer, Currency currency) {
                        return new Account() {
                            @Override
                            public Customer getCustomer() {
                                return customer;
                            }

                            @Override
                            public Currency getCurrency() {
                                return currency;
                            }
                        };
                    }

                    @Override
                    public Operation transferMoney(Account account, Account account1, Money money) {
                        return new Operation() {
                            @Override
                            public Account getMoney() {
                                return account1;
                            }
                            @Override
                            public Account getmoney() {
                                return account1;
                            }
                            public Money getMoney1() {
                                return money;
                            }
                        };
                    }

                    @Override
                    public Money getBalance(Currency currency) {
                        return Money.currency(currency);
                    }


                };

    }

    @Override
    protected CurrencyConverter createCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        if (currencyRatesProvider == null) {
            System.out.println("CurrencyRatesProvider is null!!!");
            return null;
        }
        return new CurrencyConverter() {
            @Override
            public Money convert(Currency currency, Currency currency1, Money money) {
                return null;
            }
        };
    }

    private static class MyCustomer extends Customer {
        private final PersonCode personCode;
        private final PersonName personName;

        public MyCustomer(PersonCode personCode, PersonName personName) {
            this.personCode = personCode;
            this.personName = personName;
        }

        public PersonCode getPersonCode() {
            return personCode;
        }

        public PersonName getPersonName() {
            return personName;
        }
    }
}


