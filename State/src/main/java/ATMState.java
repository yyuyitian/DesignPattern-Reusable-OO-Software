public interface ATMState {
    public void insertCard();
    public void ejectCard();
    public void inputPin(String pin);
    public void getCash();
    public void putCash();
}
